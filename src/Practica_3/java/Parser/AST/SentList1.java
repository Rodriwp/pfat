package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

public class SentList1 implements Sentencia {
	public final Sentencia sentsimp;

	public SentList1(Sentencia sentsimp) {
		this.sentsimp = sentsimp;
	}
        public void computeAH1() throws CompilerExc {
                        sentsimp.computeAH1();
        }
        public void checkBreak(int num_breaks) throws CompilerExc {
            sentsimp.checkBreak(num_breaks);
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            sentsimp.generateCode(w,tabs);
        }
}
