package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		String path = "c:\\temp\\comparable.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			
			Collections.sort(list);
			for (String s : list) {
				System.out.println(s);
			}
			
		} catch (IOException e) {
			e.getMessage();
		}
		sc.close();
	}

}
