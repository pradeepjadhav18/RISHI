package method;

public class Assignment {
	
	// we have Use method with return type and with argument
	
	public int p1 (int a , int b) {
	int land1 = a*b;
	System.out.println("Length - " + a);
	System.out.println("Breadth - " + b);
	return land1 ;

}
	public int p2 (int a , int b) {
		int land2 = a*b;
		System.out.println("Length - " + a);
		System.out.println("Breadth - " + b);
		return land2 ;
	}
	
	public int p3 (int a , int b) {
		int land3 = a*b;
		System.out.println("Length - " + a);
		System.out.println("Breadth - " + b);
		return land3 ;
	}
	public static void main(String[] args) {
		 
		Assignment pj = new Assignment();
		int  S = pj.p1(15, 10);
		System.out.println("Land1- " + S);
		int R = pj.p2(20, 15);
		System.out.println("Land2 - " + R);
		int J = pj.p3(25, 20);
		System.out.println("Land3 - "+ J);
		
		int sum = S + R + J;
		System.out.println("Sum of all Land = " + sum);
		
	}
	
	
	
}