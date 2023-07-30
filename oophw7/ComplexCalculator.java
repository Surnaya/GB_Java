package org.example.oophw7;

public class ComplexCalculator extends Calculator implements CalculableComplex{

    public ComplexCalculator(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }
    @Override
    public void sumComplex(int arg1, int arg2) {
        firstArg += arg1;
        secondArg += arg2;
        System.out.println("Результат: " + firstArg + " + " + secondArg + "i");
    }
    @Override
    public void multComplex(int arg1, int arg2) {
        int res1 = firstArg * arg1 - secondArg * arg2;
        int res2 = secondArg*arg1 + firstArg*arg2;
        firstArg = res1;
        secondArg = res2;
        System.out.println("Результат: " + firstArg + " + " + secondArg + "i");
    }
}
