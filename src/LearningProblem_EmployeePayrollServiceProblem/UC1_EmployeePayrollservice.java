package LearningProblem_EmployeePayrollServiceProblem;
import java.util.Scanner;
import java.io.FileReader;  
public class UC1_EmployeePayrollservice {
	public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_ID}
	private List<EmployeePayrollData> employeePayrollList;

	public UC1_EmployeePayrollservice() {}

	public UC1_EmployeePayrollservice(List<EmployeePayrollData> employeePayrollList) {...}

	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		UC1_EmployeePayrollservice employeePayrollService = new UC1_EmployeePayrollservice(employeePayrollList); 
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData();
	}

		private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("Enter Employee ID: "); 
		int id = consoleInputReader.nextInt();
		System.out.println("Enter Employee Name: "); 
		String name= consoleInputReader.next();
		System.out.println("Enter Employee Salary: "); 
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}
	private void writeEmployeePayrollData() { 
		System.out.println("writing Employee Payroll Roaster to Console" + employeePayrollList);
	}
}