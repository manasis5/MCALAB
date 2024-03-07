import java.util.Scanner;
class co3q1 {
	
	static int area(int a) {
		return a*a;
	}
	static int area(int c , int b) {
		return c*b;
	}
        static double area(double base , int height) {
		return (base*height)/2;
	}
        static double area(double r) {
		return 3.14*r*r;
	}
	public static void main(String[] args) {
		
		int a ,c,b,height;
		double base ,r;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the values for a  : ");
		a = in.nextInt();
                System.out.println("enter the values for c, b : ");
                b = in.nextInt();
		c=in.nextInt();		
		System.out.println("enter the values for base, height : ");
		base=in.nextInt();
                height=in.nextInt();		
		System.out.println("enter the values for radius: ");
		r=in.nextInt();
		System.out.println("------AREA------");
		System.out.println("the area of square is "+area(a));
		System.out.println("the area of rectangle is "+area(c , b));
		System.out.println("the area of triangle is "+area(base, height));
                System.out.println("the area of circle is "+area(r));

	}

}
