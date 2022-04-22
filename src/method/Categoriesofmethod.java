package method;

public class Categoriesofmethod {
	
	// 1.method without return type and without argument
    
	public static void m1() {//static method
		int i = 6 ;
		System.out.println(i);
	}
	public void m2() { // non static method
         int i = 5;
         System.out.println(i);
	}
	
	// 2.method without return type and with argument
	
	   public void m3 (int i , String j, boolean k) { // non static method
		   System.out.println(i);
		   System.out.println(j);
		   System.out.println(k);
	   }
	  public static void m4 (String value) { // static method
	System.out.println(value + "city" );
	  }
	
	public static void main(String[] args) {
		Categoriesofmethod com = new Categoriesofmethod ();
		m1();
		com.m2();
		com.m3(10, "Pradeep", true);
		m4("pune");	
	boolean a =com.m5();
	System.out.println(a);
		String b = m6();
		System.out.println(b);
	}
	
	// 3.method with return type and without argument
	public boolean m5() //non static method
	{
	System.out.println("method with return type");
	return false;
	}	
	
	public static String m6() // static method
	{
		String s = "velocity";
	System.out.println("m6 is executing");
		System.out.println("method with return type");
	return s;
	}
	
	
	
	
	
	
}
