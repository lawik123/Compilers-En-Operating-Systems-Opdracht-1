import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by lars on 3/6/2017.
 */
public class Compiler {

    public static void main(String[] args) {
        try {
            // Create lexer and get a token stream
            File file = new File("test.txt");
            FileInputStream fis = new FileInputStream(file);
            LangLexer lexer =
                    new LangLexer(new ANTLRInputStream(fis));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Create a parser (using tokenstream as input)
            // and parse main rule
            LangParser parser = new LangParser(tokens);
            LangParser.ProgContext programTree = parser.prog();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String a = "pietje";
        System.out.println(a+1+1);
    }
}