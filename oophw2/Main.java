package org.example.oophw2;

public class Main {
    public static void main(String[] args) {
        Sport[] sportsmen = {
                new Human("Tom", 2, 15),
                new Robot("Android", 12, 100),
                new Cat("Barsik", 3, 40),
        };

        Mission[] obstacles = {
                new Mission(new Treadmill(20), new Wall(6)),
        };


        runMission(sportsmen, obstacles);

    }

    private static void runMission(Sport[] sportsmen, Mission[] missions) {
        for (int i = 0; i < sportsmen.length; i++) {
            for (Mission o : missions) {
                if(!sportsmen[i].jump(o.getHeight()).contains("не")){
                    System.out.println(sportsmen[i].jump(o.getHeight()));
                    if(!sportsmen[i].run(o.getLength()).contains("не")){
                        System.out.println(sportsmen[i].run(o.getLength()));
                    }
                    else {
                        System.out.println(sportsmen[i].run(o.getLength()));
                        break;
                    }
                } else{
                    System.out.println(sportsmen[i].jump(o.getHeight()));
                    break;
                }
            }
        }
    }
}