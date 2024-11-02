package ru.tlcfr.stepik.java187.module_4.step_4_3_8;

import java.util.logging.*;

public class ConfigureLogging {

    private ConfigureLogging() {
    }

    private static void configureLogging() {
        Logger aLogger = Logger.getLogger("org.stepic.java.logging.ClassA");
        aLogger.setLevel(Level.ALL);

        Logger bLogger = Logger.getLogger("org.stepic.java.logging.ClassB");
        bLogger.setLevel(Level.WARNING);

        Formatter packageFormatter = new XMLFormatter();

        Handler packageHandler = new ConsoleHandler();
        packageHandler.setLevel(Level.ALL);
        packageHandler.setFormatter(packageFormatter);

        Logger packageLogger = Logger.getLogger("org.stepic.java");
        packageLogger.setUseParentHandlers(false);
        packageLogger.addHandler(packageHandler);
    }
}
