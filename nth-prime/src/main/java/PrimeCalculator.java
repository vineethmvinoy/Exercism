
class PrimeCalculator {

    int nth(int nth) throws IllegalArgumentException {
        if(nth<=0)
        throw new IllegalArgumentException();
        int i = 2;
        int count = 0;
        while (count < nth) {
            if (isPrime(i)) {
                count++;
            }
            i++;
        }
        return i - 1; // Return the last prime number found
    }

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}