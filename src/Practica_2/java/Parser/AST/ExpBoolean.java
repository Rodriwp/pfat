package AST;

import Errors.*;
import Compiler.SymbolTable;

public class ExpBoolean implements Exp {
	public final boolean valor;

        public ExpBoolean(boolean valor) {
		this.valor = valor;
	}
        public int computeType() throws CompilerExc {
                        return SymbolTable.BOOLEAN;
        }
}
