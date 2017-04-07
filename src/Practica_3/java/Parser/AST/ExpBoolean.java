package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class ExpBoolean implements Exp {
	public final boolean valor;

        public ExpBoolean(boolean valor) {
		this.valor = valor;
	}
        public int computeType() throws CompilerExc {
                        return SymbolTable.BOOLEAN;
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            if(valor)
                w.write("true");
            else
                w.write("false");
        }
}
