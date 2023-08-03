import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house = new House();
        System.out.println("Enter number of floors");
        house.setFloorsNumber(scanner.nextInt());

        scanner.nextLine();
        System.out.println("Enter adress");
        house.setAddress(scanner.nextLine());

        System.out.println("Enter resident names (comma separated):");
        house.setResidentsNames(scanner.nextLine());

        String houseDetails = String.format("House details:\nFloors: %d\nAddres: %sResidents: %s",
           house.getFloorsNumber(),
           house.getAddress(),
           house.getResidentsNames() );
        
        System.out.println(houseDetails);
    }
}
