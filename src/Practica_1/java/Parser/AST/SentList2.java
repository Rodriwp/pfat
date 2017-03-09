package AST;

public class SentList2 implements Sentencia{
	public final Sentencia sentsimp;
	public final Sentencia sentlist;

	public SentList2(Sentencia sentsimp, Sentencia sentlist) {
		this.sentsimp = sentsimp;
		this.sentlist = sentlist;
	}
}
