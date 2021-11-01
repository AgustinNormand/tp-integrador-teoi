/* The following code was generated by JFlex 1.7.0 */

package com.tpi.teoi;
import java_cup.runtime.Symbol;
import java_cup.runtime.*; //para utilizar cup
import java.util.*;




/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Lexico.flex</tt>
 */
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\42\1\43\1\42\1\42\22\0\1\4\1\0\1\62"+
    "\5\0\1\65\1\66\1\6\1\56\1\57\1\55\1\60\1\5\12\2"+
    "\1\71\1\61\1\37\1\36\1\35\2\0\1\26\1\1\1\45\1\34"+
    "\1\44\1\23\1\17\1\53\1\7\1\1\1\54\1\24\1\51\1\10"+
    "\1\25\1\50\1\1\1\16\1\15\1\11\2\1\1\52\3\1\1\63"+
    "\1\0\1\64\1\0\1\3\1\0\1\32\1\1\1\41\1\33\1\40"+
    "\1\27\1\22\1\53\1\12\1\1\1\54\1\30\1\47\1\13\1\31"+
    "\1\46\1\1\1\21\1\20\1\14\2\1\1\52\3\1\1\67\1\0"+
    "\1\70\7\0\1\43\u1fa2\0\1\43\1\43\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\15\2"+
    "\1\7\1\10\1\11\5\2\1\12\1\13\1\14\1\15"+
    "\1\1\1\16\1\17\1\20\1\21\1\22\1\23\1\1"+
    "\2\0\1\2\1\24\5\2\1\25\5\2\1\26\1\10"+
    "\1\27\1\30\7\2\1\0\1\31\1\32\1\0\1\33"+
    "\1\0\1\34\4\2\1\35\12\2\1\36\1\0\1\37"+
    "\10\2\1\40\6\2\1\0\2\2\1\41\10\2\1\42"+
    "\1\43\1\44\1\45\20\2\1\0\1\2\1\0\5\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\5\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\5\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\2\2\46\1\0\1\2\1\0"+
    "\1\2\1\0\1\2\1\0\1\2\2\47\1\0\1\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\2\50\2\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[270];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\164\0\256\0\72\0\350\0\72\0\u0122"+
    "\0\u015c\0\u0196\0\u01d0\0\u020a\0\u0244\0\u027e\0\u02b8\0\u02f2"+
    "\0\u032c\0\u0366\0\u03a0\0\u03da\0\u0414\0\u044e\0\u0488\0\u04c2"+
    "\0\u04fc\0\u0536\0\u0570\0\u05aa\0\u05e4\0\72\0\72\0\72"+
    "\0\u061e\0\72\0\72\0\72\0\72\0\72\0\72\0\u0658"+
    "\0\u0692\0\u06cc\0\u0706\0\164\0\u0740\0\u077a\0\u07b4\0\u07ee"+
    "\0\u0828\0\164\0\u0862\0\u089c\0\u08d6\0\u0910\0\u094a\0\72"+
    "\0\72\0\72\0\72\0\u0984\0\u09be\0\u09f8\0\u0a32\0\u0a6c"+
    "\0\u0aa6\0\u0ae0\0\u061e\0\72\0\72\0\u0b1a\0\u0692\0\u0b54"+
    "\0\164\0\u0b8e\0\u0bc8\0\u0c02\0\u0c3c\0\164\0\u0c76\0\u0cb0"+
    "\0\u0cea\0\u0d24\0\u0d5e\0\u0d98\0\u0dd2\0\u0e0c\0\u0e46\0\u0e80"+
    "\0\72\0\u0eba\0\164\0\u0ef4\0\u0f2e\0\u0f68\0\u0fa2\0\u0fdc"+
    "\0\u1016\0\u1050\0\u108a\0\164\0\u10c4\0\u10fe\0\u1138\0\u1172"+
    "\0\u11ac\0\u11e6\0\u1220\0\u125a\0\u1294\0\164\0\u12ce\0\u1308"+
    "\0\u1342\0\u137c\0\u13b6\0\u13f0\0\u142a\0\u1464\0\164\0\164"+
    "\0\72\0\164\0\u149e\0\u14d8\0\u1512\0\u154c\0\u1586\0\u15c0"+
    "\0\u15fa\0\u1634\0\u166e\0\u16a8\0\u16e2\0\u171c\0\u1756\0\u1790"+
    "\0\u17ca\0\u1804\0\u183e\0\u1878\0\u18b2\0\u18ec\0\u1926\0\u1960"+
    "\0\u199a\0\u19d4\0\u1a0e\0\u1a48\0\u1a82\0\u1abc\0\u1af6\0\u1b30"+
    "\0\u1b6a\0\u1ba4\0\u1bde\0\u1c18\0\u1c52\0\u1c8c\0\u1cc6\0\u1d00"+
    "\0\u1d3a\0\u1d74\0\u1dae\0\u1de8\0\u1e22\0\u1e5c\0\u1e96\0\u1ed0"+
    "\0\u1f0a\0\u1f44\0\u1f7e\0\u1fb8\0\u1ff2\0\u202c\0\u2066\0\u20a0"+
    "\0\u20da\0\u2114\0\u214e\0\u2188\0\u21c2\0\u21fc\0\u2236\0\u2270"+
    "\0\u22aa\0\u22e4\0\u231e\0\u2358\0\u2392\0\u23cc\0\u2406\0\u2440"+
    "\0\u247a\0\u24b4\0\u24ee\0\u2528\0\u2562\0\u259c\0\u25d6\0\u2610"+
    "\0\u264a\0\u2684\0\u26be\0\u26f8\0\u2732\0\u276c\0\u27a6\0\u27e0"+
    "\0\u281a\0\u2854\0\u288e\0\u28c8\0\u2902\0\u293c\0\u2976\0\u29b0"+
    "\0\u29ea\0\u2a24\0\u2a5e\0\u2a98\0\u2ad2\0\u2b0c\0\u2b46\0\u2b80"+
    "\0\u2bba\0\u2bf4\0\u2c2e\0\u2c68\0\u2ca2\0\u2cdc\0\u2d16\0\u2d50"+
    "\0\u2d8a\0\u2dc4\0\u2dfe\0\u2e38\0\u2e72\0\u2eac\0\72\0\164"+
    "\0\u2ee6\0\u2f20\0\u2f5a\0\u2f94\0\u2fce\0\u3008\0\u3042\0\u307c"+
    "\0\72\0\164\0\u30b6\0\u30f0\0\u312a\0\u3164\0\u319e\0\u31d8"+
    "\0\u3212\0\u324c\0\u3286\0\u32c0\0\u32fa\0\u3334\0\u336e\0\u33a8"+
    "\0\u33e2\0\u341c\0\72\0\164\0\72\0\164";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[270];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\3\1\11\1\12\1\3\1\11\1\13\2\3\1\14"+
    "\2\3\1\15\1\3\1\16\1\17\1\20\1\3\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\3"+
    "\1\5\1\2\1\31\1\3\1\32\1\3\1\33\1\3"+
    "\1\34\2\3\1\35\1\36\1\37\1\2\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\73\0"+
    "\3\3\3\0\26\3\3\0\2\3\2\0\11\3\17\0"+
    "\1\4\55\0\1\51\16\0\1\52\65\0\3\3\3\0"+
    "\1\3\1\53\12\3\1\54\3\3\1\54\5\3\3\0"+
    "\2\3\2\0\11\3\16\0\3\3\3\0\17\3\1\55"+
    "\3\3\1\55\2\3\3\0\2\3\2\0\11\3\16\0"+
    "\3\3\3\0\4\3\1\56\7\3\1\54\3\3\1\54"+
    "\5\3\3\0\2\3\2\0\11\3\16\0\3\3\3\0"+
    "\2\3\1\57\23\3\3\0\2\3\2\0\11\3\16\0"+
    "\3\3\3\0\5\3\1\60\20\3\3\0\2\3\2\0"+
    "\11\3\16\0\3\3\3\0\15\3\1\61\10\3\3\0"+
    "\2\3\2\0\11\3\16\0\3\3\3\0\7\3\1\62"+
    "\16\3\3\0\2\3\2\0\11\3\16\0\3\3\3\0"+
    "\1\3\1\63\24\3\3\0\2\3\2\0\11\3\16\0"+
    "\3\3\3\0\21\3\1\64\4\3\3\0\2\3\2\0"+
    "\11\3\16\0\3\3\3\0\12\3\1\62\13\3\3\0"+
    "\2\3\2\0\11\3\16\0\3\3\3\0\4\3\1\65"+
    "\21\3\3\0\2\3\2\0\11\3\16\0\3\3\3\0"+
    "\26\3\3\0\1\66\1\3\2\0\11\3\16\0\3\3"+
    "\3\0\26\3\3\0\2\3\2\0\1\67\10\3\53\0"+
    "\1\70\71\0\1\71\70\0\1\72\1\73\34\0\3\3"+
    "\3\0\4\3\1\74\10\3\1\75\3\3\1\75\4\3"+
    "\3\0\2\3\2\0\11\3\16\0\3\3\3\0\1\3"+
    "\1\76\13\3\1\75\3\3\1\75\4\3\3\0\2\3"+
    "\2\0\11\3\16\0\3\3\3\0\12\3\1\77\13\3"+
    "\3\0\2\3\2\0\11\3\16\0\3\3\3\0\7\3"+
    "\1\100\16\3\3\0\2\3\2\0\11\3\16\0\3\3"+
    "\3\0\7\3\1\101\2\3\1\101\13\3\3\0\2\3"+
    "\2\0\7\3\1\102\1\3\17\0\1\4\70\0\2\103"+
    "\1\0\1\103\2\0\26\103\3\0\3\103\1\0\12\103"+
    "\1\0\2\103\1\0\1\104\45\0\1\105\32\0\1\106"+
    "\2\0\1\107\75\0\1\110\64\0\3\3\3\0\2\3"+
    "\1\111\23\3\3\0\2\3\2\0\11\3\16\0\3\3"+
    "\3\0\26\3\3\0\2\3\2\0\10\3\1\112\16\0"+
    "\3\3\3\0\5\3\1\111\20\3\3\0\2\3\2\0"+
    "\11\3\16\0\3\3\3\0\7\3\1\113\16\3\3\0"+
    "\2\3\2\0\11\3\16\0\3\3\3\0\12\3\1\114"+
    "\13\3\3\0\2\3\2\0\11\3\16\0\3\3\3\0"+
    "\16\3\1\115\7\3\3\0\2\3\2\0\11\3\16\0"+
    "\3\3\3\0\25\3\1\116\3\0\2\3\2\0\11\3"+
    "\16\0\3\3\3\0\22\3\1\117\3\3\3\0\2\3"+
    "\2\0\11\3\16\0\3\3\3\0\24\3\1\116\1\3"+
    "\3\0\2\3\2\0\11\3\16\0\3\3\3\0\26\3"+
    "\3\0\1\3\1\120\2\0\11\3\16\0\3\3\3\0"+
    "\26\3\3\0\2\3\2\0\1\3\1\121\7\3\16\0"+
    "\3\3\3\0\24\3\1\122\1\3\3\0\2\3\2\0"+
    "\11\3\16\0\3\3\3\0\6\3\1\123\2\3\1\123"+
    "\14\3\3\0\2\3\2\0\11\3\16\0\3\3\3\0"+
    "\25\3\1\124\3\0\2\3\2\0\11\3\16\0\3\3"+
    "\3\0\22\3\1\125\3\3\3\0\2\3\2\0\11\3"+
    "\16\0\3\3\3\0\16\3\1\126\7\3\3\0\2\3"+
    "\2\0\11\3\16\0\3\3\3\0\1\127\2\3\1\127"+
    "\22\3\3\0\2\3\2\0\11\3\16\0\3\3\3\0"+
    "\3\3\1\130\22\3\3\0\2\3\2\0\11\3\53\0"+
    "\1\131\34\0\2\110\1\0\1\110\1\0\1\132\26\110"+
    "\3\0\3\110\1\0\12\110\1\0\2\110\12\0\3\3"+
    "\3\0\26\3\3\0\1\133\1\3\2\0\1\133\10\3"+
    "\16\0\3\3\3\0\1\134\25\3\3\0\2\3\2\0"+
    "\11\3\16\0\3\3\3\0\3\3\1\135\22\3\3\0"+
    "\2\3\2\0\11\3\16\0\3\3\3\0\17\3\1\136"+
    "\6\3\3\0\2\3\2\0\11\3\16\0\3\3\3\0"+
    "\23\3\1\137\2\3\3\0\2\3\2\0\11\3\16\0"+
    "\3\3\3\0\21\3\1\140\4\3\3\0\2\3\2\0"+
    "\11\3\16\0\3\3\3\0\15\3\1\141\10\3\3\0"+
    "\2\3\2\0\11\3\16\0\3\3\3\0\24\3\1\142"+
    "\1\3\3\0\2\3\2\0\2\3\1\143\6\3\16\0"+
    "\3\3\3\0\26\3\3\0\1\144\1\3\2\0\1\144"+
    "\10\3\16\0\3\3\3\0\25\3\1\145\3\0\2\3"+
    "\2\0\4\3\1\146\4\3\16\0\3\3\3\0\13\3"+
    "\1\147\12\3\3\0\2\3\2\0\11\3\16\0\3\3"+
    "\3\0\10\3\1\150\15\3\3\0\2\3\2\0\11\3"+
    "\16\0\3\3\3\0\2\3\1\151\2\3\1\151\20\3"+
    "\3\0\2\3\2\0\11\3\16\0\3\3\3\0\15\3"+
    "\1\152\3\3\1\152\4\3\3\0\2\3\2\0\11\3"+
    "\22\0\1\153\65\0\3\3\3\0\1\3\1\154\24\3"+
    "\3\0\2\3\2\0\11\3\16\0\3\3\3\0\4\3"+
    "\1\155\21\3\3\0\2\3\2\0\11\3\16\0\3\3"+
    "\3\0\2\3\1\156\23\3\3\0\2\3\2\0\11\3"+
    "\16\0\3\3\3\0\5\3\1\156\20\3\3\0\2\3"+
    "\2\0\11\3\16\0\3\3\3\0\23\3\1\157\2\3"+
    "\3\0\2\3\2\0\11\3\16\0\3\3\3\0\17\3"+
    "\1\160\6\3\3\0\2\3\2\0\11\3\16\0\3\3"+
    "\3\0\26\3\3\0\1\161\1\3\2\0\11\3\16\0"+
    "\3\3\3\0\12\3\1\162\13\3\3\0\2\3\2\0"+
    "\11\3\16\0\3\3\3\0\26\3\3\0\2\3\2\0"+
    "\1\163\10\3\16\0\3\3\3\0\7\3\1\164\16\3"+
    "\3\0\2\3\2\0\11\3\16\0\3\3\3\0\12\3"+
    "\1\165\13\3\3\0\2\3\2\0\11\3\16\0\3\3"+
    "\3\0\7\3\1\166\16\3\3\0\2\3\2\0\11\3"+
    "\16\0\3\3\3\0\26\3\3\0\1\167\1\3\2\0"+
    "\1\167\10\3\16\0\3\3\3\0\26\3\3\0\1\170"+
    "\1\3\2\0\11\3\22\0\1\171\65\0\3\3\3\0"+
    "\10\3\1\172\15\3\3\0\2\3\2\0\11\3\16\0"+
    "\3\3\3\0\13\3\1\172\12\3\3\0\2\3\2\0"+
    "\11\3\16\0\3\3\3\0\12\3\1\173\13\3\3\0"+
    "\2\3\2\0\11\3\16\0\3\3\3\0\7\3\1\174"+
    "\16\3\3\0\2\3\2\0\11\3\16\0\3\3\3\0"+
    "\26\3\3\0\1\3\1\175\2\0\11\3\16\0\3\3"+
    "\3\0\22\3\1\176\3\3\3\0\2\3\2\0\11\3"+
    "\16\0\3\3\3\0\26\3\3\0\2\3\2\0\1\3"+
    "\1\177\7\3\16\0\3\3\3\0\16\3\1\200\7\3"+
    "\3\0\2\3\2\0\11\3\16\0\3\3\3\0\23\3"+
    "\1\201\2\3\3\0\2\3\2\0\11\3\16\0\3\3"+
    "\3\0\17\3\1\202\6\3\3\0\2\3\2\0\11\3"+
    "\16\0\3\3\3\0\26\3\3\0\1\203\1\3\2\0"+
    "\11\3\16\0\3\3\3\0\26\3\3\0\2\3\2\0"+
    "\1\204\10\3\16\0\3\3\3\0\21\3\1\205\4\3"+
    "\3\0\2\3\2\0\11\3\16\0\3\3\3\0\13\3"+
    "\1\206\12\3\3\0\2\3\2\0\11\3\16\0\3\3"+
    "\3\0\15\3\1\207\10\3\3\0\2\3\2\0\11\3"+
    "\16\0\3\3\3\0\10\3\1\210\15\3\3\0\2\3"+
    "\2\0\11\3\16\0\3\3\3\0\26\3\3\0\2\3"+
    "\2\0\3\3\1\211\5\3\16\0\3\3\3\0\26\3"+
    "\3\0\2\3\2\0\5\3\1\212\3\3\15\0\1\213"+
    "\3\214\3\213\26\214\3\213\2\214\2\0\11\214\15\213"+
    "\1\215\3\216\3\215\26\216\3\215\2\216\2\0\11\216"+
    "\15\215\1\0\3\3\3\0\23\3\1\217\2\3\3\0"+
    "\2\3\2\0\11\3\16\0\3\3\3\0\12\3\1\220"+
    "\13\3\3\0\2\3\2\0\11\3\16\0\3\3\3\0"+
    "\17\3\1\221\6\3\3\0\2\3\2\0\11\3\16\0"+
    "\3\3\3\0\7\3\1\222\16\3\3\0\2\3\2\0"+
    "\11\3\15\0\1\223\3\224\3\223\26\224\3\223\2\224"+
    "\2\0\11\224\15\223\1\225\3\226\3\225\26\226\3\225"+
    "\2\226\2\0\11\226\15\225\20\0\1\227\52\0\3\3"+
    "\3\0\11\3\1\230\14\3\3\0\2\3\2\0\11\3"+
    "\32\0\1\231\55\0\3\3\3\0\6\3\1\232\17\3"+
    "\3\0\2\3\2\0\11\3\16\0\3\3\3\0\12\3"+
    "\1\233\13\3\3\0\2\3\2\0\11\3\16\0\3\3"+
    "\3\0\23\3\1\234\2\3\3\0\2\3\2\0\11\3"+
    "\16\0\3\3\3\0\7\3\1\235\16\3\3\0\2\3"+
    "\2\0\11\3\16\0\3\3\3\0\17\3\1\236\6\3"+
    "\3\0\2\3\2\0\11\3\35\0\1\237\52\0\3\3"+
    "\3\0\11\3\1\240\14\3\3\0\2\3\2\0\11\3"+
    "\32\0\1\241\55\0\3\3\3\0\6\3\1\242\17\3"+
    "\3\0\2\3\2\0\11\3\55\0\1\243\32\0\3\3"+
    "\3\0\26\3\3\0\1\244\1\3\2\0\11\3\61\0"+
    "\1\245\26\0\3\3\3\0\26\3\3\0\2\3\2\0"+
    "\1\246\10\3\16\0\3\3\3\0\26\3\3\0\1\247"+
    "\1\3\2\0\11\3\16\0\3\3\3\0\26\3\3\0"+
    "\2\3\2\0\3\3\1\250\5\3\16\0\3\3\3\0"+
    "\26\3\3\0\2\3\2\0\1\251\10\3\16\0\3\3"+
    "\3\0\26\3\3\0\2\3\2\0\5\3\1\252\3\3"+
    "\55\0\1\253\32\0\3\3\3\0\26\3\3\0\1\254"+
    "\1\3\2\0\11\3\61\0\1\255\26\0\3\3\3\0"+
    "\26\3\3\0\2\3\2\0\1\256\10\3\56\0\1\257"+
    "\31\0\3\3\3\0\26\3\3\0\1\3\1\260\2\0"+
    "\11\3\62\0\1\261\25\0\3\3\3\0\26\3\3\0"+
    "\2\3\2\0\1\3\1\262\7\3\15\0\1\263\3\264"+
    "\3\263\26\264\3\263\2\264\2\0\11\264\15\263\1\265"+
    "\3\266\3\265\26\266\3\265\2\266\2\0\11\266\15\265"+
    "\1\267\3\270\3\267\26\270\3\267\2\270\2\0\11\270"+
    "\15\267\1\271\3\272\3\271\26\272\3\271\2\272\2\0"+
    "\11\272\15\271\41\0\1\273\31\0\3\3\3\0\26\3"+
    "\3\0\1\3\1\274\2\0\11\3\62\0\1\275\25\0"+
    "\3\3\3\0\26\3\3\0\2\3\2\0\1\3\1\276"+
    "\7\3\31\0\1\277\56\0\3\3\3\0\5\3\1\300"+
    "\20\3\3\0\2\3\2\0\11\3\26\0\1\301\61\0"+
    "\3\3\3\0\2\3\1\302\23\3\3\0\2\3\2\0"+
    "\11\3\35\0\1\303\52\0\3\3\3\0\11\3\1\304"+
    "\14\3\3\0\2\3\2\0\11\3\35\0\1\305\52\0"+
    "\3\3\3\0\11\3\1\306\14\3\3\0\2\3\2\0"+
    "\11\3\32\0\1\307\55\0\3\3\3\0\6\3\1\310"+
    "\17\3\3\0\2\3\2\0\11\3\32\0\1\311\55\0"+
    "\3\3\3\0\6\3\1\312\17\3\3\0\2\3\2\0"+
    "\11\3\31\0\1\313\56\0\3\3\3\0\5\3\1\314"+
    "\20\3\3\0\2\3\2\0\11\3\26\0\1\315\61\0"+
    "\3\3\3\0\2\3\1\316\23\3\3\0\2\3\2\0"+
    "\11\3\27\0\1\317\60\0\3\3\3\0\3\3\1\320"+
    "\22\3\3\0\2\3\2\0\11\3\24\0\1\321\63\0"+
    "\3\3\3\0\1\322\25\3\3\0\2\3\2\0\11\3"+
    "\55\0\1\323\32\0\3\3\3\0\26\3\3\0\1\324"+
    "\1\3\2\0\11\3\55\0\1\325\32\0\3\3\3\0"+
    "\26\3\3\0\1\326\1\3\2\0\11\3\61\0\1\327"+
    "\26\0\3\3\3\0\26\3\3\0\2\3\2\0\1\330"+
    "\10\3\61\0\1\331\26\0\3\3\3\0\26\3\3\0"+
    "\2\3\2\0\1\332\10\3\27\0\1\333\60\0\3\3"+
    "\3\0\3\3\1\334\22\3\3\0\2\3\2\0\11\3"+
    "\24\0\1\335\63\0\3\3\3\0\1\336\25\3\3\0"+
    "\2\3\2\0\11\3\46\0\1\337\41\0\3\3\3\0"+
    "\22\3\1\340\3\3\3\0\2\3\2\0\11\3\42\0"+
    "\1\341\45\0\3\3\3\0\16\3\1\342\7\3\3\0"+
    "\2\3\2\0\11\3\56\0\1\343\31\0\3\3\3\0"+
    "\26\3\3\0\1\3\1\344\2\0\11\3\56\0\1\345"+
    "\31\0\3\3\3\0\26\3\3\0\1\3\1\346\2\0"+
    "\11\3\62\0\1\347\25\0\3\3\3\0\26\3\3\0"+
    "\2\3\2\0\1\3\1\350\7\3\62\0\1\351\25\0"+
    "\3\3\3\0\26\3\3\0\2\3\2\0\1\3\1\352"+
    "\7\3\46\0\1\353\41\0\3\3\3\0\22\3\1\354"+
    "\3\3\3\0\2\3\2\0\11\3\42\0\1\355\45\0"+
    "\3\3\3\0\16\3\1\356\7\3\3\0\2\3\2\0"+
    "\11\3\30\0\1\357\57\0\3\3\3\0\4\3\1\360"+
    "\21\3\3\0\2\3\2\0\11\3\25\0\1\357\62\0"+
    "\3\3\3\0\1\3\1\360\24\3\3\0\2\3\2\0"+
    "\11\3\31\0\1\361\56\0\3\3\3\0\5\3\1\362"+
    "\20\3\3\0\2\3\2\0\11\3\31\0\1\363\56\0"+
    "\3\3\3\0\5\3\1\364\20\3\3\0\2\3\2\0"+
    "\11\3\26\0\1\365\61\0\3\3\3\0\2\3\1\366"+
    "\23\3\3\0\2\3\2\0\11\3\26\0\1\367\61\0"+
    "\3\3\3\0\2\3\1\370\23\3\3\0\2\3\2\0"+
    "\11\3\30\0\1\371\57\0\3\3\3\0\4\3\1\372"+
    "\21\3\3\0\2\3\2\0\11\3\25\0\1\371\62\0"+
    "\3\3\3\0\1\3\1\372\24\3\3\0\2\3\2\0"+
    "\11\3\27\0\1\373\60\0\3\3\3\0\3\3\1\374"+
    "\22\3\3\0\2\3\2\0\11\3\27\0\1\375\60\0"+
    "\3\3\3\0\3\3\1\376\22\3\3\0\2\3\2\0"+
    "\11\3\24\0\1\377\63\0\3\3\3\0\1\u0100\25\3"+
    "\3\0\2\3\2\0\11\3\24\0\1\u0101\63\0\3\3"+
    "\3\0\1\u0102\25\3\3\0\2\3\2\0\11\3\46\0"+
    "\1\u0103\41\0\3\3\3\0\22\3\1\u0104\3\3\3\0"+
    "\2\3\2\0\11\3\46\0\1\u0105\41\0\3\3\3\0"+
    "\22\3\1\u0106\3\3\3\0\2\3\2\0\11\3\42\0"+
    "\1\u0107\45\0\3\3\3\0\16\3\1\u0108\7\3\3\0"+
    "\2\3\2\0\11\3\42\0\1\u0109\45\0\3\3\3\0"+
    "\16\3\1\u010a\7\3\3\0\2\3\2\0\11\3\30\0"+
    "\1\u010b\57\0\3\3\3\0\4\3\1\u010c\21\3\3\0"+
    "\2\3\2\0\11\3\30\0\1\u010d\57\0\3\3\3\0"+
    "\4\3\1\u010e\21\3\3\0\2\3\2\0\11\3\25\0"+
    "\1\u010b\62\0\3\3\3\0\1\3\1\u010c\24\3\3\0"+
    "\2\3\2\0\11\3\25\0\1\u010d\62\0\3\3\3\0"+
    "\1\3\1\u010e\24\3\3\0\2\3\2\0\11\3\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[13398];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\1\1\1\11\26\1\3\11"+
    "\1\1\6\11\1\1\2\0\15\1\4\11\7\1\1\0"+
    "\2\11\1\0\1\1\1\0\20\1\1\11\1\0\20\1"+
    "\1\0\15\1\1\11\21\1\1\0\1\1\1\0\5\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\5\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\5\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\11\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\11\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\11\1\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[270];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	MatchProcessor mp = new MatchProcessor();
	public ArrayList<com.tpi.teoi.SymbolMe> get_result(){
	    return mp.get_result();
	}

	public ArrayList<String> get_rejected(){
    	    return mp.get_rejected();
    	}

    public ArrayList<com.tpi.teoi.SymbolMe> get_result_lexemas(){
	    return mp.get_result_lexemas();
	}	
    
    


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 206) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { mp.process_unmatch(yytext(), String.valueOf(yyline));
            } 
            // fall through
          case 42: break;
          case 2: 
            { mp.process_match("ID", yytext());
				return new Symbol(sym.ID,yytext());
            } 
            // fall through
          case 43: break;
          case 3: 
            { mp.process_match("CONST_INT", yytext());
				return new Symbol(sym.CONST_INT,yytext());
            } 
            // fall through
          case 44: break;
          case 4: 
            { /* ignore */
            } 
            // fall through
          case 45: break;
          case 5: 
            { mp.process_match("SIG_DIV", yytext());
				return new Symbol(sym.SIG_DIV,yytext());
            } 
            // fall through
          case 46: break;
          case 6: 
            { mp.process_match("SIG_MUL", yytext());
				return new Symbol(sym.SIG_MUL,yytext());
            } 
            // fall through
          case 47: break;
          case 7: 
            { mp.process_match("MAYOR", yytext());
				return new Symbol(sym.MAYOR,yytext());
            } 
            // fall through
          case 48: break;
          case 8: 
            { mp.process_match("IGUAL", yytext());
				return new Symbol(sym.IGUAL,yytext());
            } 
            // fall through
          case 49: break;
          case 9: 
            { mp.process_match("MENOR", yytext());
				return new Symbol(sym.MENOR,yytext());
            } 
            // fall through
          case 50: break;
          case 10: 
            { mp.process_match("SIG_MENOS", yytext());
				return new Symbol(sym.SIG_MENOS,yytext());
            } 
            // fall through
          case 51: break;
          case 11: 
            { mp.process_match("SIG_MAS", yytext());
				return new Symbol(sym.SIG_MAS,yytext());
            } 
            // fall through
          case 52: break;
          case 12: 
            { mp.process_match("COMA", yytext());
				return new Symbol(sym.COMA,yytext());
            } 
            // fall through
          case 53: break;
          case 13: 
            { mp.process_match("PUNTO_Y_COMA", yytext());
				return new Symbol(sym.PUNTO_Y_COMA,yytext());
            } 
            // fall through
          case 54: break;
          case 14: 
            { mp.process_match("SQR_BRACKET_OPEN", yytext());
				return new Symbol(sym.SQR_BRACKET_OPEN,yytext());
            } 
            // fall through
          case 55: break;
          case 15: 
            { mp.process_match("SQR_BRACKET_CLOSE", yytext());
				return new Symbol(sym.SQR_BRACKET_CLOSE,yytext());
            } 
            // fall through
          case 56: break;
          case 16: 
            { mp.process_match("BRACKET_OPEN", yytext());
				return new Symbol(sym.BRACKET_OPEN,yytext());
            } 
            // fall through
          case 57: break;
          case 17: 
            { mp.process_match("BRACKET_CLOSE", yytext());
				return new Symbol(sym.BRACKET_CLOSE,yytext());
            } 
            // fall through
          case 58: break;
          case 18: 
            { mp.process_match("KEY_OPEN", yytext());
				return new Symbol(sym.KEY_OPEN,yytext());
            } 
            // fall through
          case 59: break;
          case 19: 
            { mp.process_match("KEY_CLOSE", yytext());
				return new Symbol(sym.KEY_CLOSE,yytext());
            } 
            // fall through
          case 60: break;
          case 20: 
            { mp.process_match("IF", yytext());
				return new Symbol(sym.IF,yytext());
            } 
            // fall through
          case 61: break;
          case 21: 
            { mp.process_match("OR", yytext());
				return new Symbol(sym.OR,yytext());
            } 
            // fall through
          case 62: break;
          case 22: 
            { mp.process_match("MAYOR_I", yytext());
				return new Symbol(sym.MAYOR_I,yytext());
            } 
            // fall through
          case 63: break;
          case 23: 
            { mp.process_match("DISTINTO", yytext());
				return new Symbol(sym.DISTINTO,yytext());
            } 
            // fall through
          case 64: break;
          case 24: 
            { mp.process_match("MENOR_I", yytext());
				return new Symbol(sym.MENOR_I,yytext());
            } 
            // fall through
          case 65: break;
          case 25: 
            { mp.process_match("CONST_STRING", yytext());
				return new Symbol(sym.CONST_STRING,yytext());
            } 
            // fall through
          case 66: break;
          case 26: 
            { mp.process_match("OP_DECLARE", yytext());
				return new Symbol(sym.OP_DECLARE,yytext());
            } 
            // fall through
          case 67: break;
          case 27: 
            { mp.process_match("CONST_FLOAT", yytext());
				return new Symbol(sym.CONST_FLOAT,yytext());
            } 
            // fall through
          case 68: break;
          case 28: 
            { mp.process_match("TYPE_INT", yytext());
				return new Symbol(sym.TYPE_INT,yytext());
            } 
            // fall through
          case 69: break;
          case 29: 
            { mp.process_match("AND", yytext());
				return new Symbol(sym.AND,yytext());
            } 
            // fall through
          case 70: break;
          case 30: 
            { mp.process_match("OP_ASSIGN", yytext());
				return new Symbol(sym.OP_ASSIGN,yytext());
            } 
            // fall through
          case 71: break;
          case 31: 
            { mp.process_match("TAKE", yytext());
				return new Symbol(sym.TAKE,yytext());
            } 
            // fall through
          case 72: break;
          case 32: 
            { mp.process_match("ELSE", yytext());
				return new Symbol(sym.ELSE,yytext());
            } 
            // fall through
          case 73: break;
          case 33: 
            { mp.process_match("TYPE_FLOAT", yytext());
				return new Symbol(sym.CONST_FLOAT,yytext());
            } 
            // fall through
          case 74: break;
          case 34: 
            { mp.process_match("EXIT", yytext());
				return new Symbol(sym.EXIT,yytext());
            } 
            // fall through
          case 75: break;
          case 35: 
            { mp.process_match("WHILE", yytext());
				return new Symbol(sym.WHILE,yytext());
            } 
            // fall through
          case 76: break;
          case 36: 
            { /* IGNORE */
            } 
            // fall through
          case 77: break;
          case 37: 
            { mp.process_match("TYPE_STRING", yytext());
				return new Symbol(sym.CONST_STRING,yytext());
            } 
            // fall through
          case 78: break;
          case 38: 
            { mp.process_match("DEC", yytext());
				return new Symbol(sym.DEC,yytext());
            } 
            // fall through
          case 79: break;
          case 39: 
            { mp.process_match("START", yytext());
				return new Symbol(sym.START,yytext());
            } 
            // fall through
          case 80: break;
          case 40: 
            { mp.process_match("ENDDEC", yytext());
				return new Symbol(sym.ENDDEC,yytext());
            } 
            // fall through
          case 81: break;
          case 41: 
            { mp.process_match("FINALIZE", yytext());
				return new Symbol(sym.FINALIZE,yytext());
            } 
            // fall through
          case 82: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
