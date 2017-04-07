package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class S4 implements S {
	public final String ident;
	public final LVar lvar;
	public final VDef vdef;
	public final Sentencia body;

	public S4(String ident, LVar lvar, VDef vdef, Sentencia body) {
		this.ident = ident;
		this.lvar = lvar;
		this.vdef = vdef;
		this.body = body;
	}
        public void computeAH1() throws CompilerExc {
                lvar.computeAH1(SymbolTable.STRING);
                vdef.computeAH1();
                body.computeAH1();
                body.checkBreak(0);
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write(tabs+"public static void " + ident + "(){");
            w.newLine();
            w.write(tabs+"\t"+"//Variables");
            w.newLine();
            vdef.generateCode(w,tabs+"\t");
            w.newLine();
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
