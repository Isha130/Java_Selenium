package controlStatement;

public class WeeknumberWeekname {

	public static void main(String[] args) {
		// Print week number based on week name
		String s= "RFDH";
		switch(s) {
		case "Monday"   :System.out.println(1);
		break;
		case "Tuesday"  :System.out.println(2);
		break;
		case "Wednesday":System.out.println(3);
		break;
		case "Thrusday" :System.out.println(4);
		break;
		case "Friday"   :System.out.println(5);
		break;
		case "Saturday" :System.out.println(6);
		break;
		case "Sunday"   :System.out.println(7);
		break;
		default:System.out.println("Invalid Input:"+s);
		}

	}

}
