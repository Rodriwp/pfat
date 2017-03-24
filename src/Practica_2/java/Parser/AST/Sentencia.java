package AST;

import Errors.*;

public interface Sentencia {
    public void computeAH1() throws CompilerExc;
    public int checkBreak() throws CompilerExc
}
