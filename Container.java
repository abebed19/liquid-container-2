/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class Container {
       
   private int ammount = 0;
   
   public Container(){    
   }
   
   public int contains(){
       return ammount;
   }
   //Adding new liquid to the container
   public void add(int toBeAdded){
      if(toBeAdded > 0){
          if(toBeAdded + ammount > 100){
              this.ammount =100;
          }else {
              ammount = ammount + toBeAdded;
      
          }
      }  
      
   }
   
   public void remove(int toBeRemoved){
       if(toBeRemoved > 0){
           if(toBeRemoved < ammount){
               ammount = ammount - toBeRemoved; 
           }else {
               ammount = 0;
           }
       }
           
   }
   
   @Override
   public String toString(){
      return ammount+"/100";    
   }
   public static void main(String... args){
       Container container = new Container();
       System.out.println(container);
       
       container.add(50);
       System.out.println(container);
       System.out.println(container.contains());
       
       container.remove(60);
       System.out.println(container);
       container.add(200);
       System.out.println(container);
   }
}
