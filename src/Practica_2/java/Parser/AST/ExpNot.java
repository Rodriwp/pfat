package AST;

public class ExpNot implements Exp {
	public final Exp exp;

        public ExpNot(Exp exp) {
		this.exp = exp;
	}
}
