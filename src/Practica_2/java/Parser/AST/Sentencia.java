package AST;

import Errors.*;

public interface Sentencia {
    public void computeAH1() throws CompilerExc;
    public void checkBreak(int num_breaks) throws CompilerExc;
}
