
public class Hero {
	private String role;
	private String name;
	private String skill;
	private int HP;
	private int power;
	
	public Hero(String role, String name, String skill, int HP, int power) {
		super();
		this.role = role;
		this.name = name;
		this.skill = skill;
		this.HP = HP + 100;
		this.power = power;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
}
