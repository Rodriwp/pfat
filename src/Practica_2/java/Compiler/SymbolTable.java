package Compiler;

import java.util.HashMap;
import Errors.*;

public class SymbolTable {

        private static HashMap <String, Integer> table = new HashMap<String, Integer>();

        public static final int INT = 0;
        public static final int STRING = 1;
        public static final int BOOLEAN = 2;


        /* Adds a variable to the symbol table */
        public static void newVariableEntry(String ident, int type) throws DoubleVarDefExc {
                if (table.get(ident) == null) {
                        table.put(ident, type);
                } else {
                        throw new DoubleVarDefExc("Variable '" + ident + "' is already declarated.");
                }
        }

        /* For exception verbose printing */
        public static String typeToString(int type) {
            switch(type){
                case INT:
                    return "INT";
                    break;
                case STRING:
                    return "STRING";
                    break;
                case BOOLEAN:
                    return "BOOLEAN";
                    break;
                default:
                    return "UNKNOWN";
                    break;
            }
        }
}

