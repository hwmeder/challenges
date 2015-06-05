package hwm.challenges;

import java.util.ArrayList;
import java.util.List;

public class Primes {

	public static List<Integer> getPrimes(int upperBound) {
		List<Integer> primes = new ArrayList<Integer>();
		for (int numberUnderTest = 2; numberUnderTest <= upperBound; numberUnderTest++) {
			boolean prime = true;
			loop: for (int i : primes) {
				if (i <= Math.sqrt(numberUnderTest)) {
					if (numberUnderTest % i != 0) {
						continue loop;
					}
				}else{
					break;
				}
				prime = false;
			}
			if (prime) {
				primes.add(numberUnderTest);
			}
		}
		return primes;
	}

}
