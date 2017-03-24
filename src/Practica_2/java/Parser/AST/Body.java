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
        public void checkBreak() throws CompilerExc {
            if(sent.checkBreak() != 0){
                throws new BreakExc("you have "+ sent.checkBreak()+" extra breaks\n");
            }
        }

}
