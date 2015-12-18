package Tamagotchi;
public class Toys {
	private String name;
	private int Rugby_ball;
	private int Motorbike;
	private int Puppet;

	public Toys(String name){
		this.name = name;
	}
	public Toys(int Motorbike, int Puppet, int Rugby_ball){
		this.Rugby_ball = Rugby_ball;
		this.Motorbike = Motorbike;
		this.Puppet = Puppet;
	}
	public String getName(){
		return this.name;
	}
	public int getRugby_ball(){
		return this.Rugby_ball;
	}
	public int getMotorbike(){
		return this.Motorbike;
	}
	public int getPuppet() {
		return this.Puppet;
	}	
	
	
	
	public void setRugby_ball(int Rugby_ball) {
		this.Rugby_ball = Rugby_ball;
	}

	public void setMotorbike(int Motorbike) {
		this.Motorbike = Motorbike;
	}
	public void setPuppet(int Puppet){
		this.Puppet = Puppet;
	}
	
}
