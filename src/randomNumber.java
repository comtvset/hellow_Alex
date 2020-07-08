import java.util.Random;

public class randomNumber {
    public static void main(String[] args) {
        int min = 100;
        int max = 999;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff+1);
        i += min; //равносильная запись i = i+min;

        int a = i/100;
        int b = (i-(a*100))/10;
        int c = i - (a*100)-(b*10);
        int sum = a+b+c;

        System.out.println("Random number: "+i);
        System.out.println("Sum of random numbers: "+sum);
    }
}
