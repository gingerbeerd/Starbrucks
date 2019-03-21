
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
    private double setupCost;
    private double unitCost;
    private double inventoryCost;
    private double sellingPrice;
    private double Q;


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
    public Product(String prodName,int demand,double setup,double unit,double inventory,double selling)
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
    
    /** Calculates Q as per equation and rounds to integer.
     * 
     */
    public void calcQ()
    {
        Q = Math.sqrt((2*setupCost*demandRate)/inventoryCost);
        Q=Math.round(Q);
    }
    public double getQ()
    {
        return Q;
    }
}
