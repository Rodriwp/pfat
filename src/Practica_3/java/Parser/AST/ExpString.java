package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class ExpString implements Exp {
	public final String valor;

        public ExpString(String valor) {
		this.valor = valor;
	}
        public int computeType() throws CompilerExc {
                        return SymbolTable.STRING;
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write(valor);
        }
}
