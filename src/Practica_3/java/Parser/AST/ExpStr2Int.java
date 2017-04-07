package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class ExpStr2Int implements Exp {
	public final Exp exp;

        public ExpStr2Int(Exp exp) {
		this.exp = exp;
	}
        public int computeType() throws CompilerExc {
            int expType = exp.computeType();
            if (expType == SymbolTable.STRING) {
                return SymbolTable.INT;
            }

            throw new IlegalTypeExc("Ilegal types: Str2Int( " +SymbolTable.typeToString(expType)+ " )\n" );
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write("strtoint");
            exp.generateCode(w,tabs);
        }
}
