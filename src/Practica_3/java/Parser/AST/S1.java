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
            String [] arguments= lvar.generateCode("").split(" ");
            String [] out =arguments[arguments.length-1].split(";");
            arguments[arguments.length-1] = out[0];
            w.write(tabs+"public static void " + ident + "(");
            for(int i = 0;i < arguments.length;i++){
                w.write("String "+arguments[i]);
            }
            w.write("){");
            w.newLine();
            body.generateCode(w,tabs+"\t");
            w.newLine();
            w.write(tabs +"}");
            // MAIN
            w.newLine();
            w.newLine();
            w.write(tabs + "public static void main(String [] args){");
            w.newLine();
            w.write(tabs+"\tString [] args_real = new String["+Integer.toString(arguments.length)+"];");
            w.newLine();
            w.write(tabs+"\tfor(int i = 0; i <"+Integer.toString(arguments.length)+"; i++){");
            w.newLine();
            w.write(tabs+"\t\tif(args.length > i){");
            w.newLine();
            w.write(tabs+"\t\t\targs_real[i]=args[i];");
            w.newLine();
            w.write(tabs+"\t\t}else{");
            w.newLine();
            w.write(tabs+"\t\t\targs_real[i]=\"\";");
            w.newLine();
            w.write(tabs+"\t\t}");
            w.newLine();
            w.write(tabs+"\t}");
            w.newLine();
            w.write(tabs + "\t" +ident + "(");
            w.write("args_real[0]");
            for(int i = 1;i < arguments.length;i++){
                w.write(",args_real["+i+"]");
            }
            w.write(");");
            w.newLine();
            w.write(tabs + "}");

        }
}
