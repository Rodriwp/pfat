package AST;

import Errors.*;
import Compiler.SymbolTable;

public class ExpEntero implements Exp {
	public final int valor;

        public ExpEntero(int valor) {
		this.valor = valor;
	}
        public int computeType() throws CompilerExc {
                        return SymbolTable.INT;
        }
}
