package AST;

import Errors.*;

public class Body implements Sentencia {
	public final Sentencia sent;

	public Body(Sentencia sent) {
		this.sent = sent;
	}
        public void computeAH1() throws CompilerExc {
                        sent.computeAH1();

        }
        public void checkBreak(int num_breaks) throws CompilerExc {
            sent.checkBreak(num_breaks);
        }

}
