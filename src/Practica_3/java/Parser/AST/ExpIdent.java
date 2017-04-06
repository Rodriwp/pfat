package AST;

import Errors.*;
import Compiler.SymbolTable;

public class ExpIdent implements Exp {
	public final String ident;

        public ExpIdent(String ident) {
		this.ident = ident;
	}
        public int computeType() throws CompilerExc {
                        return SymbolTable.getVariableType(ident);
        }
}
