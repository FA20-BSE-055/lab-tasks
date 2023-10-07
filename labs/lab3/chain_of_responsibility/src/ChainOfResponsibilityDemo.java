/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa20-bse-054
 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        Logger databaseLogger = new DatabaseLogger();

        // Set up the chain
        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(databaseLogger);

        // Log messages
        consoleLogger.logMessage("This is an important message.");
    }
}





