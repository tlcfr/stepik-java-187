package ru.tlcfr.stepik.java187.module_4.step_4_2_7;

public class MoveRobot {

    private MoveRobot() {
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int maxAttempts = 3;
        int attempts = 0;
        boolean success = false;

        while (!success) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                success = true;
            } catch (RobotConnectionException e) {
                if (++attempts == maxAttempts) {
                    throw e;
                }
            }
        }
    }
}
