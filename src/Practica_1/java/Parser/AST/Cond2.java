package AST;

public class Cond2 implements Cond {
	public final Exp exp;
	public final Sentencia sent1;
	public final Sentencia sent2;

	public Cond2(Exp exp, Sentencia sent1, Sentencia sent2) {
		this.exp = exp;
		this.sent1 = sent1;
		this.sent2 = sent2;
	}
}
