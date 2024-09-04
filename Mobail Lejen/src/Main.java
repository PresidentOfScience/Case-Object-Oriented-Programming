import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		ArrayList<String> roleHero = new ArrayList<String>();
		ArrayList<String> nameHero = new ArrayList<String>();
		ArrayList<String> skillHero = new ArrayList<String>();
		ArrayList<Integer> HPHero = new ArrayList<Integer>();
		ArrayList<Integer> powerHero = new ArrayList<Integer>();
		
		int choice;
		
		do {
			do {
				System.out.println("Mobail Lejen");
				System.out.println("============");
				System.out.println("1. View Heroes");
				System.out.println("2. Add Heroes");
				System.out.println("3. Exit");
				System.out.print("Choose menu >> ");
				choice = scan.nextInt();
				scan.nextLine();
				System.out.println();
			} while(choice < 1 || choice > 3);
			
			if(choice == 1) {
				int size = nameHero.size();
				
				if(size == 0) {
					System.out.println("There is no hero added");
				}
				else {
					for(int i=0; i<size; i++) {
						System.out.println("Role   : " + roleHero.get(i));
						System.out.println("Name   : " + nameHero.get(i));
						System.out.println("Skill  : " + skillHero.get(i));
						System.out.println("HP     : " + HPHero.get(i));
						System.out.println("Power  : " + powerHero.get(i));
						System.out.println();
					}
				}
				System.out.println();
				System.out.println("Press enter to continue . . .");
				scan.nextLine();
			}
			else if(choice == 2) {
				String role;
				do {
					System.out.print("Choose role of the hero [ Tank | Range | Magic ]: ");
					role = scan.nextLine();
				} while(role.compareTo("Tank") != 0 && role.compareTo("Range") != 0 && role.compareTo("Magic") != 0);
				
				String name;
				do {
					System.out.print("Input your hero name [min. 2 words]: ");
					name = scan.nextLine();
				} while(!(name.contains(" ") && (name.charAt(0) != ' ' && name.charAt(name.length()-1) != 0)));
				
				System.out.println();
				
				System.out.println("Skill List");
				System.out.println("==========");
				String skill;
				int addHP, power;
				
				if(role.compareTo("Tank") == 0) {
					System.out.println("1. Dismember");
					System.out.println("2. Ravage");
					System.out.println("3. Warpath");
					
					do {
						System.out.print("Type your hero skill: ");
						skill = scan.nextLine();
					} while(skill.compareTo("Dismember") != 0 && skill.compareTo("Ravage") != 0 && skill.compareTo("Warpath") != 0);
					
					addHP = random.nextInt(501) + 500;
					power = random.nextInt(401) + 100;
					
					Tank tank = new Tank(role, name, skill, addHP, power);
				}
				else if(role.compareTo("Range") == 0) {
					System.out.println("1. Lucent Beam");
					System.out.println("2. Powershot");
					System.out.println("3. Multishot");
					
					do {
						System.out.print("Type your hero skill: ");
						skill = scan.nextLine();
					} while(skill.compareTo("Lucent Beam") != 0 && skill.compareTo("Powershot") != 0 && skill.compareTo("Multishot") != 0);
					
					addHP = random.nextInt(401) + 100;
					power = random.nextInt(501) + 500;
					
					Range range = new Range(role, name, skill, addHP, power);
				}
				else {
					System.out.println("1. Cold Snap");
					System.out.println("2. Meteor");
					System.out.println("3. Tornado");
					
					do {
						System.out.print("Type your hero skill: ");
						skill = scan.nextLine();
					} while(skill.compareTo("Cold Snap") != 0 && skill.compareTo("Meteor") != 0 && skill.compareTo("Tornado") != 0);
					
					addHP = random.nextInt(401) + 100;
					power = random.nextInt(501) + 500;
					
					Magic magic = new Magic(role, name, skill, addHP, power);
				}
				
				roleHero.add(role);
				nameHero.add(name);
				skillHero.add(skill);
				HPHero.add(addHP);
				powerHero.add(power);
			}
			else if(choice == 3) {
				System.out.println("Thank you!");
			}
			
			System.out.println();
		} while(choice != 3);
	}

}
