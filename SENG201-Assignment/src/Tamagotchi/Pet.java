package Tamagotchi;
public class Pet {
	private String name;
	private int mood;
	private int hungry;
	private int health;

	public Pet(String i){
		this.name = i;
	}
	public Pet(int mood, int hungry, int health){
		this.mood = mood;
		this.health = health;
		this.hungry = hungry;
	}
	public String getName(){
		return this.name;
	}
	public int gethealth(){
		return this.health;
	}
	public int gethungry(){
		return this.hungry;
	}
	public int getMood() {
		return this.mood;
	}	
	public void setMood(Integer mood) {
		this.mood = mood;
	}
	public void setHealth(Integer health) {
		this.health = health;
	}
	public void setHungry(Integer hungry){
		this.hungry = hungry;
	}
}
