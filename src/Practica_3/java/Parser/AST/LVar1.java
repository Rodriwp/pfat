package AST;


import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class LVar1 implements LVar {
	public final String ident;

	public LVar1(String ident) {
		this.ident = ident;
	}

        public void computeAH1(int type) throws CompilerExc {
            SymbolTable.newVariableEntry(ident, type);
        }
        public String generateCode(String tabs){
            return ident + ";";
        }
}
