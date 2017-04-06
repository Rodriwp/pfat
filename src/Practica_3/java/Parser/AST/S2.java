package AST;

import Errors.*;

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
}
