package ru.tlcfr.stepik.java187.module_4.step_4_2_7;

public interface RobotConnection extends AutoCloseable {

    void moveRobotTo(int x, int y);

    @Override
    void close();
}
