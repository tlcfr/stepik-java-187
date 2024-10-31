package ru.tlcfr.stepik.java187.module_3.step_3_3_12;

public class MoveRobot {

    private MoveRobot() {
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int diff;
        Direction direction;

        diff = toX - robot.getX();
        if (diff != 0) {
            direction = diff > 0 ? Direction.RIGHT : Direction.LEFT;
            while (robot.getDirection() != direction) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        diff = toY - robot.getY();
        if (diff != 0) {
            direction = diff > 0 ? Direction.UP : Direction.DOWN;
            while (robot.getDirection() != direction) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
