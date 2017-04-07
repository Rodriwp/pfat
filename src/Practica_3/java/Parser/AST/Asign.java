package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;
import java.io.BufferedWriter;

public class Asign {
	public final String ident;
	public final Exp exp;

	public Asign(String ident, Exp exp) {
		this.ident = ident;
		this.exp = exp;
	}
        public void computeAH1() throws CompilerExc {
            int exp1Type = SymbolTable.getVariableType(ident);
            int exp2Type = exp.computeType();
            if (!(exp1Type == exp2Type)) {
                throw new IlegalTypeExc("Ilegal types: Can't assign "+ ident + " of type "+ SymbolTable.typeToString(exp1Type)
                + "  = " +SymbolTable.typeToString(exp2Type)+ " \n" );
            }
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            w.write(tabs +ident+"= ");
            exp.generateCode(w,"");
            w.write(";");
        }

}
