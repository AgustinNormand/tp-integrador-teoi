package com.tpi.teoi;

import dnl.utils.text.table.TextTable;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class InterfazCompilador extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private FileReader fr;
	private File archivo;
	ArrayList<String> rejected;
	ArrayList<String> rejected2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCompilador frame = new InterfazCompilador();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //maximizar 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public InterfazCompilador() {
		setResizable(true);
        setTitle("Interfaz Gráfica Compilador - Grupo 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 544, 642);
        setSize(1221,1348);
        setLocationRelativeTo(null); //centrado.
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{245, 419, 0, 0, 0};
        gbl_contentPane.rowHeights = new int[]{40, 26, 0, 0, 23, 23, 0, 0, 0, 16, 89, 26, 0, 0, 159, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);
                
        JLabel lblNombreDelArchivo = new JLabel("Archivo de entrada");
        GridBagConstraints gbc_lblNombreDelArchivo = new GridBagConstraints();
        gbc_lblNombreDelArchivo.anchor = GridBagConstraints.SOUTHWEST;
        gbc_lblNombreDelArchivo.insets = new Insets(0, 0, 5, 5);
        gbc_lblNombreDelArchivo.gridx = 0;
        gbc_lblNombreDelArchivo.gridy = 0;
        contentPane.add(lblNombreDelArchivo, gbc_lblNombreDelArchivo);
               
        txtNombre = new JTextField();
        GridBagConstraints gbc_txtNombre = new GridBagConstraints();
        gbc_txtNombre.gridwidth = 5;
        gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
        gbc_txtNombre.gridx = 0;
        gbc_txtNombre.gridy = 1;
        contentPane.add(txtNombre, gbc_txtNombre);
        txtNombre.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Salida Sintactica");
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridx = 2;
        gbc_lblNewLabel.gridy = 2;
        contentPane.add(lblNewLabel, gbc_lblNewLabel);
                        
        final TextArea txaArchivo = new TextArea();
        GridBagConstraints gbc_txaArchivo = new GridBagConstraints();
        gbc_txaArchivo.gridwidth = 2;
        gbc_txaArchivo.fill = GridBagConstraints.BOTH;
        gbc_txaArchivo.insets = new Insets(0, 0, 5, 5);
        gbc_txaArchivo.gridx = 0;
        gbc_txaArchivo.gridy = 3;
        contentPane.add(txaArchivo, gbc_txaArchivo);
        
        final TextArea textArea = new TextArea();
        GridBagConstraints gbc_textArea = new GridBagConstraints();
        gbc_textArea.gridwidth = 5;
        gbc_textArea.fill = GridBagConstraints.BOTH;
        gbc_textArea.insets = new Insets(0, 0, 5, 0);
        gbc_textArea.gridx = 2;
        gbc_textArea.gridy = 3;
        contentPane.add(textArea, gbc_textArea);
        
        JButton btnAbrirArchivo = new JButton("Abrir archivo");
        btnAbrirArchivo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (txtNombre.getText().isEmpty())
        		{
        			JFileChooser fc = new JFileChooser();
        			fc.showOpenDialog(null);
        			archivo = fc.getSelectedFile();
        			String nombre = archivo.getName();
        			txtNombre.setText(archivo.getAbsolutePath());
        		} else
            		{archivo = new File(txtNombre.getText());}
        		
        		try {
        			fr = new FileReader(archivo);
        			BufferedReader br = new BufferedReader(fr);
        			String texto = "";
        			String linea = "";
        			while ((linea = br.readLine()) != null) {
        				texto += linea + "\n";
        			}
        			txaArchivo.setText(texto);
        		} catch (Exception ex) {
                	   
        		}
            }
        });
        
        GridBagConstraints gbc_btnAbrirArchivo = new GridBagConstraints();
        gbc_btnAbrirArchivo.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnAbrirArchivo.insets = new Insets(0, 0, 5, 5);
        gbc_btnAbrirArchivo.gridx = 5;
        gbc_btnAbrirArchivo.gridy = 1;
        contentPane.add(btnAbrirArchivo, gbc_btnAbrirArchivo);
                
        JButton btnGuardarArchivo = new JButton("Guardar");
        btnGuardarArchivo.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	String absolutePath = txtNombre.getText();
        	FileWriter fw = null;
        	try {
	       		fw = new FileWriter(absolutePath);
	       	}catch(Exception ex) {
	       	}
	      
	       	try {
	       		BufferedWriter bw = new BufferedWriter(fw);
	       		bw.write(txaArchivo.getText());
	       		bw.close();
	       		JOptionPane.showMessageDialog(null, "Archivo guardado.");
        	}catch (Exception ex){
	        }
        }
	    });
                        
        GridBagConstraints gbc_btnGuardarArchivo = new GridBagConstraints();
        gbc_btnGuardarArchivo.gridwidth = 1;
        gbc_btnGuardarArchivo.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnGuardarArchivo.insets = new Insets(0, 0, 5, 0);
        gbc_btnGuardarArchivo.gridx = 6;
        gbc_btnGuardarArchivo.gridy = 1;
        contentPane.add(btnGuardarArchivo, gbc_btnGuardarArchivo);
        
        JLabel lblCodigoDePrueba = new JLabel("Codigo de entrada");
        lblCodigoDePrueba.setFont(new Font("Tahoma", Font.PLAIN, 13));
        GridBagConstraints gbc_lblCodigoDePrueba = new GridBagConstraints();
        gbc_lblCodigoDePrueba.anchor = GridBagConstraints.WEST;
        gbc_lblCodigoDePrueba.insets = new Insets(0, 0, 5, 5);
        gbc_lblCodigoDePrueba.gridx = 0;
        gbc_lblCodigoDePrueba.gridy = 2;
        contentPane.add(lblCodigoDePrueba, gbc_lblCodigoDePrueba);
        
       
        GridBagConstraints gbc_resultadoAnalisis = new GridBagConstraints();
        gbc_resultadoAnalisis.gridheight = 7;
        gbc_resultadoAnalisis.insets = new Insets(0, 0, 5, 0);
        gbc_resultadoAnalisis.fill = GridBagConstraints.BOTH;
        gbc_resultadoAnalisis.gridwidth = 7;
        gbc_resultadoAnalisis.gridx = 0;
        gbc_resultadoAnalisis.gridy = 5;
        
        /* 
         * Seteo de la tabla de simbolos principal - solo se muestran CONST y IDs
         */
        String[] nombreColumnas = {"N", "Name", "Token", "Type", "Value", "Long"};
        final JTable tabla_simbolos = new JTable();
        DefaultTableModel contactTableModel = (DefaultTableModel) tabla_simbolos.getModel();
        contactTableModel.setColumnIdentifiers(nombreColumnas);
        tabla_simbolos.getColumn(nombreColumnas[0]).setMinWidth(30);
        tabla_simbolos.getColumn(nombreColumnas[0]).setMaxWidth(30);
        tabla_simbolos.getColumn(nombreColumnas[1]).setPreferredWidth(200);
        tabla_simbolos.getColumn(nombreColumnas[2]).setPreferredWidth(100);
        tabla_simbolos.getColumn(nombreColumnas[3]).setPreferredWidth(30);
        tabla_simbolos.getColumn(nombreColumnas[4]).setPreferredWidth(100);
        tabla_simbolos.getColumn(nombreColumnas[5]).setPreferredWidth(30);
        tabla_simbolos.setAutoCreateRowSorter(true);
        TableRowSorter<DefaultTableModel> rowSorter = (TableRowSorter<DefaultTableModel>)tabla_simbolos.getRowSorter();
                 
        /* 
         * Seteo de la tabla secundaria que muestra todos los Lexemas/Token 
         */
        
        String[] nombreColumnasLex = {"N", "Lexema", "Token"};
        final JTable tabla_lexemas = new JTable();
        DefaultTableModel contactTableModelLex = (DefaultTableModel) tabla_lexemas.getModel();
        contactTableModelLex.setColumnIdentifiers(nombreColumnasLex);
        tabla_lexemas.getColumn(nombreColumnasLex[0]).setMinWidth(30);
        tabla_lexemas.getColumn(nombreColumnasLex[0]).setMaxWidth(30);
        tabla_lexemas.getColumn(nombreColumnasLex[1]).setPreferredWidth(200);
        tabla_lexemas.getColumn(nombreColumnasLex[2]).setPreferredWidth(100);
        tabla_lexemas.setAutoCreateRowSorter(true);
        TableRowSorter<DefaultTableModel> rowSorterLex = (TableRowSorter<DefaultTableModel>) tabla_lexemas.getRowSorter();
        
        /*
         * 
         */
        class IntComparator implements Comparator {
            public int compare(Object o1, Object o2) {
                Integer int1 = (Integer)o1;
                Integer int2 = (Integer)o2;
                return int1.compareTo(int2);
            }

            public boolean equals(Object o2) {
                return this.equals(o2);
            }
        }

        rowSorter.setComparator(0, new IntComparator());
        rowSorterLex.setComparator (0, new IntComparator());
                                                         
        JLabel lblResutadosDelAnlisis = new JLabel("Tabla de símbolos - Constantes y Variables");
        lblResutadosDelAnlisis.setFont(new Font("Tahoma", Font.PLAIN, 13));
        GridBagConstraints gbc_lblResutadosDelAnlisis = new GridBagConstraints();
        gbc_lblResutadosDelAnlisis.fill = GridBagConstraints.HORIZONTAL;
        gbc_lblResutadosDelAnlisis.insets = new Insets(0, 0, 5, 5);
        gbc_lblResutadosDelAnlisis.gridx = 0;
        gbc_lblResutadosDelAnlisis.gridy = 4;
        contentPane.add(lblResutadosDelAnlisis, gbc_lblResutadosDelAnlisis);
                
        final JButton btnNewButton = new JButton("Rechazados");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, rejected);
            }
        });
       
        GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
        gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
        gbc_btnNewButton.gridx = 4;
        gbc_btnNewButton.gridy = 4;
        contentPane.add(btnNewButton, gbc_btnNewButton);
        btnNewButton.setVisible(false);
        
        /*
         * Funcionamiento del botón Ejecutar - análisis. 
         */
        JButton btnRealizarAnalisis = new JButton("Ejecutar Analizador Lexico");
        btnRealizarAnalisis.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
                   Lexico Lexer = new Lexico(new StringReader(txaArchivo.getText()));
                   parser sintactico = new parser(Lexer);


                   /*probando */
                   sintactico.parse(); /*- si este parse se hace despues del next_token, no compila los resultados de las tablas*/
                   textArea.setText(""); 
                   for (int i = 0; i < sintactico.listaReglas.size(); i++) { /*recorre la lista de reglas en el Parser y muestra en textArea*/
                	  // textArea.setText(par.listaReglas.get(i) + "\n");
               			textArea.appendText(sintactico.listaReglas.get(i) + "\n");
               		}
                       
                                   
                   Lexer.next_token();
                   
                   /* Code to update table */
                   DefaultTableModel model = (DefaultTableModel) tabla_simbolos.getModel();
                   DefaultTableModel modelex = (DefaultTableModel) tabla_lexemas.getModel();
                   model.setRowCount(0);
                   modelex.setRowCount(0);
                   
                   ArrayList<SymbolMe> symbols_table = Lexer.get_result();
                   ArrayList<SymbolMe> lexemas_table = Lexer.get_result_lexemas();
                   rejected = Lexer.get_rejected();
                   
                   if (rejected.size() > 0)
                	   btnNewButton.setVisible(true);
                   else
                	   btnNewButton.setVisible(false);
                   
                   for (SymbolMe s : symbols_table) {
                	   model.addRow(new Object[]{Integer.valueOf(s.getOrder()), s.getName(), s.getToken(), s.getType(), s.getValue(), String.valueOf(s.getSize())});
                   }
                   
                   for (SymbolMe l : lexemas_table) {
                	   modelex.addRow(new Object[]{Integer.valueOf(l.getOrder()), l.getValue(), l.getToken()} );
                   }
                    
                   tabla_simbolos.setModel(model);
                   tabla_simbolos.repaint();
                   tabla_lexemas.setModel(modelex);
                   tabla_lexemas.repaint();
                   
               		/* Carga de tabla al archivo ts.txt en la carpeta del proyecto*/
                   
                   if ((symbols_table.isEmpty() == true) && (lexemas_table.isEmpty() == true)) {
                	   
                	   /* Si todos son rechazados no se genera archivo de la tabla de simbolos  */
                   }else {
                   		String ruta ="ts.txt";
                   		File file = new File(ruta);
                   		file.createNewFile();
                   		FileWriter fw = new FileWriter(file);
                        PrintStream writetoEngineer = new PrintStream(
                               new FileOutputStream("ts.txt", true));

                        TextTable tt = new TextTable(model);
                        tt.printTable(writetoEngineer,0);
                   		//JOptionPane.showMessageDialog(null, "Se generó un archivo ts.txt");
                   	}
        		} catch (Exception ex) {
        			JOptionPane.showMessageDialog(null, ex.toString());
        		}      		
        	}
        });
        
        /*
         *      
         */
        
        GridBagConstraints gbc_btnRealizarAnalisis = new GridBagConstraints();
        gbc_btnRealizarAnalisis.gridwidth = 2;
        gbc_btnRealizarAnalisis.insets = new Insets(0, 0, 5, 0);
        gbc_btnRealizarAnalisis.gridx = 5;
        gbc_btnRealizarAnalisis.gridy = 4;
        contentPane.add(btnRealizarAnalisis, gbc_btnRealizarAnalisis);
        
        tabla_simbolos.setRowSorter(rowSorter);
        JScrollPane panel1 = new JScrollPane(tabla_simbolos);
        contentPane.add(panel1, gbc_resultadoAnalisis);
                                
        JLabel lblSalida = new JLabel("Salida del Analizador");
        GridBagConstraints gbc_lblSalida = new GridBagConstraints();
        gbc_lblSalida.fill = GridBagConstraints.HORIZONTAL;
        gbc_lblSalida.insets = new Insets(0, 0, 5, 5);
        gbc_lblSalida.gridx = 0;
        gbc_lblSalida.gridy = 13;
        contentPane.add(lblSalida, gbc_lblSalida);
                        
        tabla_lexemas.setRowSorter(rowSorterLex);
        JScrollPane panel2 = new JScrollPane(tabla_lexemas);
        
        GridBagConstraints gbc_resultadoAnalisisTotal = new GridBagConstraints();
        gbc_resultadoAnalisisTotal.gridwidth = 7;
        gbc_resultadoAnalisisTotal.insets = new Insets(0, 0, 5, 0);
        gbc_resultadoAnalisisTotal.fill = GridBagConstraints.BOTH;
        gbc_resultadoAnalisisTotal.gridx = 0;
        gbc_resultadoAnalisisTotal.gridy = 14;
        contentPane.add(panel2, gbc_resultadoAnalisisTotal);
    }
}
