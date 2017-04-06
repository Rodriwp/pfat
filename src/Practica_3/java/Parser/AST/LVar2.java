package AST;


import Errors.*;
import Compiler.SymbolTable;

public class LVar2 implements LVar {
	public final String ident;
	public final LVar lvar;

	public LVar2(String ident, LVar lvar) {
		this.ident = ident;
		this.lvar = lvar;
        }
        public void computeAH1(int type) throws CompilerExc {
            SymbolTable.newVariableEntry(ident, type);
            lvar.computeAH1(type);
        }
}
