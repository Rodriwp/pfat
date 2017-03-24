package AST;

import Errors.*;
import Compiler.SymbolTable;

public class Asign {
	public final String ident;
	public final Exp exp;

	public Asign(String ident, Exp exp) {
		this.ident = ident;
		this.exp = exp;
	}
        public void computeAH1() throws CompilerExc {
            int expType = exp.computeType();
            if (!(expType == SymbolTable.getVariableType(ident))) {
                throw new IlegalTypeExc("Ilegal types: Can't assign "+ SymbolTable.typeToString(exp1Type)
                + "  = " +SymbolTable.typeToString(exp2Type)+ " \n" );
            }
        }
}
