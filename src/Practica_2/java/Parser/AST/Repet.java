package AST;

import Errors.*;
import Compiler.SymbolTable;

public class Repet {
	public final Exp exp;
	public final Sentencia sent;

	public Repet(Exp exp, Sentencia sent) {
		this.exp = exp;
		this.sent = sent;
	}
        public void computeAH1() throws CompilerExc {
            int expType = exp.computeType();
            if (!(expType == SymbolTable.BOOLEAN)) {
                throw new IlegalTypeExc("Ilegal types: while can't accept "+ SymbolTable.typeToString(expType)+ " expresions \n" );
            }
            sent.computeAH1();
        }
        public int checkBreak() throws CompilerExc {
            return sent.checkBreak();
        }
}
