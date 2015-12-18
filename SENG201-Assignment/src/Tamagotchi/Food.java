package Tamagotchi;

public class Food{
	private String name;
	private int Red_Bull;
	private int Pasta;
	private int Pizza;
	
	public Food(String name){
		this.name = name;
	}
	public Food(int Red_Bull, int Pizza, int Pasta){
		this.Red_Bull = Red_Bull;
		this.Pasta = Pasta;
		this.Pizza = Pizza;
	}
	public String getName(){
		return this.name;
	}
	public int getredbull(){
		return this.Red_Bull;
	}
	public int getpasta(){
		return this.Pasta;
	}
	public int getpiza() {
		return this.Pizza;
	}

	public void setPizza(int Pizza) {
		this.Pizza = Pizza;
	}
	public void setPasta(int Pasta) {
		this.Pasta = Pasta;
	}
	public void setRedbull(int Red_Bull){
		this.Red_Bull = Red_Bull;
	}
	
}

 