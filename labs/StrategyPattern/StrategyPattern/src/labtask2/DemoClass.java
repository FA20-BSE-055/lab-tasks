/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask2;
public class DemoClass {
    public static void main(String[] args) {
      
        CalculationHandler additionHandler = new AdditionHandler();
        CalculationHandler subtractionHandler = new SubtractionHandler();
        CalculationHandler multiplicationHandler = new MultiplicationHandler();
        CalculationHandler divisionHandler = new DivisionHandler();
        CalculationHandler powerHandler = new PowerHandler();

      
        additionHandler.setNextHandler(subtractionHandler);
        subtractionHandler.setNextHandler(multiplicationHandler);
        multiplicationHandler.setNextHandler(divisionHandler);
        divisionHandler.setNextHandler(powerHandler);

        // Example usage
        int result = additionHandler.handleRequest(50, 50);
        System.out.println("Result: " + result);
    }
}
