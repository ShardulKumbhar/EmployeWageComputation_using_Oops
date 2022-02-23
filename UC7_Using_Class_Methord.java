
public class UC7_Using_Class_Methord {
	public static int isPartTime = 1;
	public static int isFullTime = 2;
	public static int empRatePerHr = 20;
	public static int empHrs;
	public static int salary;
	
	public static int computeEmpWage() {
		double randomCheck = Math.floor(Math.random() * 10) % 3;

		if (isFullTime == randomCheck) {
			System.out.println("Employee is FullTime");
			empHrs = 8;
		} else if (isPartTime == randomCheck) {
			System.out.println("Employee is PartTime");
			empHrs = 4;
		} else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}
		salary = empHrs * empRatePerHr;
		System.out.println("Employee Salary" + salary);
		
		return salary;
	}
	


	public static void main(String[] args) {
		computeEmpWage();

	}

}
