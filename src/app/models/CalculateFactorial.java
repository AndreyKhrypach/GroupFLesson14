package app.models;

public class CalculateFactorial {
    public static class Factorial{

        private long result;
        private int key;

        public Factorial(long number, int x){
            result=number;
            key = x;
        }

        public long getResult() {
            return result;
        }

        public int getKey() {
            return key;
        }
    }

    public static Factorial getFactorial(int x){

        int result=1;
        for (int i = 1; i <= x; i++){
            result *= i;
        }
        return new Factorial(result, x);
    }
}
