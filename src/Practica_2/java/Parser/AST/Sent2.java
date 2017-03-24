package AST;

import Errors.*;

public class Sent2 implements Sentencia {
	public final Sentencia sentlist;

	public Sent2(Sentencia sentlist) {
		this.sentlist = sentlist;
	}
        public void computeAH1() throws CompilerExc {
                        sentlist.computeAH1();
        }
        public int checkBreak() throws CompilerExc {
            return sentsimp.checkBreak() + sentlist.checkBreak();
        }
}
