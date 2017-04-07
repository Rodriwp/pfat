package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

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
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            cond.generateCode(w,tabs);
        }
}
