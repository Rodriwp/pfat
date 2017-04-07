package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

public class ExpParentesis implements Exp {
	public final Exp exp;

        public ExpParentesis(Exp exp) {
		this.exp = exp;
	}
        public int computeType() throws CompilerExc {
                        return exp.computeType();
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write("(");
            exp.generateCode(w,tabs);
            w.write(")");

        }

}
