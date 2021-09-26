import java.util.ArrayList;
import java.util.Arrays;

public class EratosthenesPrimeSieve implements PrimeSieve {

    private int upperLimit;

    public EratosthenesPrimeSieve(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Override
    public boolean isPrime(int p) {

        boolean[] sieveResult = sieveAlgorithm(p + 1);
        return sieveResult[p];
    }

    @Override
    public void printPrimes() {

        boolean[] primes = sieveAlgorithm(upperLimit);

        for (int i = 2; i < primes.length; i++) {

            if (primes[i]) {
                System.out.print(i + ", ");
            }
        }

    }

    public boolean[] sieveAlgorithm(int limit) {

        boolean[] primes = new boolean[limit+1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i < primes.length / 2; i++) {

            for (int j = i+i; j < primes.length; j += i) {//set multiples to false
                primes[j] = false;
            }

            if (primes[i]) {
                for (int j = i + 1; j < primes.length; j++) {

                    if (j % i == 0) {
                        primes[j] = false;
                        j = primes.length+1;
                    }
                }
            }
        }

        return primes;
    }

    public void evenNumberSuspicionAlgorithm(int limit) {

        boolean[] sieve = sieveAlgorithm(limit);
        ArrayList<Integer> primeList = new ArrayList<>();

        for (int i = 2; i < sieve.length; i++) {

            if (sieve[i]) {
                primeList.add(i);
            }
        }

        for (int i = 4; i <= limit; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < primeList.size(); j++) {

                    for (int k = 0; k < primeList.size(); k++) {

                        if (primeList.get(j) + primeList.get(k) == i) {
                            System.out.println(i + " summe: " + i + " = " + primeList.get(j) + " + " + primeList.get(k));
                            k = primeList.size();
                            j = primeList.size();
                        }
                    }

                }

            }


        }

    }


}
