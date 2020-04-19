public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = "bad.cl";
        if(args.length >=1) {
            inputFile=args[0];
        }

        IO lexer = new IO(inputFile);
        lexer.writeTokens(inputFile + "-lex" );
    }
}
