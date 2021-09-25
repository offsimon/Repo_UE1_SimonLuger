public class Main {

    public static void main(String[] args) {

        EratosthenesPrimeSieve er = new EratosthenesPrimeSieve(13);

        //Beispiel 1
        er.printPrimes();
        System.out.println(er.isPrime(13));

        //Beispiel 2
        er.evenNumberSuspicionAlgorithm(13);

    }
}
