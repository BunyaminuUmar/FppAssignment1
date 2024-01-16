package Assignment1;

public class Question3 {
    public static void main(String[] args) {

            long randomNumber = RandomNumbers.getRandomInt(0, 2_000_000_000);
            System.out.println("Random Number: " + randomNumber);

            if (randomNumber >= Byte.MIN_VALUE && randomNumber <= Byte.MAX_VALUE) {
                System.out.println("Preferred Data Type: byte");
            } else if (randomNumber >= Short.MIN_VALUE && randomNumber <= Short.MAX_VALUE) {
                System.out.println("Preferred Data Type: short");
            } else {
                System.out.println("Preferred Data Type: int");
            }

    }
}

