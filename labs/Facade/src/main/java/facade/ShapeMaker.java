
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
      triangle = new Triangle();
      oval = new Oval();

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

