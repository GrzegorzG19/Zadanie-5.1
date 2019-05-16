import java.util.*;

public class Main {
    public static void main(String[] args) {

        double temp;

        Scanner input = new Scanner (System.in);


        System.out.println("Podaj temperature: ");
        temp = input.nextDouble();

        Room room = new Room(20, temp, true);

        room.tempDown();

        System.out.printf("temperatura wynosi %.2f", room.temp);
    }
}
