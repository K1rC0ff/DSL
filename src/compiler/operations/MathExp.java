package compiler.operations;

import compiler.Token;

public class MathExp {
    public double execute(Token op, double first, double second){
        return switch (op.getToken()) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> first / second;
            default -> throw new IllegalArgumentException("Illegal value: " + op.getToken());
        };
    }
}
