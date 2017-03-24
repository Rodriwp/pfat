package AST;

import Errors.*;
import Compiler.SymbolTable;

public class ExpNot implements Exp {
	public final Exp exp;

        public ExpNot(Exp exp) {
		this.exp = exp;
	}
        public int computeType() throws CompilerExc {
            int exp1Type = exp1.computeType();
            int exp2Type = exp2.computeType();
            if(exp1Type != exp2Type || exp1Type != SymbolTable.BOOLEAN){
                throw new IlegalTypeExc("Ilegal types: "+ SymbolTable.typeToString(exp1Type),
                + " != " +SymbolTable.typeToString(exp2Type)+ " \n" );
            }else{
                return exp1Type;
            }
        }
}
