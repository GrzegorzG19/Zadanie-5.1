public class Room {
    double metr;
    double temp;
    boolean klima;
    boolean downTemp;

    public Room(double metr, double temp, boolean klima) {
        this.metr = metr;
        this.temp = temp;
        this.klima = klima;
    }

    boolean tempDown(){

        if (klima == true && temp>10) {
            temp -= 1;
            downTemp = true;
        }
        return downTemp;
    }
}
