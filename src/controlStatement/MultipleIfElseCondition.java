package controlStatement;

public class MultipleIfElseCondition {

	public static void main(String[] args) {
		 //Display week name base don week number
		int weekno =8;
		
		if(weekno==1) 
		{
			System.out.println("Sunday");
		}
		else if(weekno==2) 
		{
			System.out.println("Monday");
		}
		else if(weekno==3) 
		{
			System.out.println("Tuesday");
		}
		else if(weekno==4) 
		{
			System.out.println("Wednesday");
		}
		else if(weekno==5)
		{
			System.out.println("Thrusday");
		}
		else if(weekno==6) {
			System.out.println("Friday");
		}
		else if(weekno==7) {
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid input:"+weekno);
		}
	}

}
