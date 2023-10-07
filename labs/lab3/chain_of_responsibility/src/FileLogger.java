/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa20-bse-054
 */
public class FileLogger implements Logger {
    private Logger nextLogger;

    public void logMessage(String message) {
        System.out.println("File Logger: " + message);
        if (nextLogger != null) {
            nextLogger.logMessage(message);
        }
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}