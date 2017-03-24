package Errors;

public class IlegalTypeExc extends CompilerExc {

    private String msg;

    public IncorrectTypesExc(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }
}
