package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class ExpInt2Str implements Exp {
	public final Exp exp;

        public ExpInt2Str(Exp exp) {
		this.exp = exp;
	}
        public int computeType() throws CompilerExc {
            int expType = exp.computeType();
            if (expType == SymbolTable.INT) {
                return SymbolTable.STRING;
            }

            throw new IlegalTypeExc("Ilegal types: Int2Str( " +SymbolTable.typeToString(expType)+ " )\n" );
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write("strtoint");
            exp.generateCode(w,tabs);
        }

}
