import java.util.ArrayList;
import java.util.Scanner;

public class List {
	Scanner scan = new Scanner(System.in);
	
	public ArrayList<Patient> patientList = new ArrayList<>();
	
	public void add() {
		System.out.println("Input patient data:");
		String input = scan.nextLine();
		
		String[] result = input.split(" - ");
		patientList.add(new Patient(result[0], result[1], result[2], result[3]));
		
		System.out.println("Patient successfully added!");
		System.out.print("Press enter to continue...");
		scan.nextLine();
		System.out.println();
	}
	
	public int getYoungest() {
		Integer[] flag = {0, 0, 0};
		int idxYoungest = 0, i = 0;
		
		for (Patient patient : patientList) {
			if(patient.getYearDOB().compareTo(flag[2]) > 0) {
				flag[0] = patient.getDateDOB();
				flag[1] = patient.getMonthDOB();
				flag[2] = patient.getYearDOB();
				idxYoungest = i;
			}
			else if(patient.getYearDOB().compareTo(flag[2]) == 0 && patient.getMonthDOB().compareTo(flag[1]) > 0) {
				flag[0] = patient.getDateDOB();
				flag[1] = patient.getMonthDOB();
				flag[2] = patient.getYearDOB();
				idxYoungest = i;
			}
			else if(patient.getYearDOB().compareTo(flag[2]) == 0 && patient.getMonthDOB().compareTo(flag[1]) == 0 && patient.getDateDOB().compareTo(flag[0]) > 0) {
				flag[0] = patient.getDateDOB();
				flag[1] = patient.getMonthDOB();
				flag[2] = patient.getYearDOB();
				idxYoungest = i;
			}
			i++;
		}
		
		return idxYoungest;
	}
	
	public void remove() {
		int size = patientList.size();
		
		if(size == 0) {
			System.out.println("Data not found!");
			System.out.print("Press enter to continue...");
			scan.nextLine();
		}
		else {
			int idx = getYoungest();
			String alert = "| " + patientList.get(idx).getDOB() + " - " + patientList.get(idx).getName() + " is cured |";
			int len = alert.length();
			for(int i=0; i<len; i++) System.out.print("=");
			System.out.printf("\n| %s - %s is cured |\n", patientList.get(idx).getDOB(), patientList.get(idx).getName());
			for(int i=0; i<len; i++) System.out.print("=");
			patientList.remove(idx);
			System.out.println();
			System.out.print("Press enter to continue...");
			scan.nextLine();
		}
		System.out.println();
	}
	
	public void display() {
		int size = patientList.size();
		
		if(size == 0) {
			System.out.println("Data not found!");
			System.out.print("Press enter to continue...");
			scan.nextLine();
		}
		else {
			System.out.println("Patient List");
			for(int i=0; i<87; i++) System.out.print("=");
			System.out.printf("\n| %-16s| %-20s| %-26s| %-16s|\n", "Date of Birth", "Name", "Email", "Counseling");
			for(int i=0; i<87; i++) System.out.print("=");
			System.out.println();
			for(int i=0; i<size; i++) {
				System.out.printf("| %-16s| %-20s| %-26s| %-16s|\n", patientList.get(i).getDOB(), patientList.get(i).getName(), patientList.get(i).getEmail(), patientList.get(i).getCounseling().toLowerCase());
			}
			for(int i=0; i<87; i++) System.out.print("=");
			System.out.println();
			System.out.print("Press enter to continue...");
			scan.nextLine();
		}
		System.out.println();
	}
	
}
