import java.util.Scanner;

public class Main {


        public void menu() {
            System.out.println("1. Create department");
            System.out.println("2. Show department");
            System.out.println("3. Modify department");
            System.out.println("4. Delete department");
            System.out.println("5. Export data base to XML file");
            System.out.println("6. Exit");
        }


    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Boolean exit = false;
            Department department = new Department();

            while (!exit) {
                Main main = new Main();
                main.menu();
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        department.show();
                        break;
                    case 2:
                        department.show();
                        break;
                    case 3:
                        department.modify();
                        break;
                    case 4:
                        department.delete();
                        break;
                    case 5:
                        department.export();
                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        System.out.println("Wrong choice");
                }
            }



    }




}