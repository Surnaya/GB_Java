package org.example.oophw2;

public class Cat implements Sport{
    private final String name;
    private final Integer maxJump;
    private final Integer maxRunDistance;

    public Cat(String name, Integer maxJump, Integer maxRunDistance) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRunDistance = maxRunDistance;
    }
    @Override
    public String jump(Wall height) {
        if(height.getHeightWall()>maxJump){
            return ("Кот " + name + " не перепрыгнул стену высотой " + height.getHeightWall() +
                    " метров. Он проиграл");
        }else {
            return ("Кот " + name + " перепрыгнул стену высотой " + height.getHeightWall());
        }
    }

    @Override
    public String run(Treadmill length) {
        if(length.getLengthTreadmill()>maxRunDistance){
            return ("Кот " + name + " не пробежал " + length.getLengthTreadmill() +
                    " км. Он проиграл");
        }else {
            return ("Кот " + name + " пробежал " + length.getLengthTreadmill() + " км");
        }
    }

}