package compiler;
import java.util.regex.*;
import java.util.Map;
import java.util.HashMap;

public class Lexer {
    private enum Lexem{
        LEX_SINGLE_OP,
        LEX_DOUBLE_OP,
        LEX_KEYWORD,
        LEX_STRING,
        LEX_INT,
        LEX_DEC,
        LEX_NAME;
    }

    private static Map<Lexem,Pattern> lexems = new HashMap<>();

    public Lexer(){
        lexems.put(Lexem.LEX_SINGLE_OP, Pattern.compile("^[!;,\\+\\-\\*/=\\}\\{\\)\\(<>]$"));
        lexems.put(Lexem.LEX_DOUBLE_OP, Pattern.compile("^((!=)|(==)|(>=)|(<=)|(\\+=)|(-=)|(\\*=)|(/=)|(--)||(\\+\\+))$"));
        lexems.put(Lexem.LEX_KEYWORD, Pattern.compile("^((if)|(else)|(for)|(true)|(false)|(function))$"));
        lexems.put(Lexem.LEX_STRING, Pattern.compile("^(\"[^\"]*\")$"));
        lexems.put(Lexem.LEX_INT, Pattern.compile("^(0|[1-9][0-9]*)$"));
        lexems.put(Lexem.LEX_DEC, Pattern.compile("^(0|((0|[1-9][0-9]*)\\.[0-9]*))$"));
        lexems.put(Lexem.LEX_NAME, Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]*$"));
    }
}
