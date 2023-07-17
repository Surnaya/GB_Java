package org.example.oop3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }
    @Override
    void playGame(Logs logs) {
        NumberGame numberGame = new NumberGame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество символов в слове ");
        int sizeWord = scanner.nextInt();
        System.out.println("Введите количество попыток ");
        int maxTry = scanner.nextInt();
        numberGame.start(sizeWord, maxTry);
        scanner.nextLine();
        while (numberGame.getGameStatus().equals(GameStatus.START)){
            System.out.println("Введите слово ");
            String value = scanner.nextLine();
            Answer answer = numberGame.inputValue(value);
            logs.addInfo(value);
            if(answer!=null){
                System.out.println("answer = " + answer);

            }
        }
    }

}
