/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa20-bse-054
 */
public class DatabaseLogger implements Logger {
    public void logMessage(String message) {
        // Simulate logging to a database
        System.out.println("Database Logger: " + message);
    }

    public void setNextLogger(Logger nextLogger) {
        // DatabaseLogger is the end of the chain, so it doesn't need a next logger.
    }
}
