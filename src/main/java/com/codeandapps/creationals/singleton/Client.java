package com.codeandapps.creationals.singleton;

public class Client {
    public static void main(String[] args) {
        // Get the singleton instance of RobotManager
        RobotManager robotManager = RobotManager.getInstance();

        // Use the singleton instance to manage robots
        robotManager.manageRobot("Robo1");
        robotManager.manageRobot("Robo2");

        // Attempt to get another instance (should return the same instance)
        RobotManager anotherRobotManager = RobotManager.getInstance();

        // Verify that both references point to the same instance
        System.out.println("Are both instances the same? " + (robotManager == anotherRobotManager));
    }
}
