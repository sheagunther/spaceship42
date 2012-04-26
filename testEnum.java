
public enum testEnum {
	playerOne("Shea", "Level 1", 22),
	monsterOne("Scarebot", "Level 1", 33);
	
	private final String name;
	private final String level;
	private final int healthPoints;
	
	testEnum(String name, String level, int healthPoints){
		this.name = name;
		this.level = level;
		this.healthPoints = healthPoints;
	}
	
	public String getName(){
		return name;
	}

	public String getLevel() {
		return level;
	}

	public int getHealthPoints() {
		return healthPoints;
	}
	
	
	
}
