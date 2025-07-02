package com.codeandapps.creationals.singleton;

public class RobotManager {

    private static RobotManager instance;

    private RobotManager() {
        // Private constructor to prevent instantiation
    }

    public static synchronized RobotManager getInstance() {
        if (instance == null) {
            instance = new RobotManager();
        }
        return instance;
    }

    public void manageRobot(String robotName) {
        System.out.println("Managing robot: " + robotName);
    }
}
