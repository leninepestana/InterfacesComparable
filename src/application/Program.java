package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//List<String> list = new ArrayList<>();
		List<Employee> employee = new ArrayList<Employee>();
		
		String path = "c:\\temp\\comparable.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String compCsv = br.readLine();
			while (compCsv != null) {
				String[] fields = compCsv.split(",");
				employee.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				compCsv = br.readLine();
			}
			
			Collections.sort(employee);
			for (Employee emp : employee) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
