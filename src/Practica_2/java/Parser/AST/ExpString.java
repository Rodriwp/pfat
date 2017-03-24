package AST;

import Errors.*;
import Compiler.SymbolTable;

public class ExpString implements Exp {
	public final String valor;

        public ExpString(String valor) {
		this.valor = valor;
	}
        public int computeType() throws CompilerExc {
                        return SymbolTable.STRING;
        }
}
