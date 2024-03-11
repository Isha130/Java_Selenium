package javaLoopandJumpstatement.java;

public class WhileLoopStatement {

	public static void main(String[] args) {
		 //print 1..10 number
		/*int i=1; // initialization
		while(i<=10) //condition
		{
			System.out.println(i);
			i++; //increment
		}*/
		//Example hello message 10 times
		/*int i=1;
		while(i<=10) {
			System.out.println("Hello world:"+i);
			++i;
		}*/
		//Print only even number btw 1...10
		/*int i=2;
		while(i<=10) 
		{
			System.out.println(i);
			i+=2; //i=i=2
		}*/
		//Approach 2
		/*int i=1;
		while(i<=10) // it tells how many time the loop will execute
		{
			if(i%2==0) // it act as a filter
			{
				System.out.println(i);
		    }i++; 
			
		}*/
		//Example print 1...10 no.specifing which is odd and even
		/*int i=1;
		while(i<=10) 
		{
			if(i%2==0) 
			{
				System.out.println("Even number:"+i);
			} 
			else
			{
				System.out.println("Odd number:"+i);
			}i++; 
		}*/
		//print no. in decrement order
		int i =10;
		while(i>=1) //0r (i>0)
		{
			System.out.println(i);
			i--;
		} 

	}

}
