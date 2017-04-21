package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class ExpEntero implements Exp {
	public final int valor;

        public ExpEntero(int valor) {
		this.valor = valor;
	}
        public int computeType() throws CompilerExc {
                        return SymbolTable.INT;
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write("(");
            w.write(Integer.toString(new Integer(valor)));
            w.write(")");
        }
}
