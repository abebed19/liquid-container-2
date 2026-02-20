
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //The two containers for holding values
        Container container1 = new Container();
        Container container2 = new Container();
        while (true) {
            System.out.println("First: "+container1);
            System.out.println("Second: "+container2);
            System.out.print("> ");
  
            

            String input = scan.nextLine(); 
            if (input.equals("quit")) {
                break;
            }
             
            String[] commands = input.split(" ");
            int ammount = Integer.valueOf(commands[1]);
                switch(commands[0]){
                    case "add":
                        container1.add(ammount);
                        break;
                    case "remove":
                        container2.remove(ammount);
                        break;
                    case "move":
                        int toBeMoved;
                       //removing from first container
                        if (container1.contains() == 0){
                           toBeMoved = 0;
                        }
                        else if( ammount >= 100 ){
                            toBeMoved = container1.contains();
                            container1.add(0);
                        }else if( ammount >= container1.contains()){
                             toBeMoved = container1.contains();
                             container1.add(0);
                         }else{
                            container1.remove(ammount) ;
                            toBeMoved = ammount;
                        }
                        //adding to second container
                        if(container2.contains() + toBeMoved > 100)
                            container2.add(100);
                        else 
                            container2.add(container2.contains()+ toBeMoved);
                        break;
                        
       
                    default:
                        break;
                
                }
            
        }
    }

}
