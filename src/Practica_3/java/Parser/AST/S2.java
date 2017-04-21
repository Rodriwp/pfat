package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

public class S2 implements S {
	public final String ident;
	public final Sentencia body;

	public S2(String ident, Sentencia body) {
		this.ident = ident;
		this.body = body;
	}
        public void computeAH1() throws CompilerExc {
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
