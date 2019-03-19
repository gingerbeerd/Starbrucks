
/**
 * Product class for an individual product
 *Contains name, demand, setup cost, unit cost, inventory cost, selling price
 * Peter Mastello
 * @version 0.1
 */
public class Product
{
    // private variables for each product
    private String name;
    private int demandRate;
    private double setupCost;
    private double unitCost;
    private double inventoryCost;
    private double sellingPrice;


    /**
     * Constructor for objects of class Product
     */
    public Product()
    {
        // initialise instance variables
        name = "";
        demandRate = 0;
        setupCost = 0;
        unitCost = 0;
        inventoryCost = 0;
        sellingPrice = 0;
    }

    /**
     * Methods for assigning varible values
     */
    public void setName(String prodName)
    {
        name = prodName;
    }
    
    public void setDemand(int demand)
    {
        demandRate = demand;
    }
    
    public void setSetup(double setup)
    {
        setupCost = setup;
    }
    
    public void unitCost(double unit)
    {
        unitCost = unit;
    }
    
    public void setInventory(double inventory)
    {
        inventoryCost = inventory;
    }
    
    public void setSellingPrice(double selling)
    {
        sellingPrice = selling;
    }
    
    public String getName()
    {
        return name;
    } 
    public int getDemand()
    {
        return demandRate;
    }  
    public double getSetup()
    {
        return setupCost;
    } 
    public double getUnitCost()
    {
        return unitCost;
    } 
    public double getInventoryCost()
    {
        return inventoryCost;
    } 
    public double getSellingPrice()
    {
        return sellingPrice;
    } 
}
