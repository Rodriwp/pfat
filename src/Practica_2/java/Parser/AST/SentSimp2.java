package AST;

import Errors.*;

public class SentSimp2 implements Sentencia {
	public final Cond cond;

	public SentSimp2(Cond cond) {
		this.cond = cond;
	}
        public void computeAH1() throws CompilerExc {
                        cond.computeAH1();
        }
        public void checkBreak(int num_breaks) throws CompilerExc {
            cond.checkBreak(num_breaks);
        }
}
