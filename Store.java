

public class Store
{
    // instance variables - replace the example below with your own
    private Product p1;
    private Product p2;
    private Product p3;
    private String name;
    private int demandRate, prodNum;
    private double setupCost;
    private double unitCost;
    private double inventoryCost;
    private double sellingPrice;

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
    public void setProduct1(String prodName,int demand,double setup, double unit, double inventory, double selling) 
    {
        p1.setName(prodName);
        p1.setDemand(demand);
        p1.setSetup(setup);
        p1.unitCost(unit);
        p1.setInventory(inventory);
        p1.setSellingPrice(selling);
    
    }
    public String getProductName(int prodNum)
    {//gets name of product
        switch (prodNum)
        {
            case 1: return p1.getName();
           
            case 2: return p2.getName();
            
            case 3: return p3.getName();
            default: return "";
        }       
     }
    
}
