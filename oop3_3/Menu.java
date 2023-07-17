package org.example.oop3_3;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    void startMenu() throws IOException {
        Logs logs = new Logs();
        logs.addLog();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите пункт меню:\n" +
                    "1. Новая игра\n" +
                    "2. Просмотр лога\n" +
                    "3. Выйти");
            int menuNumber = scanner.nextInt();
            switch (menuNumber) {
                case 1 -> newGame(logs);
                case 2 -> logs.printToConsole();
                case 3 -> flag = false;
            }
        }
    }

    void newGame(Logs logs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим игры:\n" +
                "1. Игра с цифрами\n" +
                "2. Игра с русскими буквами\n" +
                "3. Игра с английскими буквами\n");
        int switchNumber = scanner.nextInt();
        switch (switchNumber) {
            case 1 -> {
                logs.addModeGame(switchNumber);
                NumberGame ng = new NumberGame();
                ng.playGame(logs);
            }
            case 2 -> {
                logs.addModeGame(switchNumber);
                RuGame rg = new RuGame();
                rg.playGame(logs);
            }
            case 3 -> {
                logs.addModeGame(switchNumber);
                EngGame engGame = new EngGame();
                engGame.playGame(logs);
            }
        }
    }

}
