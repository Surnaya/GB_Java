package org.example.oophw7;

public class CalculableFactory implements ICalculableFactory{

    public CalculableSimple createSimple(int primaryArg) {
        return new SimpleCalculator(primaryArg);
    }
    public CalculableComplex createComplex(int firstArg, int secondArg) {
        return new ComplexCalculator(firstArg, secondArg);
    }

}
