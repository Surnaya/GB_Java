package org.example.oophw2;

public class Human implements Sport {
    private final String name;
    private final Integer maxJump;
    private final Integer maxRunDistance;

    public Human(String name, Integer maxJump, Integer maxRunDistance) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRunDistance = maxRunDistance;
    }
    @Override
    public String jump(Wall height) {
        if(height.getHeightWall()>maxJump){
            return ("Человек " + name + " не  перепрыгнул стену высотой " + height.getHeightWall() +
                    " метров. Он проиграл");
        }else {
            return ("Человек " + name + " сперепрыгнул стену высотой " + height.getHeightWall());
        }
    }

    @Override
    public String run(Treadmill length) {
        if(length.getLengthTreadmill()>maxRunDistance){
            return ("Человек " + name + " не пробежал " + length.getLengthTreadmill() +
                    " км. Он проиграл");
        }else {
            return ("Человек " + name + " пробежал " + length.getLengthTreadmill() + " км");
        }
    }
}