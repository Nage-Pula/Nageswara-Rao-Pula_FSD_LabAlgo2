package Payment_Daily_Target;

public class Driver_Class {

	
	public static void main(String[] args) {
		
		
		Daily_Target_Deter determinator
			= new Daily_Target_Deter();
		
		determinator.collectTransactionValues();
		determinator.collectDailyTargets();
		
		determinator.determine();
	}
}