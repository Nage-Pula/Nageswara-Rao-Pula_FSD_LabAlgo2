package Denomination;
public class DriverClass {

	public static void main(String[] args) {
		
		DenominationsCalc calculator
			= new DenominationsCalc();
		
		calculator.collectDenominations();
		calculator.collectPaymentAmount();	
		calculator.calculate();
	}
}