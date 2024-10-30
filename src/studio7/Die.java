package studio7;
import java.util.Scanner;

public class Die {

	private int n;
	
	public Die(int n) {
		this.n = n;
	}
	
	public int roll() {
		int numberRolled = (int) (Math.random()*n)+1;
		System.out.println("We rolled " + numberRolled);
		return numberRolled;
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
		System.out.println("How many sides does the dice have?");
		int dice = in.nextInt();
		Die r1 = new Die(dice);
		r1.roll();

	}

}
