package controlStatement;

public class LargestNumber {

	public static void main(String[] args) {
		 /*,b,c,a are 3 numbers
		a>b and a>c then a is largest
		b>c and b>a then b is largest
		*/
		int a=105, b=200,c=308;
		if(a>b && a>c) 
		{
			System.out.println("a is largest:"+a);
		}
		else if(b>c && b>a)
		{
			System.out.println("b is largest:"+b);
		}
		else
		{
			System.out.println("C is Largest:"+c);
		}
	}

}
