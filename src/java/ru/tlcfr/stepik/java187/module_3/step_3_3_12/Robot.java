package ru.tlcfr.stepik.java187.module_3.step_3_3_12;

public class Robot {

    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnLeft() {
        direction = Direction.values()[(direction.ordinal() + 3) % 4];
    }

    public void turnRight() {
        direction = Direction.values()[(direction.ordinal() + 1) % 4];
    }

    public void stepForward() {
        switch (direction) {
            case UP -> y++;
            case DOWN -> y--;
            case LEFT -> x--;
            case RIGHT -> x++;
        }
    }
}
