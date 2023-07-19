package org.example.oop4_3;

import java.util.List;

public class Calculator <T>{
    /**
     * @apiNote Написать класс калькулятор, принимающий List целочисленных значений,
     * возвращающий сумму элементов коллекции (метод sum)
     * @param numbers массив чисел
     * @return сумму чисел массива
     */
    public Double sum (List<? extends Number> numbers){
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    /**
     * @apiNote расширить класс калькулятор на умножение
     * @param numbers массив чисел
     * @return умножение чисел массива
     */
    public Double mult (List<? extends Number> numbers){
        Double res = 1.0;
        for (Number number : numbers) {
            res = res * number.doubleValue();
        }
        return res;
    }

    /**
     * @apiNote расширить класс калькулятор на деление
     * @param num1
     * @param num2
     * @return деление чисел
     */
    public Double div(Integer num1, Integer num2){
        Double res = 0.0;
        if(num2 != 0){
            res = (double) (num1/num2);
        } else {
            System.out.println("на ноль делить нельзя");
        }
        return res;
    }

    /**
     * @apiNote расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг, так и инт -
     *     // тут необходимо подумать как наилучшим образом реализовать, что будет если будут приниматься
     *     // округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
     * @param decimalNum десятичное число
     * @return двоичное число
     */
    public Integer bin(T decimalNum){
        String strNum = String.valueOf(decimalNum).replace(".0","");
        Integer intNum = Integer.valueOf(strNum);
        StringBuilder result = new StringBuilder();
        while (intNum > 0) {
            Integer binNum = intNum % 2;
            result.append(binNum);
            intNum /= 2;
        }

        result = result.reverse();
        return Integer.valueOf(result.toString());
    }
}
