package expressions_Statements_CodeBlocks_Metadata;

public class Coding_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long strMiles=toMilesPerHour(500);
		System.out.println("The Miles Per Hour are:"+strMiles);
		
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		
		if(kilometersPerHour<0) {
			return -1;
		}
		
		long toMilesPerHour = Math.round(kilometersPerHour / 1.609);
		return toMilesPerHour;
	}
}
