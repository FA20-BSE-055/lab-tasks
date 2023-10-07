/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa20-bse-054
 */
// Step 1: Logger interface (unchanged)

// Step 2: Concrete Logger classes (unchanged)

// Step 3: Create separate chains for error, warning, and info log levels
public class ChainOfResponsibilityDemo1 {
    public static void main(String[] args) {
        // Create loggers for different levels
        Logger errorLoggerChain = createErrorLoggerChain();
        Logger warningLoggerChain = createWarningLoggerChain();
        Logger infoLoggerChain = createInfoLoggerChain();

        // Log messages at different levels
        errorLoggerChain.logMessage("This is an error message.");
        warningLoggerChain.logMessage("This is a warning message.");
        infoLoggerChain.logMessage("This is an info message.");
    }

    // Helper method to create an error logger chain
    private static Logger createErrorLoggerChain() {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        Logger databaseLogger = new DatabaseLogger();

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(databaseLogger);

        return consoleLogger;
    }

    // Helper method to create a warning logger chain
    private static Logger createWarningLoggerChain() {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();

        consoleLogger.setNextLogger(fileLogger);

        return consoleLogger;
    }

    // Helper method to create an info logger chain
    private static Logger createInfoLoggerChain() {
        Logger consoleLogger = new ConsoleLogger();

        return consoleLogger;
    }
}

