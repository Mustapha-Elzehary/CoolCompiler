import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * \class ParsingErrorListener @extends BaseErrorListener
 */
public class ParsingErrorListener extends BaseErrorListener {

    public static final ParsingErrorListener INSTANCE = new ParsingErrorListener();

    /**
     *   throw exeception if error found
     * @param recognizer
     * @param offendingSymbol
     * @param line nuber of line  where error found
     * @param charPositionInLine postion of charcter in error line
     * @param msg error msage to throw
     * @param e exception will be thrown
     * @throws ParseCancellationException
     */
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
    }
}