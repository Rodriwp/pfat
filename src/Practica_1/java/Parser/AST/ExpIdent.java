package AST;

public class ExpIdent implements Exp {
	public final String ident;

        public ExpIdent(String ident) {
		this.ident = ident;
	}
}
