//29-02-2024
import java.util.*;

public class cpu {
	 double price;
     
     public class Processor
           {
               int cores;
               String manufacturer;
               void info(int c, String m)
                      {
                          cores=c;
                          manufacturer=m;
                          System.out.println("\nprocessor details");
                          
                          System.out.println("No. of Cores="+cores+"\nManufacturer Name="+manufacturer);
                      }
           }
     static class RAM
            {
                double memory;
                String manufacturer;
                void info(double mem, String man)
                      {
                          memory=mem;
                          manufacturer=man;
                          System.out.println("\nram details");
                          
                          System.out.println("Memory="+memory+"GB\n"+"Manufacturer Name="+manufacturer);
                      }
            }

public static void main(String[] args){
 cpu cpu1 = new cpu();
 cpu.Processor processor= cpu1.new Processor();
 cpu.RAM ram = new cpu.RAM();
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the price:");
 cpu1.price=sc.nextDouble();
 System.out.println("Enter the no. of cores:");
 int core = sc.nextInt();
 System.out.println("Enter the name of processor manufacturer:");
 String man_name = sc.next();
 System.out.println("Enter the size of memory:");
 double memo = sc.nextDouble();
 System.out.println("Enter the name of RAM manufacturer:");
 String name = sc.next();
 sc.close();
 System.out.println("\nsystem info");	 
 System.out.println("The price of the CPU is : Rs."+ cpu1.price);
 processor.info(core,man_name);
 ram.info(memo,name);
		 
} 
 
}
