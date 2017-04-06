package AST;

import Errors.*;

public interface Cond {
    public void computeAH1() throws CompilerExc;
    public void checkBreak(int num_breaks) throws CompilerExc;
}
