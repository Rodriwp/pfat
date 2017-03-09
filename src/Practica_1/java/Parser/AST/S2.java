package AST;

public class S2 implements S {
	public final String ident;
	public final Sentencia body;

	public S2(String ident, Sentencia body) {
		this.ident = ident;
		this.body = body;
	}
}
