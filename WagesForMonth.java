class employee6 {
	void monthly() {
		int empRatePerHr = 20;
		double totalsalary = 0;
		int maxRateInMonth = 100;
		int numOfWorkingDays = 20;
		int totalEmpHr = 0;
		int totalWorkingDays = 0;
		int empHrs = 0;

		while (totalEmpHr <= maxRateInMonth && totalWorkingDays <= numOfWorkingDays) {
			totalWorkingDays++;
			double randomCheck = Math.floor(Math.random() * 10) % 3;
			int i = (int) randomCheck;
			switch (i) {
			case 2:
				System.out.println("Employee is FullTime");
				empHrs = 8;
				break;
			case 1:
				System.out.println("Employee is PartTime");
				empHrs = 4;
				break;
			case 0:
				System.out.println("Employee is Absent");
				empHrs = 0;
				break;
			}

			totalEmpHr = totalEmpHr + empHrs;
			System.out.println(totalEmpHr);
		}
		totalsalary = totalEmpHr * empRatePerHr;

		System.out.println("Employee total Salary" + totalsalary);
	}
}

public class WagesForMonth {

	public static void main(String[] args) {
		employee6 r = new employee6();
		r.monthly();
	}

}
