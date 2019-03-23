
/**
 * Product class for an individual product
 *Contains name, demand, setup cost, unit cost, inventory cost, selling price
 * Peter Mastello
 * @version 0.1
 */

import java.util.*;
import java.lang.Math.*;

public class Product
{
    // private variables for each product
    private String name;
    private int demandRate;
    private int setupCost;
    private int unitCost;
    private int inventoryCost;
    private int sellingPrice;
    private int Q;
    


    /**
     * Default Constructor for objects of class Product
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
        Q=0;
    }
    /**
     * Parameterized constructor for objects of class Product
     */
    public Product(String prodName,int demand,int setup,int unit,int inventory,int selling)
    {
        // initialise instance variables
        name = prodName;
        demandRate = demand;
        setupCost = setup;
        unitCost = unit;
        inventoryCost = inventory;
        sellingPrice = selling;
        calcQ();
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
    
    public void setSetup(int setup)
    {
        setupCost = setup;
    }
    
    public void unitCost(int unit)
    {
        unitCost = unit;
    }
    
    public void setInventory(int inventory)
    {
        inventoryCost = inventory;
    }
    
    public void setSellingPrice(int selling)
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
    public int getSetup()
    {
        return setupCost;
    } 
    public int getUnitCost()
    {
        return unitCost;
    } 
    public int getInventoryCost()
    {
        return inventoryCost;
    } 
    public int getSellingPrice()
    {
        return sellingPrice;
    } 
    
    /** Calculates Q as per equation and rounds to integer.
     * 
     */
    public int calcQ()
    {
        Q = (int)Math.round(Math.sqrt((2*setupCost*demandRate)/inventoryCost));
        
        return Q;
    }
    
    
}
