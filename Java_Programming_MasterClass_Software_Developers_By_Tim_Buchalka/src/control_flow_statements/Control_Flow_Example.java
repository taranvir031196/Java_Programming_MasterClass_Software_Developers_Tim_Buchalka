package control_flow_statements;

public class Control_Flow_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDayoftheWeek(1);
		printDayoftheWeek(2);
		printDayoftheWeek(3);
		printDayoftheWeek(4);
		printDayoftheWeek(5);
		printDayoftheWeek(6);
		printDayoftheWeek(7);
		printDay("1");
		printDay("2");
		printDay("3");
		printDay("4");
		printDay("5");
		printDay("6");
	}
	
	public static void printDayoftheWeek(int day) {
		
		if(day == 1) {
			System.out.println("Monday");
		}else if(day == 2) {
			System.out.println("Monday");
		}else if(day == 3) {
			System.out.println("Monday");
		}else if(day == 4) {
			System.out.println("Monday");
		}else if(day == 5) {
			System.out.println("Monday");
		}else if(day == 6) {
			System.out.println("Monday");
		}else if(day == 7) {
			System.out.println("Monday");
		}else {
			System.out.println("Monday");
		}
	}
	
	public static void printDay(String dayNo) {
		
		switch(dayNo) {
		case "1":
			System.out.println("Monday");
			break;
		case "2":
			System.out.println("Tuesday");
			break;
		case "3":
			System.out.println("Wednesday");
			break;
		case "4":
			System.out.println("Thursday");
			break;
		case "5":
			System.out.println("Friday");
			break;
		case "6":
			System.out.println("Saturday");
			break;
		case "7":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please Enter Correct Value");
		}
	}
}
