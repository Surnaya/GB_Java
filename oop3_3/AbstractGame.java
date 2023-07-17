package org.example.oop3_3;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game{
    Integer sizeWord;
    Integer maxTry;
    int currentTry;
    String computerWord; // слово, которое загадывает компьютер
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord; // задаем длину слова
        this.maxTry =maxTry; //задаем колич попыток
        computerWord = generateWord(); //генерация слова
        System.out.println("comp:  " + computerWord);
        this.gameStatus = GameStatus.START; // старт игры
        this.currentTry = 0;


    }

    @Override
    public Answer inputValue(String value) {
        if (currentTry >= maxTry) {
            gameStatus = GameStatus.FINISH;
            System.out.println("Попытки закончились. Вы проиграли");
            return null;
        }
        int bull = 0;
        int cow =0;
        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == computerWord.charAt(i)){
                bull++;
                cow++;
            }else if(computerWord.contains(String.valueOf(value.charAt(i)))){
                cow++;
            }
        }
        currentTry++;
        if(sizeWord.equals(bull)){
            gameStatus = GameStatus.FINISH;
            System.out.println("Вы победили");
            return null;
        }
        return new Answer(bull, cow, currentTry);


    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }
    abstract List<String> generateCharList();
    private String generateWord(){
        List<String> charList = generateCharList();
        String result = "";
        Random random = new Random();
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size()); //генерация рандомного индекса от 0 до длины алфавита
            result += charList.get(randomIndex); //добавление символа алфавита с рандомным индексом
            charList.remove(randomIndex); // удаляет рандомный индекс, чтобы избежать дубли
        }

        return result;
    }
    abstract void playGame(Logs log);
}
