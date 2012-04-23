
public class Weapon extends Item{
	
	private int baseDamageMin;
	private int baseDamageMax;
	
	private String weaponType;
	private String weaponName;

	public Weapon(){
	}

	public int getDamageDealt(){
		return 7;
	}

	public int getBaseDamageMin() {
		return baseDamageMin;
	}

	public void setBaseDamageMin(int baseDamageMin) {
		this.baseDamageMin = baseDamageMin;
	}

	public int getBaseDamageMax() {
		return baseDamageMax;
	}

	public void setBaseDamageMax(int baseDamageMax) {
		this.baseDamageMax = baseDamageMax;
	}

	public String getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	
	
}
