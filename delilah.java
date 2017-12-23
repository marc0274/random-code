/**
 * @(#)delilah.java
 * @author 
 * @version 1.00 2015/10/26
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class delilah {



public double height;
public double weight;
public double footsize;
public double waistsize;
public double amt;
public int age;
public String name;





ArrayList<Double> profile = new ArrayList<Double>(); 
 	public delilah()
 	{
 		
 	}
    	
 
 
    public delilah(double h, double wt,double fs, double ws,double at, int ag)
    {
    	height =h;
    	weight= wt;
    	footsize =fs;
    	waistsize = ws;
    	amt=at;
    	age = ag;
    }
    
  
  public void setHeight(double h, double t)
  {
  	
  	
  height =h + t;
  	
  }
  
    public double getHeight()
  {
  return height;
  	
  }
  
    public void setWeight(double wt)
  {
  	weight = wt;
  	
  }
  
  public double getWeight()
  {
  	return weight;
  }
  
  public void setName(String nm)
  {
  	name = nm;
  }
  
  public String getName()
  {
  	return name;
  }
  public void setFootsize(double fs)
  {
  	footsize= fs;
  }
    
  public double getFootsize()
  {
  	return footsize;
  
  }	  
  	
  public void setAmtSpend(double money)
  {
  	amt = money;
  }	
  public double getAmtSpend()
  {
  	return amt;
  }		
  	
  public void setAge( int ag)
  {
  	age = ag;
  
  }		
  public int getAge()	
  {
  	
  	return age;
  }

  	
  
}//end public class delilah