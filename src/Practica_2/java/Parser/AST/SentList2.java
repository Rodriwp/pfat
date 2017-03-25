package AST;

import Errors.*;

public class SentList2 implements Sentencia{
	public final Sentencia sentsimp;
	public final Sentencia sentlist;

	public SentList2(Sentencia sentsimp, Sentencia sentlist) {
		this.sentsimp = sentsimp;
		this.sentlist = sentlist;
	}
        public void computeAH1() throws CompilerExc {
                        sentsimp.computeAH1();
                        sentlist.computeAH1();
        }
        public int checkBreak() throws CompilerExc {
            return sentsimp.checkBreak() + sentlist.checkBreak();
        }
}
