package org.example.oop3_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.*;

public class Logs{
    private static final Logger LOG = Logger.getLogger(AbstractGame.class.getName());
    FileHandler fileHandler = new FileHandler("/Users/surnaya.m/Desktop/Geek/Java/java_api/java_lessons/src/main/java/org/example/oop3_3/logger.log");

    public Logs() throws IOException {
    }
    public void addLog(){
        LOG.addHandler(fileHandler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);
        LOG.setUseParentHandlers(false);
    }
    public void addInfo(String value){
        LOG.log(Level.INFO, "Пользователь ввел " + value);
    }
    public void addModeGame(int switchNumber){
        LOG.log(Level.INFO, "Пользователь выбрал режим " + switchNumber);
    }
    public void printToConsole() throws IOException {
        FileReader fileReader = new FileReader("/Users/surnaya.m/Desktop/Geek/Java/java_api/java_lessons/src/main/java/org/example/oop3_3/logger.log");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = bufferedReader.readLine();
        while (str != null){
            System.out.println(str);
            str=bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
