import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * Created by lars on 3/6/2017.
 */
public class Compiler {

    public static void main(String[] args) {
        try {
            // Create lexer and get a token stream
            LangLexer lexer =
                    new LangLexer(new ANTLRFileStream("test.txt"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Create a parser (using tokenstream as input)
            // and parse main rule
            LangParser parser = new LangParser(tokens);
            LangParser.ProgContext programTree = parser.prog();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}