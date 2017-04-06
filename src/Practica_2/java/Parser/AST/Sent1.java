package AST;

import Errors.*;

public class Sent1 implements Sentencia {
	public final Sentencia sentsimp;

	public Sent1(Sentencia sentsimp) {
		this.sentsimp = sentsimp;
	}
        public void computeAH1() throws CompilerExc {
                        sentsimp.computeAH1();
        }
        public void checkBreak(int num_breaks) throws CompilerExc {
            sentsimp.checkBreak(num_breaks);
        }
}
