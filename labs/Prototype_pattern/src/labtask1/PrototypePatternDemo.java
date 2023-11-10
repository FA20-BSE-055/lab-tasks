/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask1;


public class PrototypePatternDemo {
    public static void main(String[] args) {
      
        Circle circlePrototype = new Circle(5.0);


        Circle clonedCircle = circlePrototype.clone();

      
        System.out.println("Are the original and cloned circles equal? " + circlePrototype.equals(clonedCircle));

      
        Square squarePrototype = new Square(4.0) {
            @Override
            public boolean equals(Shape other) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };

        Square clonedSquare = squarePrototype.clone();
        System.out.println("Are the original and cloned squares equal? " + squarePrototype.equals(clonedSquare));
    }
}