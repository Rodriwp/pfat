package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class ExpIdent implements Exp {
	public final String ident;

        public ExpIdent(String ident) {
		this.ident = ident;
	}
        public int computeType() throws CompilerExc {
                        return SymbolTable.getVariableType(ident);
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write(ident);
        }
}
