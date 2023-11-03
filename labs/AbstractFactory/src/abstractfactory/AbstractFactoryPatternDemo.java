
package abstractfactory;

public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
     
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
     
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      
      shape1.draw();
      
      Shape shape2 = shapeFactory.getShape("SQUARE");
      
      shape2.draw();
      
     
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      
      shape3.draw();
      
      Shape shape4 = shapeFactory1.getShape("SQUARE");
     
      shape4.draw();
      
       
     AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);

      Shape shape5 = shapeFactory2.getShape("DOUBLEBORDEREDROUNDEDRECTANGLE");
      
      shape5.draw();
      
       Shape shape6 = shapeFactory2.getShape("DOUBLEBORDEREDROUNDTRIANGLE");
      
      shape6.draw();
    
      AbstractFactory shapeFactory3 = FactoryProducer.getFactory(true); 
      
       Shape shape7 = shapeFactory3.getShape("DOUBLEBORDEREDTRIANGLE");
      
      shape7.draw();
   }
}