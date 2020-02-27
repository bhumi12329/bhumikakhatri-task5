package cleancode;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ConstructionCost
{
    public float cost;
     public ConstructionCost() {
		// TODO Auto-generated constructor stub
	}
     public void estimation(float area)
    {
		int ch;
		Scanner sc=new Scanner(System.in);
	    System.out.print("1.Low standard material\n2.middle standard material\n3.high standard material\n4.very high standard material");
		ch=sc.nextInt();
	    switch (ch) 
		{
			case 1:
				cost=1200*area;
				break;
			case 2:
				cost=1500*area;
				break;
			case 3:
				cost=1800*area;
				break;	
			case 4:
				cost=2500*area;
				break;
			
		}
	   System.out.print("Construction cost = "+cost+"Rs");
	}
    public static void main(String args[]) throws IOException
    {
    	float area;
    	Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
    	Scanner sc=new Scanner(System.in);
    	OutputStreamWriter streamwriter=new OutputStreamWriter(System.out);
    	LOGGER.log(Level.INFO, "Enter the area"); 
    	//streamwriter.write("Enter the area");
    	//streamwriter.flush();
    	area=sc.nextFloat();
    	ConstructionCost c=new ConstructionCost();
    	c.estimation(area);
	} 
}
