package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class ExpSuma implements Exp {
	public final Exp exp1;
	public final Exp exp2;

        public ExpSuma(Exp exp1, Exp exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
        public int computeType() throws CompilerExc {
            int exp1Type = exp1.computeType();
            int exp2Type = exp2.computeType();
            if(exp1Type != exp2Type || exp1Type == SymbolTable.BOOLEAN){
                throw new IlegalTypeExc("Ilegal types: "+ SymbolTable.typeToString(exp1Type)
                + " + " +SymbolTable.typeToString(exp2Type)+ " \n" );
            }else{
                return exp1Type;
            }
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write("(");
            exp1.generateCode(w,tabs);
            w.write(" + ");
            exp2.generateCode(w,tabs);
            w.write(")");
        }
}
