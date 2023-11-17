/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
   private Shape triangle;
   private Shape oval;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
      triangle = new Trirangle();
      oval = new oval();

   }

   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }

   public void drawTriangle() {
         triangle.draw();
    } 
   
   public void drawOval() {
         oval.draw();
    } 

   
    

}