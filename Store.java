

public class Store
{
    // instance variables - replace the example below with your own
    private Product Product1;
    private Product Product2;
    private Product Product3;

    /** 
     * Constructor for objects of class Store
     */
    public Store()
    {
        // initialise instance variables
        Product1 = new Product();
        Product2 = new Product();
        Product3 = new Product();
    }
    public void setProduct(String prodName, int demand,setup,unit,
        inventory, selling )
    {
        setName(prodName);
        setDemand(demand);
        setSetup(setup);
        unitCost(unit);
        setInventory(inventory);
        setSellingPrice(selling);
    
    }
    
}
