package AST;

import Errors.*;

public class SentSimp5 implements Sentencia {
	public final int valor;

	public SentSimp5(int valor) {
		this.valor = valor;
	}
        public void computeAH1() throws CompilerExc {
        }
        public int checkBreak() throws CompilerExc {
            return valor;
        }
}
