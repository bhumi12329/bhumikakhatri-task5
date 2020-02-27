package cleancode;
import java.io.IOException;

import java.io.OutputStreamWriter;
import java.lang.Math;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class interest
{
	double principle,interest1,year;
   public interest(double principle,double interest1,double year) 
   {
	   this.principle=principle;
	   this.interest1=interest1;
	   this.year=year;
   }
   public void findsimple(double principle,double interest1,double year)
   {
	   double simpleinterest;
	   simpleinterest=(principle*interest1*year)/100;
	   System.out.print(simpleinterest);
	   System.out.print("\n");
   }
   public void findcompound(double principle,double interest1,double year)
   {
	   double compoundinterest;
	   double futureamount;
	   double interestratio=interest1/100;
	   double a=1+interestratio;
	   double b=Math.pow(a,year);
	   futureamount=principle*b;
	   compoundinterest=futureamount-principle;
	   System.out.print(compoundinterest);
   }
  
    public static void main(String[] args) throws IOException {  
    
      double principle,interest1,year;
      Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 

    	 Scanner sc=new Scanner(System.in);
	   OutputStreamWriter streamwriter=new OutputStreamWriter(System.out);
	   LOGGER.log(Level.INFO, "My first Log Message"); 
	   LOGGER.log(Level.INFO, "Enter the principle amount"); 
	  // streamwriter.write("Enter the principle amount");
	   //streamwriter.flush();
	   principle=sc.nextDouble(); 
	  // streamwriter.write("Enter the interest");
	   //streamwriter.flush();
	   LOGGER.log(Level.INFO, "Enter the interest"); 
	   interest1=sc.nextDouble();
	  // streamwriter.write("Enter the year");
	  // streamwriter.flush();
	   LOGGER.log(Level.INFO, "Enter the year"); 
	   year=sc.nextDouble();
	   interest i=new interest(principle,interest1,year);
	   
	   streamwriter.write("Simple interest = ");
	   streamwriter.flush();
	   i.findsimple(principle,interest1,year);
	   streamwriter.write("Compound interest = ");
	   streamwriter.flush();
	   i.findcompound(principle,interest1,year);
    }
}   
   
   
