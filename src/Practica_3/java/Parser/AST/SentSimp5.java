package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

public class SentSimp5 implements Sentencia {
	public final int valor;

	public SentSimp5(int valor) {
		this.valor = valor;
	}
        public void computeAH1() throws CompilerExc {
        }
        public void checkBreak(int num_breaks) throws CompilerExc {
            if(valor <= 0){
                throw new BreakExc("you have ilegal break: "+ valor+" is  not greater than 0\n");
            } else if(num_breaks < valor){
                throw new BreakExc("you have "+ (valor-num_breaks)+" extra breaks\n");
            }
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write(tabs +"break");
        }
}
