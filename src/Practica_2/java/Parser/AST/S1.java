package AST;

import Errors.*;
import Compiler.SymbolTable;

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
                        body.checkBreak();
        }
}
