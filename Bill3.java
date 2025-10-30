
import java.util.stream.Gatherer;

// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

		// args of string
	    String name1 =args[0];
		String name2 = rgs[1]; 
		String name3 =args[2];
		int total = Integer.parseInt(args[3]); // convert string to int 

		double SumPerson = (double) total/3; //convert int to double

		double bill = Math.ceil(SumPerson); //roundup the sum 

		System.out.println("dear " + name3 + ", " + name2 + " and " + name1 + ":pay " + bill + " Shekels each.");

	
	
	}
}
