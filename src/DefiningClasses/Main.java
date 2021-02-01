package DefiningClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] info = scan.nextLine().split("\\s+");

        while (n-- > 0) {
            CarConstructor car;
            String brand = info[0];

            if (info.length == 1) {
                car = new CarConstructor(brand);
            }else {
                String model = info[1];
                int horsePower = Integer.parseInt(info[2]);

                car = new CarConstructor(brand, model, horsePower);
            }
            System.out.printf("The car is: %s %s - %d HP.\n", car.getBrand(), car.getModel(), car.getHorsePower());

            info = scan.nextLine().split("\\s+");
        }
    }
}
