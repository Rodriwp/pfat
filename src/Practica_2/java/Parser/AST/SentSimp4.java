package AST;

import Errors.*;

public class SentSimp4 implements Sentencia {
	public final Print print;

	public SentSimp4(Print print) {
		this.print = print;
	}
        public void computeAH1() throws CompilerExc {
                        print.computeAH1();
        }
        public void checkBreak(int num_breaks) throws CompilerExc {
        }
}
