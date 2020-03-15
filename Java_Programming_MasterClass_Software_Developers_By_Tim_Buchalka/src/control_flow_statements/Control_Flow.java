package control_flow_statements;

public class Control_Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 3;
		if(value == 1) {
			System.out.println("1");
		}else if(value == 2) {
			System.out.println("2");
		}else if(value == 3) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}
		
		int Value=6;
		
		switch(Value) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4: case 5: case 6:
			System.out.println("The value is 4, 5, 6");
			System.out.println("The actual value is"+ Value);
			break;
		default:
			System.out.println("The Value was not 1 or 2");
			break;	
		}
	}
}
