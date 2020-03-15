package expressions_Statements_CodeBlocks_Metadata;

public class Main {
	
	public static String INVALID_VALUE_MESSAGE = "Invalid Duration";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDurationString(65,45));
		System.out.println(getDurationString(-10));
		System.out.println(getDurationString(8764L));
	
	}
	
	public static String getDurationString(long minutes, long seconds) {
		if((minutes<0) || (seconds<0) || (seconds >59)) {
			return INVALID_VALUE_MESSAGE;
		}
		
		long hours = minutes / 60;
		long remainingminutes = minutes % 60;
		
		String sHoursString = hours + "h";
		if(hours < 10) {
			sHoursString = "0" + hours;
		}
		
		String sMinutes = remainingminutes + "m";
		if(minutes < 10) {
			sMinutes = "0" + remainingminutes;
		}
		
		String sSeconds = seconds + "ss";
		if(seconds < 10) {
			sSeconds = "0" + seconds;
		}
		
		return sHoursString + " " + sMinutes + " " + sSeconds;
	}
	
	public static String getDurationString(long seconds){
		
		if(seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}
		
		long minutes = seconds / 60;
		long remainingminutes = seconds % 60;
		
		return getDurationString(seconds, minutes);
	}
}
