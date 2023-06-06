package com.tpi.asm;

import com.tpi.teoi.SymbolMe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CargarTS {
    private ArrayList<SymbolMe> symbols_table;
    private List<String> nombres;
    public CargarTS(ArrayList<SymbolMe> symbols_table) {
        this.symbols_table = symbols_table;
    }

    public void generarASM(){
        String result = "";

        for (SymbolMe s : symbols_table) {
            String line = "";
            String value = "";
            String type = "dd"; //Default Value
            String name = s.getName(); //Default Value
            if (s.getValue() == "---"){
                value = "?";
                name = "_" + name;
            }else
                value = s.getValue();

            if (s.getType().equals("FLOAT")){
                type = "dd";
            }
            if (s.getType().equals("INT")){
                type = "dd";
            }

            if (s.getToken().equals("CONST_STRING")) {
                type = "db";
                value = "\"" + value + "$\"";
            }
            if (s.getToken().equals("CONST_FLOAT")) {
                name = name.replace(".", "@punto");
            }
            if (s.getToken().equals("CONST_INT")) {
                value = value + ".0";
            }

            line = name + " " + type + " " + value;

            result += line + "\n";
        }


        ConstanteDataASM.data.append(result);
    }
}
