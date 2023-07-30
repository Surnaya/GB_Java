package org.example.oophw7;

public interface ICalculableFactory {
    CalculableSimple createSimple(int primaryArg);
    CalculableComplex createComplex(int firstArg, int secondArg);
}
