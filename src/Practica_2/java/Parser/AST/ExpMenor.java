package AST;

public class ExpMenor implements Exp {
	public final Exp exp1;
	public final Exp exp2;

        public ExpMenor(Exp exp1, Exp exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
}
