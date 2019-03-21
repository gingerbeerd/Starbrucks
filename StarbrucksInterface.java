import java.util.*;

public class StarbrucksInterface 
{
    public static void main (String[] args) 
    {
       Scanner console = new Scanner(System.in);
       Store s = new Store();
       int      demand,menu, menu2 = 0;
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
           if (menu=1)
            {while (menu2!=1){
                System.out.println("Enter Product");
                System.out.print("Product Name");
                name = console.next();
                System.out.print("Demand");
                demand = console.next();
                System.out.print("Setup Cost");
                setup = console.next();
                System.out.print("Unit Cost");
                unit = console.next();
                System.out.print("Inventory Cost");
                inventory = console.next();
                System.out.print("Selling Price");
                selling = console.next();
                
                s.setProduct1(name, demand, setup, unit, inventory, selling);
                
                //change for adding multiple products
                menu=1;
            }
            }
           
       }
       
       if (store.productcount()=0)
        {   
            System.out.print("No Products to compare");
            System.exit();
        }
        //else{
          //  Store.getBestProfit()
    }
}