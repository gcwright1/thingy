import java.util.*;
public class Movies {

	public static void main(String[] args) {
		//declare variables
		Scanner greyson = new Scanner(System.in);
		double adultTickets;
		double childrenTickets;
		double total;

		//ask questions & get answers
		System.out.println ("How many adult tickets?");
		adultTickets=10.25*greyson.nextDouble ();
		System.out.println ("How many children tickets?");
		childrenTickets=5*greyson.nextDouble ();

		//do math
		total = adultTickets+childrenTickets;


		//show the answer
		System.out.println ("The total price will be $"+(1.06*(total)));
		blah

	}

}
