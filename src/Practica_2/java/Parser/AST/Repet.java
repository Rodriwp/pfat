package AST;

public class Repet {
	public final Exp exp;
	public final Sentencia sent;

	public Repet(Exp exp, Sentencia sent) {
		this.exp = exp;
		this.sent = sent;
	}
        public void computeAH1() throws CompilerExc {
            if (!(exp.computeType() == SymbolTable.BOOL)) {
                throw new IlegalTypeExc("Ilegal types: while can't accept "+ SymbolTable.typeToString(expType)+ " expresions \n" );
            }
            sent.computeAH1();
        }
}
