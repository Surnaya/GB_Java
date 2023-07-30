package org.example.oophw7;

public class SimpleCalculator extends Calculator implements CalculableSimple {
    public SimpleCalculator(int primaryArg) {
        super(primaryArg);
    }

    @Override
    public CalculableSimple sumSimple(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public CalculableSimple multiSimple(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}
