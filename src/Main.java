public class Main {

    public static void main(String[] args) {

        EratosthenesPrimeSieve er = new EratosthenesPrimeSieve(100);

        //Task 1
        er.printPrimes();
        System.out.println(er.isPrime(100));

        //Task 2
        er.evenNumberSuspicionAlgorithm(100);

    }
}
