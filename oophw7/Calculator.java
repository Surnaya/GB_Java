package org.example.oophw7;

public abstract class Calculator{
    protected int primaryArg;
    protected int firstArg;
    protected int secondArg;

    public Calculator(int primaryArg) {

        this.primaryArg = primaryArg;
    }
    public Calculator(int firstArg, int secondArg) {

        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

}
