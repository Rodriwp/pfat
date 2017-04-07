package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;


public class Cond1 implements Cond {
	public final Exp exp;
	public final Sentencia sent;

	public Cond1(Exp exp, Sentencia sent) {
		this.exp = exp;
		this.sent = sent;
	}
        public void computeAH1() throws CompilerExc {
            int expType = exp.computeType();
            if (!(expType == SymbolTable.BOOLEAN)) {
                throw new IlegalTypeExc("Ilegal types: if can't accept "+ SymbolTable.typeToString(expType)+ " expresions \n" );
            }
            sent.computeAH1();
        }
        public void checkBreak(int num_breaks) throws CompilerExc {
            sent.checkBreak(num_breaks);
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
        }
}
