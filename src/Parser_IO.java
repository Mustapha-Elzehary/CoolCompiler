import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("ALL")

public class Parser_IO {

    public CoolParser coolParser;/**< cool pasrser instance {@link CoolParser} */
    public ParseTree cachedParseTree;/**< cached Parse Tree contains parsed Tree of tokens  {@link ParseTree} */

    /**
     * A Constructor. <BR>
     * @param lexer
     */
    public Parser_IO(Lexer_IO lexer) {
        coolParser = new CoolParser(lexer.getTokensStream());

        coolParser.removeErrorListeners();
        coolParser.addErrorListener(ParsingErrorListener.INSTANCE);
    }

    /**
     *
     * @return tree string contains tree generated
     */

    public String getCST() {
        CoolParser.ProgramContext program = coolParser.program();
        String tree = program.toStringTree(coolParser);
        return tree;
    }

    /**
     * write tree to file
     * @param fileName string contains file path where result will be written
     */
    public void writeCST(String fileName){
        String tree = getCST();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(tree);
            bw.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    /***
     * return tree after it parsed
     * @return parsed Tree
     */

    public ParseTree parse() {
        // coolParser.addParseListener(new CoolBaseListener());
        if (cachedParseTree == null) cachedParseTree = coolParser.globals();
        return cachedParseTree;
    }

}