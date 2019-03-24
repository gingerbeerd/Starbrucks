

public class Store
{
    // instance variables - replace the example below with your own
    private Product p1;
    private Product p2;
    private Product p3;
    private Product Px;
    private String name;
    private int demandRate, prodNum;
    private int setupCost;
    private int unitCost;
    private int inventoryCost;
    private int sellingPrice;

    /** 
     * Constructor for objects of class Store
     */
    public Store()
    {
        // initialise instance variables
        p1 = new Product();
        p2 = new Product();
        p3 = new Product();
    }
    public void setProduct(int prodNum, String prodName,int demand,int setup, int unit, int inventory, int selling) 
    { Product prodVar;
      prodVar = getProduct(prodNum);
      
      p1.setName(prodName);
      p1.setDemand(demand);
      p1.setSetup(setup);
      p1.unitCost(unit);
      p1.setInventory(inventory);
      p1.setSellingPrice(selling);
    
    }
    
     public Product getProduct(int prodNum)
     { Product Px; 
         
        switch (prodNum){
        case 1 : Px=p1;
        case 2 : Px=p2;
        case 3 : Px=p3;
        default: Px=p1;
       }
       return Px;
    }
     public String getProductName(int prodNum) 
    {  Px = getProduct(prodNum); 
       return Px.getName();
    
    }
    
    public void getProductStrategy  (int prod, int weeks){
       int      q, demand, week =1, inventory = 0, order, orderCount, remainder, x;
       q=p1.calcQ();
       demand = p1.getDemand();
       if (q<demand){q=demand;}
       inventory=0;
       week=1;
       
       //both ints, so will truncate
       orderCount = (demand*weeks/q)+1; //5
       remainder = orderCount*q - (weeks*demand); //5*
       x=0;
       
       do {
         if (demand>inventory){
            order=q;
            if (x==orderCount-1)
                {order= order-remainder;}
            
            inventory=inventory+order;
            x++;}
            else
            {order=0;}
           
            
            inventory=inventory-demand;
           
           System.out.print("Week: "+week +" Quantity order: "+order+" Demand: "+demand+" Inventory: "+inventory);
           System.out.println();
           week++;
           
       }
       while (weeks >= week);
}}

