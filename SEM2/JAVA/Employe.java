import java.util.Scanner;

class Employe1 {
	int e_id;
	String e_name;
	double e_salary;
	String e_address;
	Scanner sc=new Scanner(System.in);
Employe1(int e_id,String e_name,double e_salary,String e_address)
	{   
     this.e_id = e_id;
	this.e_name = e_name;
	this.e_salary = e_salary;
	this.e_address = e_address;
	
		   }
}
class teacher extends Employe1
{
	String department;
	String subject;
	teacher(int e_id,String e_name,double e_salary,String e_address,String department,String subject)
       {
		super(e_id,e_name,e_salary,e_address);
		this.department = department;
		this.subject = subject;
	}	
public void display()
  {
	System.out.println("------employee details-------");
	System.out.println("emplyee_id:"+e_id);
	System.out.println("employee_name:"+e_name);
	System.out.println("employee_salary:"+e_salary);
	System.out.println("employee_address:"+e_address);
	System.out.println("department:"+department);
	System.out.println("subject:"+subject);
	
  }
}
class Employe{	
public static void main(String[] args) {
	Scanner tr =new Scanner(System.in);
	int i;
	System.out.println("Enter number of employees: ");
	int n=tr.nextInt();
	teacher t[]=new teacher[n];
	for(i=0;i<n;i++) 
	{
		System.out.println("enter e_id:");
	 	int t1=tr.nextInt();
	 System.out.println("enter e_name:");
	  String t2=tr.next();
     System.out.println("enter e_salary:");
	 double t3=tr.nextDouble();
	 System.out.println("enter e_address:");
	  String t4=tr.next();
	System.out.println("enter department:");
		String t5=tr.next();
		System.out.println("enter subject:");
		String t6=tr.next();
	   t[i]=new teacher(t1,t2,t3,t4,t5,t6);
	}
	for(i=0;i<n;i++) 
	{
		t[i].display();
	}
  }
 }
