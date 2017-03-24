package AST;

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
}
