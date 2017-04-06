package Errors;

public class IlegalTypeExc extends CompilerExc {

    private String msg;

    public IlegalTypeExc(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }
}
