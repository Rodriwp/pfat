package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class Repet {
	public final Exp exp;
	public final Sentencia sent;
        private int break_ident;

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
        public void checkBreak(int num_breaks) throws CompilerExc {
            this.break_ident = num_breaks;
            sent.checkBreak(num_breaks+1);

        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write("label"+break_ident+":");
            w.newLine();
            w.write(tabs+"while(");
            exp.generateCode(w,"");
            w.write("){");
            w.newLine();
            sent.generateCode(w,tabs+"\t");
            w.newLine();
            w.write("}");
        }
}
