package murtazajava_works;
import java.util.Scanner;

class ForkTree extends Thread
{   int n,k,f,fl;
    public ForkTree(int n,int k,int f)
    { 	this.n=n;
        this.k=k;
        this.f=f;
    }

    public void run()
    {  		int max,r,c;
        	for(r=1;r<=n;r++)
        	{

            	max = (int)java.lang.Math.pow(2,r);
            
            
            	if (r != 1)
            		{
            			k = k - f;
            			f = f *2;
            		}
            	System.out.print("Fork() called "+r+" time: ");

            	for(c=0;c<k;c++)
            		{
                		System.out.print("            ");
            		}



            	for(c=1;c<=max;c++)
            		{   if(c>9)
            				{ 
            			 		fl=1;
            			 		break;
            				}
            		
            			try {
            				Thread.sleep(1000);
            				}
            		
            			catch(Exception e)
                    		{

                    		}
            			System.out.print("PROCESS  "+c+"  ");
            		}
            	if(fl==1)
            		{	
            			for(;c<=max;c++) 
            			{
            				try
            					{
            						Thread.sleep(1000);
            					}
            				catch(Exception e)
                                {

                                }
            				System.out.print("PROCESS "+c+"  ");
            			}	
            			
            		}
            		
            				System.out.print("\n");
       		}
            
            
            

        }


    
}
class NumberOfProcess extends Thread
{    int n;
    int result;
    public NumberOfProcess(int n)
    { this.n=n;
    }

    public void run()
    {   result=(int)java.lang.Math.pow(2,n);
        System.out.println();
            try{
            Thread.sleep(500);
               }
            catch(Exception e)
                {

                }
        
        System.out.println("The Total Number of Processes including parent = "+result);
        System.out.println("Thank you For Using Our Application");
    }
}


public class App_java
{
    public static void main(String [] args)
    {
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t*** Fork() Tree Using MULTITHREADING ***");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Fork() calls { e.g Enter 3 } :");
        int n=sc.nextInt();
        double s;
        s=java.lang.Math.pow(2,n);

        int k;
        k=(int)s;
        k=k/2;
        k=k-1;
        int f=1;

        Thread obj1= new ForkTree(n,k,f);
        Thread obj2= new NumberOfProcess(n);
        obj1.start();
        try{
            Thread.sleep(10);
        }
        catch(Exception e)
        {

        }


        try
        {
            obj1.join();
        }
        catch(Exception e)
        {

        }
        obj2.start();

    }

}
