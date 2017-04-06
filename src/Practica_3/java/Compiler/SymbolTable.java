package Compiler;

import java.util.HashMap;
import Errors.*;

public class SymbolTable {

        private static HashMap <String, Integer> symbolTable = new HashMap<String, Integer>();

        public static final int INT = 0;
        public static final int BOOLEAN = 1;
        public static final int STRING = 2;


        /* Adds a variable to the symbol table */
        public static void newVariableEntry(String ident, int type) throws DoubleVarDefExc {
                if (symbolTable.get(ident) == null) {
                        symbolTable.put(ident, type);
                } else {
                        throw new DoubleVarDefExc("Variable '" + ident + "' is already declarated.");
                }
        }

        /* Returns the type of a variable named name */
        public static int getVariableType(String ident) throws VarNotFoundExc {
                Integer type;
                if ((type = symbolTable.get(ident)) == null) {
                    throw new VarNotFoundExc("Variable '" + ident + "' doesn't exist.");
                }
                return type.intValue();
        }


        /* For exception verbose printing */
        public static String typeToString(int type) {
            switch(type){
                case INT:
                    return "INT";
                case STRING:
                    return "STRING";
                case BOOLEAN:
                    return "BOOLEAN";
                default:
                    return "UNKNOWN";
            }
        }
}

