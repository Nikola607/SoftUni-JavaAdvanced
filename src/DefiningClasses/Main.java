package DefiningClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] info = scan.nextLine().split("\\s+");

        while (n-- > 0){
            String brand = info[0];
            String model = info[1];
            int horsePower =Integer.parseInt(info[2]);

            CarInfo car = new CarInfo(brand, model, horsePower);
            System.out.printf("The car is: %s %s - %d\n", car.getBrand(), car.getModel(), car.getHorsePower());
            info = scan.nextLine().split("\\s+");
        }
    }
}
