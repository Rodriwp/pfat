package AST;

import Errors.*;

public class SentSimp3 implements Sentencia {
	public final Repet repet;

	public SentSimp3(Repet repet) {
		this.repet = repet;
	}
        public void computeAH1() throws CompilerExc {
                        repet.computeAH1();
        }
        public int checkBreak() throws CompilerExc {
            int insidebreak = repet.checkBreak();
            if(insidebreak == 0) return 0;
            return repet.checkBreak()-1;
        }
}
