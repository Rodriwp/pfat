package AST;

import Errors.*;

public interface Cond {
    public void computeAH1() throws CompilerExc;
    public int checkBreak() throws CompilerExc;
}
