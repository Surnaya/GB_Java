package org.example.lesson4;

import java.util.Scanner;
import java.util.Stack;

public class HW4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку, содержащую символы: (, ), {, }, [, ]: ");
        String myString = sc.nextLine();
        System.out.println(isValid(myString));
    }
    /**
     * @apiNote метод, определяющий валидность входящей строки
     * @param s строка для проверки
     * @return true/false
     */
    private static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{')) {
                myStack.push(s.charAt(i));
            } else {
                if (myStack.empty()) return false;
                if ((s.charAt(i) == ')') && (myStack.peek() != '(')) return false;
                if ((s.charAt(i) == ']') && (myStack.peek() != '[')) return false;
                if ((s.charAt(i) == '}') && (myStack.peek() != '{')) return false;
                myStack.pop();
            }
        }
        return myStack.empty();
    }
}
