
public class FVCalc {
	public static void main(String[] args) {
		int currentValue = Integer.parseInt(args[0]); 
		double rate = Double.parseDouble(args[1]); 
		int n = Integer.parseInt(args[2]);

		 double newRate = rate/100; 



		double futureValue = currentValue*(Math.pow(1+newRate ,n));

		System.out.println ("After " +n+ " yaers, $" + currentValue + " saved at " + rate +"% will yield $" + (int) futureValue);



	}
}