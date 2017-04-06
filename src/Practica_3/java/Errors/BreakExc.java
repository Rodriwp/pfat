package Errors;


public class BreakExc extends CompilerExc {

        private String msg;

        public BreakExc(String msg) {
                this.msg = msg;
        }

        public String toString() {
                return msg;
        }
}

