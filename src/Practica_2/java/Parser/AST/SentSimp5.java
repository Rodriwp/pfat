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
            if(valor <= 0){
                throw new BreakExc("you have ilegal break: "+ valor+" is  not greater than 0\n");
            }
            return valor;
        }
}
