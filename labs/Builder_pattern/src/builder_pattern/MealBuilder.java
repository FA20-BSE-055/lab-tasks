/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_pattern;

public class MealBuilder {

   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem((Item) new VegBurger());
      meal.addItem((Item) new Coke());
      return meal;
   }   

   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem((Item) new ChickenBurger());
      meal.addItem((Item) new Pepsi());
      return meal;
   }

    
}
