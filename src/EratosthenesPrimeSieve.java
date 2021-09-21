import java.util.Arrays;

public class EratosthenesPrimeSieve implements PrimeSieve {

    private int upperLimit;

    public EratosthenesPrimeSieve(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Override
    public boolean isPrime(int p) {
        return false;
    }

    @Override
    public void printPrimes() {

        boolean[] primes = sieveAlgorithm(100);

        for (int i = 2; i < primes.length; i++) {

            if(primes[i] == true) {
                System.out.print(i + ", ");
            }
        }

    }

    public boolean[] sieveAlgorithm(int limit) {

        boolean[] primes = new boolean[limit];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 0; i < primes.length / 2; i++) {

            if (primes[i] == true) {
                for (int j = i + 1; j < primes.length; j++) {

                    if (j % i == 0) {
                        primes[j] = false;
                    }
                }
            }
        }

        return primes;
    }
}
