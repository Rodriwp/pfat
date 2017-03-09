package AST;

public class S3 implements S {
	public final String ident;
	public final VDef vdef;
	public final Sentencia body;

	public S3(String ident, VDef vdef, Sentencia body) {
		this.ident = ident;
		this.vdef = vdef;
		this.body = body;
	}
}
