package ru.tlcfr.stepik.java187.module_3.step_3_3_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.tlcfr.stepik.java187.module_3.step_3_3_12.MoveRobot.moveRobot;

class MoveRobotTest {

    @Test
    void sampleInput1() {
        int toX = 3;
        int toY = 0;
        Robot robot = new Robot(0, 0, Direction.UP);

        moveRobot(robot, toX, toY);

        assertEquals(toX, robot.getX());
        assertEquals(toY, robot.getY());
    }
}
