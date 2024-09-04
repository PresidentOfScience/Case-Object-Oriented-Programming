import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> footwearName = new ArrayList<String>();
		ArrayList<Long> footwearPrice = new ArrayList<Long>();
		ArrayList<Float> footwearHeight = new ArrayList<Float>();
		ArrayList<Integer> footwearWheel = new ArrayList<Integer>();
		int choice;
		
		do {
			do {
				System.out.println("Just DU It !!");
				System.out.println("=============");
				System.out.println("1. Add Footwear");
				System.out.println("2. View Footwear");
				System.out.println("3. Update Footwear");
				System.out.println("4. Delete Footwear");
				System.out.println("5. Exit");
				System.out.print(">> ");
				choice = scan.nextInt();
				scan.nextLine();
			} while(choice < 1 || choice > 5);
			
			if(choice == 1) {
				String name;
				do {
					System.out.print("Footwear name [3 - 25 characters]: ");
					name = scan.nextLine();
				} while(name.length() < 3 || name.length() > 25);
				
				long price;
				do {
					System.out.print("Footwear price [more than 10000]: ");
					price = scan.nextLong();
					scan.nextLine();
				} while(price <= 10000);
				
				String type;
				do {
					System.out.print("Footwear type [Heels / RollerSkate]: ");
					type = scan.nextLine();
				} while(type.compareTo("Heels") != 0 && type.compareTo("RollerSkate") != 0);
				
				if(type.compareTo("Heels") == 0) {
					float height;
					do {
						System.out.print("Footwear height [1.0 - 9.0]: ");
						height = scan.nextFloat();
					} while(height < 1 || height > 9);
					Heels he = new Heels(name, price, height);
					footwearName.add(he.getName());
					footwearPrice.add(he.getPrice());
					footwearHeight.add(he.getHeight());
					footwearWheel.add(0);
				}
				else {
					int wheel;
					do {
						System.out.print("Footwear total wheel [2 - 4 inclusive]: ");
						wheel = scan.nextInt();
					} while(wheel < 2 || wheel > 4);
					RollerSkate rs = new RollerSkate(name, price, wheel);
					footwearName.add(rs.getName());
					footwearPrice.add(rs.getPrice());
					footwearHeight.add(0.0f);
					footwearWheel.add(rs.getWheel());
				}
				
				System.out.println("Footwear added successfully !!");
			}
			else if(choice == 2) {
				if(footwearName.isEmpty()) {
					System.out.println("There are no footwears to display !");
				}
				else {
					int size = footwearName.size();
					System.out.println("=====================================================================");
					System.out.println("| No | Name                      | Price    | Height  | Total Wheel |");
					System.out.println("=====================================================================");
					for(int i=0; i<size; i++) {
						if(footwearHeight.get(i) != 0.0f) {
							System.out.printf ("| %-3d| %-25s | %-8d | %.2f cm | %-11c |\n", i+1, footwearName.get(i), footwearPrice.get(i), footwearHeight.get(i), '-');
						}
						else {
							System.out.printf ("| %-3d| %-25s | %-8d | %-7c | %d Wheels    |\n", i+1, footwearName.get(i), footwearPrice.get(i), '-', footwearWheel.get(i));
						}
					}
					System.out.println("=====================================================================");
				}
			}
			else if(choice == 3) {
				if(footwearName.isEmpty()) {
					System.out.println("There are no footwears to update !");
				}
				else {
					int size = footwearName.size();
					System.out.println("=====================================================================");
					System.out.println("| No | Name                      | Price    | Height  | Total Wheel |");
					System.out.println("=====================================================================");
					for(int i=0; i<size; i++) {
						if(footwearHeight.get(i) != 0.0f) {
							System.out.printf ("| %-3d| %-25s | %-8d | %.2f cm | %-11c |\n", i+1, footwearName.get(i), footwearPrice.get(i), footwearHeight.get(i), '-');
						}
						else {
							System.out.printf ("| %-3d| %-25s | %-8d | %-7c | %d Wheels    |\n", i+1, footwearName.get(i), footwearPrice.get(i), '-', footwearWheel.get(i));
						}
					}
					System.out.println("=====================================================================");
					
					int idxUpdate;
					do {
						System.out.print("Input footwear index to update : ");
						idxUpdate = scan.nextInt();
						scan.nextLine();
					} while(idxUpdate <= 0 || idxUpdate > footwearName.size());
					
					String name;
					do {
						System.out.print("Footwear name [3 - 25 characters]: ");
						name = scan.nextLine();
					} while(name.length() < 3 || name.length() > 25);
					
					long price;
					do {
						System.out.print("Footwear price [more than 10000]: ");
						price = scan.nextLong();
						scan.nextLine();
					} while(price <= 10000);
					
					if(footwearHeight.get(idxUpdate-1) != 0.0f) {
						float height;
						do {
							System.out.print("Footwear height [1.0 - 9.0]: ");
							height = scan.nextFloat();
						} while(height < 1 || height > 9);
						footwearName.set(idxUpdate-1, name);
						footwearPrice.set(idxUpdate-1, price);
						footwearHeight.set(idxUpdate-1, height);
					}
					else {
						int wheel;
						do {
							System.out.print("Footwear total wheel [2 - 4 inclusive]: ");
							wheel = scan.nextInt();
						} while(wheel < 2 || wheel > 4);
						footwearName.set(idxUpdate-1, name);
						footwearPrice.set(idxUpdate-1, price);
						footwearWheel.set(idxUpdate-1, wheel);
					}
					
					System.out.println("Footwear updated successfully !!");
				}
			}
			else if(choice == 4) {
				if(footwearName.isEmpty()) {
					System.out.println("There are no footwears to delete !");
				}
				else {
					int size = footwearName.size();
					System.out.println("=====================================================================");
					System.out.println("| No | Name                      | Price    | Height  | Total Wheel |");
					System.out.println("=====================================================================");
					for(int i=0; i<size; i++) {
						if(footwearHeight.get(i) != 0.0f) {
							System.out.printf ("| %-3d| %-25s | %-8d | %.2f cm | %-11c |\n", i+1, footwearName.get(i), footwearPrice.get(i), footwearHeight.get(i), '-');
						}
						else {
							System.out.printf ("| %-3d| %-25s | %-8d | %-7c | %d Wheels    |\n", i+1, footwearName.get(i), footwearPrice.get(i), '-', footwearWheel.get(i));
						}
					}
					System.out.println("=====================================================================");
					
					int idxDelete;
					do {
						System.out.print("Input footwear index to delete : ");
						idxDelete = scan.nextInt();
					} while(idxDelete <= 0 || idxDelete > footwearName.size());
					
					footwearName.remove(idxDelete-1);
					footwearPrice.remove(idxDelete-1);
					footwearHeight.remove(idxDelete-1);
					footwearWheel.remove(idxDelete-1);
					
					System.out.println("Footwear deleted successfully !!");
				}
			}
			else if(choice == 5) {
				System.out.println("Thanks for using Just DU It Program !");
			}
			System.out.println();
		} while(choice != 5);
	}
	
}
