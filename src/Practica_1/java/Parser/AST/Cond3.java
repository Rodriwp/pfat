package AST;

public class Cond3 implements Cond {
	public final Exp exp;
	public final Sentencia sent1;
	public final Sentencia sent2;
	public final Sentencia sent3;

	public Cond3(Exp exp, Sentencia sent1, Sentencia sent2, Sentencia sent3) {
		this.exp = exp;
		this.sent1 = sent1;
		this.sent2 = sent2;
		this.sent3 = sent3;
	}
}
