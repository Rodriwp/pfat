package AST;

public class Cond1 implements Cond {
	public final Exp exp;
	public final Sentencia sent;

	public Cond1(Exp exp, Sentencia sent) {
		this.exp = exp;
		this.sent = sent;
	}
}
