/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask2;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Creating prototype objects
        Circle circlePrototype = new Circle(5.0);
        Square squarePrototype = new Square(4.0);
        Fish fishPrototype = new Fish("Goldfish");
        Human humanPrototype = new Human("John Doe");

        // Cloning objects
        Circle clonedCircle = circlePrototype.clone();
        Square clonedSquare = squarePrototype.clone();
        Fish clonedFish = fishPrototype.clone();
        Human clonedHuman = humanPrototype.clone();

        // Checking equality
        System.out.println("Are the original and cloned circles equal? " + circlePrototype.equals(clonedCircle));
        System.out.println("Are the original and cloned squares equal? " + squarePrototype.equals(clonedSquare));
        System.out.println("Are the original and cloned fish equal? " + fishPrototype.equals(clonedFish));
        System.out.println("Are the original and cloned humans equal? " + humanPrototype.equals(clonedHuman));
    }
}