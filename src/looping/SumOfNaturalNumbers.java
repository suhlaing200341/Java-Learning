package looping;
public class SumOfNaturalNumbers {
    private int sum1 = 0;
    private int sum2 = 0;
    public int sumUsingForLoop(int n){
        for (int i = 0; i <= n; i++) {
            this.sum1 += i;
        }
        return this.sum1;
    }

    public int sumUsingWhileLoop(int n){
        int i = 0;
        while (i <= n) {
            this.sum2 += i;
            i++;
        }
        return this.sum2;
    }
}