package AST;

import Errors.*;
import Compiler.SymbolTable;

public class ExpNot implements Exp {
	public final Exp exp;

        public ExpNot(Exp exp) {
		this.exp = exp;
	}
        public int computeType() throws CompilerExc {
            int expType = exp.computeType();
            if(expType != SymbolTable.BOOLEAN){
                throw new IlegalTypeExc("Ilegal types: NOT"+ SymbolTable.typeToString(expType)+" \n" );
            }else{
                return expType;
            }
        }
}
