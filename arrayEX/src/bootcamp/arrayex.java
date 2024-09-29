package bootcamp;

public class arrayex {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 1209, 6, 2, 111, 112, 33};

        int[] neighbours = new int[2];
        int diff = Integer.MAX_VALUE;


        for (int i = 0; i < numbers.length - 1; i++) {
            int difNumbers = Math.abs(numbers[i] - numbers[i + 1]);
            if (difNumbers < diff) {
                diff = difNumbers;
                neighbours[0] = numbers[i];
                neighbours[1] = numbers[i + 1];
            }
        }
        System.out.println(neighbours[0] + " , " + neighbours[1]);

    }
}


