package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

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
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            print.generateCode(w,tabs);
        }
}
