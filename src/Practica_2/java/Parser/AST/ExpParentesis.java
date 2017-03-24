package AST;

import Errors.*;
import java.io.IOException;

public class ExpParentesis implements Exp {
	public final Exp exp;

        public ExpParentesis(Exp exp) {
		this.exp = exp;
	}
        public int computeType() throws CompilerExc {
                        return exp.computeType();
        }
}
