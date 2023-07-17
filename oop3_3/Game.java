package org.example.oop3_3;

public interface Game {
    void start(Integer sizeWord, Integer maxTry); // принимает размер строки, количество попыток, ничего не возвращает
    Answer inputValue(String value); // принимает саму строку, возвращает класс ответ
    GameStatus getGameStatus(); // возвращает состояние игры (запуск, завершение, ...)
}
