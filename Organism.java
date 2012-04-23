
public class Organism {
	private double healthPointsMax;
	private double currentHealthPoints;
	private String name;
	private String species;
	private int baseDamageMin;
	private int baseDamageMax;
	private int baseArmorClass;
	
	private int level;
	private int experiencePoints;
	
	private Inventory organismInventory = new Inventory();
	
	public Organism(){
	}
	
	public int getHealthPercentage(){
		return (int)((currentHealthPoints/healthPointsMax) * 100);
	}
	
	public double getHealthPointsMax() {
		return healthPointsMax;
	}

	public void setHealthPointsMax(double healthPointsMax) {
		this.healthPointsMax = healthPointsMax;
	}

	public double getCurrentHealthPoints() {
		return currentHealthPoints;
	}

	public void setCurrentHealthPoints(double currentHealthPoints) {
		this.currentHealthPoints = currentHealthPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
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

	public int getBaseArmorClass() {
		return baseArmorClass;
	}

	public void setBaseArmorClass(int baseArmorClass) {
		this.baseArmorClass = baseArmorClass;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExperiencePoints() {
		return experiencePoints;
	}

	public void setExperiencePoints(int experiencePoints) {
		this.experiencePoints = experiencePoints;
	}

	public Inventory getOrganismInventory() {
		return organismInventory;
	}

	public void setOrganismInventory(Inventory organismInventory) {
		this.organismInventory = organismInventory;
	}


}
