package AST;

public class ExpParentesis implements Exp {
	public final Exp exp;

        public ExpParentesis(Exp exp) {
		this.exp = exp;
	}
}
