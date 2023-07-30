package org.example.oophw7;

public class LogCalculator implements CalculableSimple, CalculableComplex{
    private CalculableSimple decorated;
    private Logable logable;
    private CalculableComplex decoratedComplex;
    public LogCalculator(CalculableSimple decorated, Logable logable){
        this.decorated = decorated;
        this.logable = logable;

    }
    public LogCalculator(CalculableComplex decoratedComplex, Logable logable){
        this.decoratedComplex = decoratedComplex;
        this.logable = logable;

    }

    @Override
    public CalculableSimple sumSimple(int arg) {
        logable.log(("вызвался метод суммы с параметром " +arg));
        return decorated.sumSimple(arg);
    }

    @Override
    public CalculableSimple multiSimple(int arg) {
        logable.log(("вызвался метод умножения с параметром " +arg));
        return decorated.multiSimple(arg);
    }



    @Override
    public int getResult() {
        logable.log((" пользователь запросил результат"));
        return decorated.getResult();
    }

    @Override
    public void sumComplex(int arg1, int arg2) {
        logable.log("вызвался метод суммы с параметром : " + arg1 + " + " + arg2+ "i");
        decoratedComplex.sumComplex(arg1,arg2);

    }

    @Override
    public void multComplex(int arg1, int arg2) {
        logable.log("вызвался метод умножения с параметром : " + arg1 + " + " + arg2+ "i");
        decoratedComplex.multComplex(arg1,arg2);

    }
}
