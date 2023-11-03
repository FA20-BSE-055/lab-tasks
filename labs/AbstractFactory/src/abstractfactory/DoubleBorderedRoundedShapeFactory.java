/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;


public class DoubleBorderedRoundedShapeFactory extends AbstractFactory {

  
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("DOUBLEBORDEREDROUNDEDRECTANGLE")){
         return new DoubleBorderRoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("DOUBLEBORDEREDROUNDEDTRIANGLE")){
         return new DoubleBorderedRoundedtRiangle();
      }	 
      
      return null;
   }
}
