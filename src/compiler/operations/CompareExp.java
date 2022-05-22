package compiler.operations;

import compiler.Token;

public class CompareExp {
    public boolean compare(Token comp, double first, double second){
        return switch (comp.getToken()) {
            case ">" -> Double.compare(first, second) == 1;
            case "~" -> Double.compare(first, second) == 0;
            case "<" -> Double.compare(first, second) == -1;
            case "!=" -> Double.compare(first, second) != 0;
            default -> throw new IllegalArgumentException("Illegal value: " + comp.getToken());
        };
    }
}
