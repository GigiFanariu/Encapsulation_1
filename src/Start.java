import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house = new House();

        System.out.println(" Enter the address of the house:");
        String address = scanner.nextLine();
        house.setAddress(address);

        System.out.println("Enter floor number: ");
        int floorNumber = scanner.nextInt();
        house.setFloorsNumber(floorNumber);
        scanner.nextLine();

        String houseDetails = String.format("House details:\nFloors: %d\nAddres: %sResidents: %s",
                house.getFloorsNumber(),
                house.getAddress(),
                house.getResidentsNames());

        System.out.println(houseDetails);
    }
}
