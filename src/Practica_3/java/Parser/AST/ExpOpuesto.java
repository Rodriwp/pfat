package AST;

import Errors.*;
import Compiler.SymbolTable;

public class ExpOpuesto implements Exp {
	public final Exp exp;

        public ExpOpuesto(Exp exp) {
		this.exp = exp;
	}
        public int computeType() throws CompilerExc {
            int expType = exp.computeType();
            if (expType == SymbolTable.INT) {
                return SymbolTable.INT;
            }

            throw new IlegalTypeExc("Ilegal types: Opuesto " +SymbolTable.typeToString(expType)+ " \n" );
        }

}
