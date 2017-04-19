package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

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
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write("-(");
            exp.generateCode(w,"");
            w.write(")");
        }

}
