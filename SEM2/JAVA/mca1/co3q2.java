import java.util.Scanner;

 class co3q2 {
	int Empid,salary;
	String Name, Address;
	
  public co3q2() {
    	Scanner in = new Scanner (System.in);
    	
    	System.out.println("enter the employee id : ");
    	Empid = in.nextInt();
    	
    	System.out.println ("enter the name of the employee : ");
    	Name = in.next();
		
    	System.out.println ("enter the address of the employee : ");
    	Address = in.next();
		
    	System.out.println("enter the employee salary : ");
    	salary = in.nextInt();
    	
	}
 }
 class Teacher extends co3q2 {
	 
	 String department, subject;
	 
	public Teacher() {
		 
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("enter the name of the department : ");
	    	department= in.next();
	    	
	    System.out.println("enter the name of the subject : ");
	    	subject = in.next();
	    	
		 
	 }
	  void information() {
		 
		 System.out.println ("--------employee details--------");
		 
		 System.out.println (" id      :  " + Empid);
		 System.out.println(" Name      : " + Name);
		 System.out.println(" Address   :  "+Address);
		 System.out.println(" Department   :  "+ department);
		 System.out.println(" subject   : "+subject);
		 System.out.println (" Salary   : "+salary);
		 
		 
		 
	 }
 
 
	

	public static void main(String[] args) {
		
		int num;
		
		Scanner in1 = new Scanner(System.in);
		
		System.out.println("enter the number of teachers : ");
		
		num = in1.nextInt();
		
		Teacher obj[] = new Teacher[num];
		
		for (int i = 0 ; i < num ; i ++ )
		{
			
			obj[i] = new Teacher();
		}
		for (int i = 0 ; i < num ; i ++ ) {
			obj[i].information();
		}
	}

	}
