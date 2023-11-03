/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;


public class DoubleBorderedShapeFactory extends AbstractFactory {

  
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("DOUBLEBORDEREDTRIANGLE")){
         return new DoubleBorderedTriangle();    
  
   }
      return null;
   }
}
