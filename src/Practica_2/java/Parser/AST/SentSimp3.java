package AST;

import Errors.*;

public class SentSimp3 implements Sentencia {
	public final Repet repet;

	public SentSimp3(Repet repet) {
		this.repet = repet;
	}
        public void computeAH1() throws CompilerExc {
                        repet.computeAH1();
        }
        public void checkBreak(int num_breaks) throws CompilerExc {
            repet.checkBreak(num_breaks);
        }
}
