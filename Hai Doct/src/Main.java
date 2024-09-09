import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static List list = new List();
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		int choice = 0;
		
		while(choice != 4) {
			System.out.println("Mental Health");
			System.out.println("===============");
			System.out.println("1. Add new patient");
			System.out.println("2. View patients");
			System.out.println("3. Distribute cure");
			System.out.print(">> ");
			
			choice = scan.nextInt();
			scan.nextLine();
			
			if(choice == 1) {
				list.add();
			}
			else if(choice == 2) {
				list.display();
			}
			else if(choice == 3) {
				list.remove();
			}
			else {
				System.out.println("Thank you for using this application");
				System.exit(0);
			}
		}
	}
}
