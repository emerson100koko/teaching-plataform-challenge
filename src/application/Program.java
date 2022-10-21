package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("How many classes does the course have? ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println((i+1) + " Class data: ");
			System.out.print("Content or task (c/t)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Tittle: ");
			sc.next();
			String title = sc.nextLine();
			
			if (ch == 'c') {
				System.out.print("Video Url: ");
				sc.next();
				String url = sc.nextLine();
				
				System.out.print("Duration in Seconds: ");
				int seconds = sc.nextInt();
				
				list.add(new Video(title, url, seconds));
			}else {
				System.out.print("Description: ");
				sc.next();
				String description = sc.nextLine();
				
				System.out.print("Quantity of Questions: ");
				int questionCount = sc.nextInt();
				
				list.add(new Task(title, description, questionCount));
			}
		}

		int sum = 0;
		for (Lesson td : list) {
			int time = td.Duration();
			sum += time;
					}
		
		System.out.println("\nTOTAL COURSE DURATION = " + sum + " Seconds");
		
		sc.close();
	}

}
