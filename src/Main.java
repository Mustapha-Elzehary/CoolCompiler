import java.io.IOException;

/**
 * \class Main this class Where code start Excution<BR>
 * Make good Parser and another bad parser<BR>
 * file paths<BR>
 *     1. TestCases/goodParser.cl For Good and free error code <BR>
 *     2. TestCases/badParser.cl  for file contains syntax Error
 */

public class Main {
    public static void main(String[] args) throws IOException {
        String srcFile = "TestCases/goodParser.cl";
        if (args.length >= 1) srcFile = args[0];

        Lexer_IO lexer = new Lexer_IO(srcFile);
        lexer.writeTokens(srcFile + "-lex");


        Parser_IO parser = new Parser_IO(lexer);
        parser.writeCST(srcFile + "-cst");

    }
}