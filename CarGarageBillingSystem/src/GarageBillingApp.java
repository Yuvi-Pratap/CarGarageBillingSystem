import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) throws FileNotFoundException {
        GarageService garageService=new GarageService();
        Scanner sc=new Scanner(System.in);

        System.out.println("------------------Your Car Service Center------------------");
        while(true)
        {
            System.out.println("1. Add Customer");
            System.out.println("2. Display Services");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice:");
            int choice=sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter Customer Name:");
                    String name=sc.nextLine();
                    System.out.println("Enter Phone number:");
                    String phone=sc.nextLine();
                    System.out.println("Enter Car Number:");
                    String carNum=sc.nextLine();
                    System.out.println("Enter car Model:");
                    String model=sc.nextLine();
                    garageService.addCustomer(name,phone,carNum,model);
                    break;
                case 2:
                    System.out.println("Enter car number:");
                    String carNo=sc.next();
                    garageService.createInvoice(carNo);
                    break;
                case 3:
                    System.out.println("Exiting.... Thank You!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        }
    }
}
