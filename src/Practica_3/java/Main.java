import Parser.*;
import Lexer.*;
import java.io.*;
import AST.S;

public class Main{
    private static void codeGenerator(String className, S ast) {
        try {
            BufferedWriter w= new BufferedWriter(new FileWriter(className + ".java"));
            w.write("import java.util.*;");
            w.newLine();
            w.newLine();
            w.write("public class " + className + " {");
            w.newLine();
            ast.generateCode(w,"\t");
            w.newLine();
            w.write("}");
            w.newLine();
            w.close();
            System.out.println("Code generated in file " + className + ".java");
        }catch(IOException e) {
            System.out.println("IO error trying to write in file " +
                className + ".java");
        }
    }
    public static void main(String args[]) throws Exception{
      java.io.BufferedReader in;
      Yylex sc;
      parser p;
      java_cup.runtime.Symbol sroot;
      boolean error=false;

      //El primer parametro es el nombre del fichero con el programa
      if (args.length != 2) {
        System.out.println(
          "Uso: java Main <nombre_fichero> <nombre_programa>");
        error=true;
      }

      //Análisis léxico y sintáctico

      if (!error) {
          try {
              in = new java.io.BufferedReader(new java.io.FileReader(args[0]));
              sc = new Yylex(in);
              p = new parser(sc);
              sroot = p.parse();
              System.out.println("Analisis lexico y sintactico correctos");

              S root = (S) sroot.value;
              root.computeAH1();
              System.out.println("Análisis semántico correcto");

              //generar codigo
              codeGenerator(args[1],root);
          } catch(IOException e) {
              System.out.println("Error abriendo fichero: " + args[0]);
              error= true;
          }
      }
    }

}


