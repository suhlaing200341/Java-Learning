package looping;

public class Numbers {
    public static void main(String[] args) {
        SumOfNaturalNumbers sumOfNaturalNumbers = new SumOfNaturalNumbers();
        int numberByforloop = sumOfNaturalNumbers.sumUsingForLoop(5);
        System.out.println("Sum using for loop: "+ numberByforloop);
        int numberByWhileloop = sumOfNaturalNumbers.sumUsingWhileLoop(5);
        System.out.println("Sum using while loop: "+ numberByWhileloop);
    }
}
