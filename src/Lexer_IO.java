import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "UnusedReturnValue"})
/**
 * \class Lexer_IO
 * The Lexer_IO code interface class contains function used by {@link Main#main}
 */
public class Lexer_IO {
    public CoolLexer lexer; /**< Lexer analizer For cool lang lexer */
    public CommonTokenStream tokensStream; /**< stream of token from fileName.cl file   */
    public List<Token> tokens;  /**< list of all tokens of cool lang  */
    public List<Token> errors;  /**< list of errors found in File  */
    public List<String> outputTokens;  /**< list tokens found after proccessing file */

    /**
     * A constructor.
     * Init Lexer of generated Files From antlar<BR>
     * <B>Lexer</B>: Creat new CoolLexer Object<BR>
     * <B>tokenStream</B>: filled with COOL tokens Generated From Antlar<BR>
     *start Lexing File
     * @param fileName String of file name.
     */
    public Lexer_IO(String fileName) {
        CharStream charStream;
        try{
            charStream = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lexer = new CoolLexer(charStream);
        tokensStream = new CommonTokenStream(lexer);
        tokensStream.fill();
        tokens = tokensStream.getTokens();
        lex();
    }

    /**
     * lex function which is Used to lexing input file<BR>
     * Fisrt it fills Tokens found in file into <B>outputTokens</B><BR>
     * then it checks for Errors fill <B>errors</B> if Found<BR>
     * @return void
     */
    private void lex() {
        outputTokens = new ArrayList<>();
        errors = new ArrayList<>();
        String[] ruleNames = lexer.getRuleNames();
        for (Token token : tokens) {
            if (token.getType() > 0) {        //Not EOF
                if (lexer.getRuleNames()[token.getType() - 1].equals("ErrorChar")) {
                    errors.add(token);
                } else {
                    outputTokens.add(Integer.toString(token.getLine()));
                    outputTokens.add(ruleNames[token.getType() - 1]);
                    if (shouldBeTriplet(ruleNames[token.getType()]))
                        outputTokens.add(token.getText());
                }
            }
        }

        if (hasErrors()) reportErrors();
    }

    /**
     *
     * @return token stream  of input file
     */
    public CommonTokenStream getTokensStream() {
        return tokensStream;
    }
    /**
     *
     * @return token processed from input file
     */
    public List<String> getTokens() {
        return outputTokens;
    }

    /**
     * Function To Write Tokens Found in file into extrnal file
     * @param outputFile file path to write <B>outputTokens</B> in
     *
     */
    public void writeTokens(String outputFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (String token : outputTokens) {
                writer.write(token + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * this function checks if the input tokenName can have 3 param in COOL  {@code lex rules}
     * @param tokenName token Name Found in file
     * @return True If <B>tokenName</B> is in List
     * <UL>
     *     <LI>SELF</LI>
     *     <LI>STRING</LI>
     *     <LI>NUM</LI>
     *     <LI>LITERAL</LI>
     *     <LI>ID</LI>
     * </UL>
     */
    public boolean shouldBeTriplet(String tokenName) {
        return tokenName.equals("SELF")
                || tokenName.equals("STRING")
                || tokenName.equals("NUM")
                || tokenName.equals("LITERAL")
                || tokenName.equals("ID");
    }

    /**
     * check if file contains error
     * @return True if file contains error
     * @return False if file contains no  error
     */
    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    /**
     *  Report For Errors if Found by Throwing an exeption into console
     */
    public void reportErrors() {
        StringBuilder report = new StringBuilder();
        for (Token errorToken : errors) {
            report.append(
                    String.format(
                            "Lexer ERROR: Line %s - invalid character %s\n",
                            errorToken.getLine(),
                            errorToken.getText()
                    )
            );
        }
        throw new RuntimeException(report.toString());
    }
}