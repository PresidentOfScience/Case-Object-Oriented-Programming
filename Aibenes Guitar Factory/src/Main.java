import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		ArrayList<String> guitarType = new ArrayList<String>();
		ArrayList<String> guitarSoundType = new ArrayList<String>();
		ArrayList<Integer> guitarTone = new ArrayList<Integer>();
		ArrayList<Integer> guitarVolume = new ArrayList<Integer>();
		ArrayList<Integer> guitarSwitch = new ArrayList<Integer>();
		
		int choice;
		do {
			System.out.println("1. Build Guitar");
			System.out.println("2. Display List of Guitar");
			System.out.println("3. Exit");
			System.out.print("Choose menu[1..3]: ");
			choice = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			if(choice == 1) {
				System.out.println("1. Acoustic");
				System.out.println("2. Electric");
				System.out.println("3. Acoustic Electric");
				System.out.print("Input guitar type[1..3]: ");
				int type = scan.nextInt();
				scan.nextLine();
				
				if(type == 1) {
					Acoustic ac = new Acoustic(random.nextInt(2));
					guitarType.add("Acoustic Guitar");
					guitarSoundType.add(ac.getGuitarSoundType());
					guitarTone.add(-1);
					guitarVolume.add(-1);
					guitarSwitch.add(-1);
				}
				else if(type == 2) {
					System.out.print("Input switch position: ");
					int switchPos = scan.nextInt();
					System.out.print("Input tone: ");
					int tone = scan.nextInt();
					System.out.print("Input volume: ");
					int volume = scan.nextInt();
					Electric el = new Electric(switchPos, tone, volume);
					guitarType.add("Electric Guitar");
					guitarSoundType.add(el.getGuitarSoundType());
					guitarTone.add(el.getTone());
					guitarVolume.add(el.getVolume());
					guitarSwitch.add(el.getSwitchPos());
				}
				else if(type == 3) {
					AcousticElectric acEl = new AcousticElectric(0);
					guitarType.add("Acoustic Electric Guitar");
					guitarSoundType.add(acEl.getGuitarSoundType());
					guitarTone.add(acEl.getTone());
					guitarVolume.add(acEl.getVolume());
					guitarSwitch.add(-1);
				}
			}
			else if(choice == 2) {
				System.out.println("[GuitarType]-[GuitarSoundType]-[Tone]-[Volume]-[SwitchPosition]");
				int size = guitarType.size();
				for(int i=0; i<size; i++) {
					System.out.print(guitarType.get(i) + " - " + guitarSoundType.get(i));
					if(guitarType.get(i) == "Acoustic Guitar") {
						System.out.println();
					}
					else if(guitarType.get(i) == "Electric Guitar") {
						System.out.println(" - " + guitarTone.get(i) + " - " + guitarVolume.get(i) + " - " + guitarSwitch.get(i));
					}
					else {
						System.out.println(" - " + guitarTone.get(i) + " - " + guitarVolume.get(i));
					}
				}
			}
			else if(choice == 3) {
				System.out.println("Program stopped successfully.");
			}
			System.out.println();
		} while(choice != 3);
	}

}
