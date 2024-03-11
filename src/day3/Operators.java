package day3;

public class Operators {

	public static void main(String[] args) {
//arithmetic operation
		int  a=5, d=103; //don't close the colin after a
		System.out.println("Sum of two Numbers is:"+(a+d));
		d=20;
		System.out.println("Diff. of two Numbers is:"+(a-d));
		System.out.println("Multi. of two Numbers is:"+(a*d));
		System.out.println("Division of two Numbers is:"+(d/a));
		System.out.println("Modulus of two Numbers is:"+(d%a));
//Relational and Comparison operators >,<,<=,>=...etc
// Always returns Boolean value
		System.out.println(a>d);
		System.out.println(a>=d);
		System.out.println(a<d);
		System.out.println(a<=d);
		//d=5;
		System.out.println(a!=d);
		System.out.println(a==d);
		boolean r = a<=d;
		System.out.println(r);
//Logical operators && || !
// returns Boolean value - true/false		
//work between  two boolean values
     // && -> and || -> or !-> opposite
 boolean x= true;
 boolean y= false;
 System.out.println(x||y);
 System.out.println(x&&y);
 System.out.println(!x);
		boolean b1= 10<30; 
		System.out.println(b1);
		boolean b2= 30>40;
		System.out.println(b2);
		System.out.println(b1&&b2);
		System.out.println(b1||b2);
		System.out.println(10<30&&30>40);

	}

}
