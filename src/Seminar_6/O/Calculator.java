package Seminar_6.O;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }
        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
    }

    public void calculatorCorrect(CalculatorOperation operation) {
        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        } else {
            throw new InvalidParameterException("Can not perform operation");
        }
    }

    public void calculatorCorrect2(CalculatorOperation operation) {
        switch (operation.getClass().toString()) {
            case "class Seminar_6.O.Addition":
                Addition addition = (Addition) operation;
                addition.setResult(addition.getLeft() + addition.getRight());
                break;
            case "class Seminar_6.O.Subtraction":
                Subtraction subtraction = (Subtraction) operation;
                subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
                break;
            default:
                throw new InvalidParameterException("Can not perform operation");
        }
    }

}
