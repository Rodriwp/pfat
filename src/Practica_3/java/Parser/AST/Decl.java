package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class Decl {
	public final int tipo;
	public final LVar lvar;

	public Decl(int tipo, LVar lvar){
		this.tipo = tipo;
		this.lvar = lvar;
	}
        public void computeAH1() throws CompilerExc {
                        lvar.computeAH1(tipo);
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            String [] arguments= lvar.generateCode("").split(", ");
            String [] out =arguments[arguments.length-1].split(";");
            arguments[arguments.length-1] = out[0];
            switch(tipo){
                case SymbolTable.INT:
                    for(int i = 0;i < arguments.length;i++){
                        w.write(tabs+"int ");
                        w.write(arguments[i]+"=0;");
                        w.newLine();
                    }
                    break;
                case SymbolTable.STRING:
                    for(int i = 0;i < arguments.length;i++){
                        w.write(tabs+"String ");
                        w.write(arguments[i]+"=\"\";");
                        w.newLine();
                    }
                    break;
                case SymbolTable.BOOLEAN:
                    for(int i = 0;i < arguments.length;i++){
                        w.write(tabs+"boolean ");
                        w.write(arguments[i]+"=false;");
                        w.newLine();
                    }
                    break;
            }
        }

}
