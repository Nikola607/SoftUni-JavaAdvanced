package DefiningClasses.SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Set<Car> set = new LinkedHashSet<>();

        while (n-- > 0){
            String[] data = scan.nextLine().split("\\s+");

            String model = data[0];
            int fuelAmount = Integer.parseInt(scan.nextLine());
            double fuelPrice = Double.parseDouble(scan.nextLine());

            Car car = new Car(model, fuelAmount, fuelPrice);
            set.add(car);
        }

        String[] command = scan.nextLine().split("\\s+");

        while (!command[0].equals("End")){
            String model = command[1];
            int kmToDrive = Integer.parseInt(command[2]);

            command = scan.nextLine().split("\\s+");
        }
    }
}
