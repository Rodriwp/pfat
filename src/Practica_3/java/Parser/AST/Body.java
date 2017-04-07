package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

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
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            sent.generateCode(w,tabs);
        }

}
