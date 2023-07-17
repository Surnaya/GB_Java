package org.example.oop3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EngGame extends AbstractGame{

    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }
    @Override
    void playGame(Logs logs) {
        EngGame engGame = new EngGame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество символов в слове ");
        int sizeWord = scanner.nextInt();
        System.out.println("Введите количество попыток ");
        int maxTry = scanner.nextInt();
        engGame.start(sizeWord, maxTry);
        scanner.nextLine();
        while (engGame.getGameStatus().equals(GameStatus.START)){
            System.out.println("Введите слово ");
            String value = scanner.nextLine();
            Answer answer = engGame.inputValue(value);
            logs.addInfo(value);

            if(answer!=null){
                System.out.println("answer = " + answer);

            }
        }
    }
}
