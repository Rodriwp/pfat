package AST;

import Errors.*;

public class SentSimp1 implements Sentencia {
	public final Asign asign;

	public SentSimp1(Asign asign) {
		this.asign = asign;
	}
        public void computeAH1() throws CompilerExc {
                        asign.computeAH1();
        }
        public void checkBreak(int num_breaks) throws CompilerExc {
        }
}
