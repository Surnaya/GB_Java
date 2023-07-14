package org.example.oophw2;

public class Robot implements Sport{
    private final String name;
    private final Integer maxJump;
    private final Integer maxRunDistance;

    public Robot(String name, Integer maxJump, Integer maxRunDistance) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRunDistance = maxRunDistance;
    }
    @Override
    public String jump(Wall height) {
        if(height.getHeightWall()>maxJump){
            return ("Робот " + name + " перепрыгнул стену высотой " + height.getHeightWall() +
                    " метров. Он проиграл");
        }else {
            return ("Робот " + name + " перепрыгнул стену высотой " + height.getHeightWall());
        }
    }

    @Override
    public String run(Treadmill length) {
        if(length.getLengthTreadmill()>maxRunDistance){
            return ("Робот " + name + " не пробежал " + length.getLengthTreadmill() +
                    " км. Он проиграл");
        }else {
            return ("Робот по имени " + name + " пробежал " + length.getLengthTreadmill() + " км");
        }
    }

}