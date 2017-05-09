import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by lars on 3/6/2017.
 */
public class Compiler {


    public static void main(String[] args) {
        try {
            // Create lexer and get a token stream
            ANTLRInputStream inputStream = new ANTLRFileStream("test2.txt");

            LangLexer lexer = new LangLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create parser
            LangParser parser = new LangParser(tokens);
            ParseTree tree = parser.prog(); // begin parsing at expression rule

            try {
                TypeEvaluator typeEvaluator = new TypeEvaluator();
                typeEvaluator.visit(tree);
                System.out.println("success");

                CodeGenerator codeGenerator = new CodeGenerator();
                ArrayList<String> code = codeGenerator.visit(tree);

                for(String c: code) {
                    System.out.println(c);
                }
            }catch (EvaluateException e){
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}