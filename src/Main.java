import java.util.*;

public class Main {
    public static void main(String[] args) {
        double metr;
        double temp;
        boolean klima;
        Scanner input = new Scanner (System.in);


        System.out.println("Podaj metraż: ");
        metr = input.nextDouble();
        System.out.println("Podaj temperature: ");
        temp = input.nextDouble();
        System.out.println("Klimatyzacja?: ");
        klima = input.nextBoolean();

        Room room = new Room(metr, temp, klima);

        room.tempDown();

        System.out.printf("temperatura wynosi %f", room.temp);
    }
}
