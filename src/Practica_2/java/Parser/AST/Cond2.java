package AST;

import Errors.*;
import Compiler.SymbolTable;


public class Cond2 implements Cond {
	public final Exp exp;
	public final Sentencia sent1;
	public final Sentencia sent2;

	public Cond2(Exp exp, Sentencia sent1, Sentencia sent2) {
		this.exp = exp;
		this.sent1 = sent1;
		this.sent2 = sent2;
	}
        public void computeAH1() throws CompilerExc {
            int expType = exp.computeType();
            if (!(expType == SymbolTable.BOOLEAN)) {
                throw new IlegalTypeExc("Ilegal condition type: if  can't accept "+ SymbolTable.typeToString(expType)+ " expresions \n" );
            }
            sent1.computeAH1();
            sent2.computeAH1();
        }
        public int checkBreak() throws CompilerExc {
            return sent1.checkBreak()+sent2.checkBreak();
        }
}
