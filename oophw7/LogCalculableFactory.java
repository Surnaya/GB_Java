package org.example.oophw7;

public class LogCalculableFactory implements ICalculableFactory{
    private Logable logger;

    public LogCalculableFactory() {
    }

    public LogCalculableFactory(Logable logger) {

        this.logger = logger;
    }


    @Override
    public CalculableSimple createSimple(int primaryArg) {

        return new LogCalculator(new SimpleCalculator(primaryArg), logger);
    }

    @Override
    public CalculableComplex createComplex(int firstArg, int secondArg) {
        return new LogCalculator(new ComplexCalculator(firstArg, secondArg), logger);
    }
}
