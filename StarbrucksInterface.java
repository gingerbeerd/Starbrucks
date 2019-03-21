import java.util.*;

public class StarbrucksInterface 
{
    public static void main (String[] args) 
    {
       Scanner console = new Scanner(System.in);
       Store s = new Store();
       int      demand,menu =0, menu2 = 0;
       String   name;
       double setup, unit, inventory, selling;
    
       
       
       
       while (menu!=4)
       {
           //Display menu
           System.out.println("Please select from the following options(1-4):");
           System.out.println("1. input data for one product ");
           System.out.println("2. show data from one product");
           System.out.println("3. show the replenishment strategy for a product");
           System.out.println("4. exit program");
           menu = console.nextInt();
           if (menu==1)
            {System.out.println("Select a product to enter or overwrite (1-3):");
             System.out.println("1. "+s.getProductName(1)); 
             System.out.println("2. "+s.getProductName(2)); 
             System.out.println("3. "+s.getProductName(3));
            
             menu2 = console.nextInt();   
             while (menu2>0 && menu2<4){
                 System.out.println("Enter Product");
                 System.out.print("Product Name");
                 name = console.next();
                 System.out.print("Demand");
                 demand = console.nextInt();
                 System.out.print("Setup Cost");
                 setup = console.nextDouble();
                 System.out.print("Unit Cost");
                 unit = console.nextDouble();
                 System.out.print("Inventory Cost");
                 inventory = console.nextDouble();
                 System.out.print("Selling Price");
                 selling = console.nextDouble();
                 //add variables to product  
                 switch(menu2){
                     case 1: s.setProduct1(name, demand, setup, unit, inventory, selling);
                     case 2: s.setProduct1(name, demand, setup, unit, inventory, selling);
                     case 3: s.setProduct1(name, demand, setup, unit, inventory, selling);
                //change for adding multiple products
                
                    }
                  menu2=4;
                }
            }
           
       }
       
       
       
    }
}