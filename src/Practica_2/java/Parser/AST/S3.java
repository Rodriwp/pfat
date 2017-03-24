package AST;

import Errors.*;

public class S3 implements S {
	public final String ident;
	public final VDef vdef;
	public final Sentencia body;

	public S3(String ident, VDef vdef, Sentencia body) {
		this.ident = ident;
		this.vdef = vdef;
		this.body = body;
	}
        public void computeAH1() throws CompilerExc {
            vdef.computeAH1();
            body.computeAH1();
            body.checkBreak();
        }
}
