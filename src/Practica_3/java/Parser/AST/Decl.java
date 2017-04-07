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
            switch(tipo){
                case SymbolTable.INT:
                    w.write(tabs+"int ");
                    break;
                case SymbolTable.STRING:
                    w.write(tabs+"String ");
                    break;
                case SymbolTable.BOOLEAN:
                    w.write(tabs+"bool ");
                    break;
            }
            lvar.generateCode(w,tabs);
        }

}
