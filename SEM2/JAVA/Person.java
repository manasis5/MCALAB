
import java.util.Scanner;

public class Person {
	
	String name ;
	String gender ;
	String address;
	int age;
	
	Person(String Pname, String Pgender , String Paddress , int Page){
		
		this.name = Pname;
		this.gender= Pgender;
		this.address = Paddress;
		this.age= Page;
	
}
static class Employee extends Person{
	
	int Empid;
	int salary;
	
	String company ;
	String qualification;
	
	
	public Employee(String Pname, String Pgender, String Paddress, int Page ,int EEmpid,int Esalary,String Ecompany, String Equalification ) {
		super(Pname, Pgender, Paddress, Page);
		
		this.Empid = EEmpid;
		this.salary =Esalary;
		this.company =Ecompany;
		this.qualification = Equalification;
		
		
		
	}

	
	
}

static class Teacher extends Employee{
	
	int teacherid;
	String subject;
	String department;
	
	

	public Teacher(String Pname, String Pgender, String Paddress, int Page, int EEmpid, int Esalary, String Ecompany,
			String Equalification , int Tteacherid,String Tsubject, String Tdepartment) {
		
		super(Pname, Pgender, Paddress, Page, EEmpid, Esalary, Ecompany, Equalification);
		
		this.teacherid =Tteacherid;
		this.subject = Tsubject;
		this.department = Tdepartment;
		
		
	}
	
	void display() {
		
		System.out.println(" ------------------INFORMATION-------------------");
		System.out.println(" NAME : " + name);
		System.out.println(" GENDER : "+gender);
		System.out.println(" ADDRESS : "+address);
		System.out.println(" AGE : "+ age);
		System.out.println(" IDENTITY NUMBER  : " + Empid);
		System.out.println(" COMPANY : "+company);
		System.out.println(" SALARY : "+salary);
		System.out.println(" EDUCATION QUALIFICATION : " + qualification);
		System.out.println(" TEACHER ID NUMBER : "+teacherid);
		System.out.println(" DEPARTMENT : " +department);
		System.out.println(" SUBJECT : " +subject);
		
		
		
	}
}

	public static void main(String[] args) {
		
		int number;
		int age;
		int Empid;
		int salary;
		int teacherid;
		
		String name;
		String gender;
		String address;
		String company;
		String qualification;
		String department;
		String subject;
		
	
		
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.print("enter the number of teachers : ");
		
		number = scan.nextInt();
		
		Teacher[] teach = new Teacher[number];
		
		
		for (int i = 0 ; i < number; i ++ ) {
			
			System.out.println("enter your information here  ");
			
			System.out.print(" NAME : " );
			name = scan.next();
			 
			System.out.print(" GENDER : ");
			gender = scan.next();
			
			System.out.print(" ADDRESS : ");
			address = scan.next();
			
			
			System.out.print(" AGE : ");
			age = scan.nextInt();
			
			System.out.print(" IDENTITY NUMBER  : " );
			Empid = scan.nextInt();
			
			System.out.print(" COMPANY : ");
			company= scan.next();
			
			System.out.print(" SALARY : ");
			salary= scan.nextInt();
			
			System.out.print(" EDUCATION QUALIFICATION : " );
			qualification = scan.next();
			
			
			System.out.print(" TEACHER ID NUMBER : ");
			teacherid = scan.nextInt();
			
			System.out.print(" DEPARTMENT : " );
			department = scan.next();
			
			System.out.print(" SUBJECT : " );
			subject= scan.next();
			
			
		    teach [i] =  new Teacher(name,gender,address,age,Empid,salary,company,qualification,teacherid,subject,department);
		    
		}
		for(int i = 0 ; i < number; i ++) {
			
			teach[i].display();
		}
		
	

	}

}
