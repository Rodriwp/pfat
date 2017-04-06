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
        public void checkBreak(int num_breaks) throws CompilerExc {
            sentlist.checkBreak(num_breaks);
        }
}
