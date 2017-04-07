package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

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
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            sentlist.generateCode(w,tabs);
        }
}
