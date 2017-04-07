package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class S1 implements S {
	public final String ident;
	public final LVar lvar;
	public final Sentencia body;

	public S1(String ident, LVar lvar,Sentencia body) {
		this.ident = ident;
		this.lvar = lvar;
		this.body = body;
	}
        public void computeAH1() throws CompilerExc {
                        lvar.computeAH1(SymbolTable.STRING);
                        body.computeAH1();
                        body.checkBreak(0);
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write(tabs+"public static void " + ident + "(){");
            w.newLine();
            body.generateCode(w,tabs+"\t");
            w.newLine();
            w.write(tabs +"}");
            // MAIN
            w.newLine();
            w.newLine();
            w.write(tabs + "public static void main(String [] args){");
            w.newLine();
            w.write(tabs + "\t" +ident + "();");
            w.newLine();
            w.write(tabs + "}");

        }
}
