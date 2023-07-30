package org.example.oophw7;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;
    public ViewCalculator(ICalculableFactory calculableFactory) {

        this.calculableFactory = calculableFactory;
    }
    public void run() {
        boolean flag = true;
        while (flag) {
            System.out.println(" == Выберите вариант == ");
            int var = promptInt("1. Калькулятор простых чисел.\n" +
                                "2. Калькулятор комплексных чисел.\n" +
                                "3. Выйти.\n");
            switch (var) {
                case 1: {
                    int primaryArg = promptInt("Введите первый аргумент: ");
                    CalculableSimple calculator = calculableFactory.createSimple(primaryArg);
                    while (true) {
                        String cmd = prompt("Введите команду (*, +, =) : ");
                        if (cmd.equals("*")) {
                            int arg = promptInt("Введите второй аргумент: ");
                            calculator.multiSimple(arg);
                            continue;
                        }
                        if (cmd.equals("+")) {
                            int arg = promptInt("Введите второй аргумент: ");
                            calculator.sumSimple(arg);
                            continue;
                        }
                        if (cmd.equals("=")) {
                            int result = calculator.getResult();
                            System.out.printf("Результат %d\n", result);
                            break;
                        }
                    }
                    String cmd = prompt("Еще посчитать (Y/N)?");
                    if (cmd.equals("Y")) {
                        continue;
                    }
                    break;
                }

                case 2: {
                    int primaryArg1 = promptInt("Введите первый аргумент: ");
                    int primaryArg2 = promptInt("Введите второй аргумент: ");
                    CalculableComplex calculator1 = calculableFactory.createComplex(primaryArg1, primaryArg2);
                    System.out.println("Комплексное число 1 = " + primaryArg1 + " + " + primaryArg2+ "i");

                    String cmd1 = prompt("Введите команду (*, +, =) : ");
                    if (cmd1.equals("*")) {
                        int arg1 = promptInt("Введите первый аргумент: ");
                        int arg2 = promptInt("Введите второй аргумент: ");
                        System.out.println("Комплексное число 2 = " + arg1 + " + " + arg2+ "i");
                        calculator1.multComplex(arg1, arg2);
                    }
                    if (cmd1.equals("+")) {
                        int arg1 = promptInt("Введите первый аргумент: ");
                        int arg2 = promptInt("Введите второй аргумент: ");
                        System.out.println("Комплексное число 2 = " + arg1 + " + " + arg2 + "i");
                        calculator1.sumComplex(arg1, arg2);
                    }


                    String cmd2 = prompt("Еще посчитать (Y/N)?");
                    if (cmd2.equals("Y")) {
                        continue;
                    }
                    break;
                }
                case 3: {
                    flag = false;
                }

            }

        }
    }

    private String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return Integer.parseInt(in.nextLine());
    }
}
