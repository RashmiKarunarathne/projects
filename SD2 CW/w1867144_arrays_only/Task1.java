import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Task1 {
    private static boolean S_menu = true;


    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String cabinName;
        int cabinNum = 0;
        String[] ship = new String[12];
        int[] guestNo = new int[12];
        String[] fName = new String[12];
        String[] SName = new String[12];
        long[] expense = new long[12];

        initialise(ship);


// menu

        while (S_menu){
            System.out.println("        ........WELCOME TO THE CRUISE SHIP........       ");
            System.out.println("                ...CRUISE SHIP MENU...                   ");
            System.out.println("Enter 'A' to add a customer to a cabin                  :");
            System.out.println("Enter 'V' to view all cabin                             :");
            System.out.println("Enter 'E' to Display Empty cabin                        :");
            System.out.println("Enter 'D' to Delete customer from cabin                 :");
            System.out.println("Enter 'F' to Find cabin from customer name              :");
            System.out.println("Enter 'S' to Store program data into file               :");
            System.out.println("Enter 'L' to Load program data from file                :");
            System.out.println("Enter 'O' to View guests Ordered alphabetically by name :");

            String selection = input.next();

            switch (selection){
                case "A":
                    add_customer(ship, guestNo, fName, SName, expense);
                    break;

                case "V":
                    view_all_cabin(ship, guestNo, fName, SName, expense);
                    break;

                case "E":
                    empty_cabins(ship);
                    break;

                case "D":
                    del_cus_cabin(ship);
                    break;

                case "F":
                    find_cabin(ship);
                    break;

                case "S":
                    info_file(ship, guestNo, fName, SName, expense);
                    break;

                case "L":
                    load_prog_data(ship, guestNo, fName, SName, expense);
                    break;

                case "O":
                    order_name(ship);
                    break;
            }
            boolean choice = true;

            while (choice){
                System.out.println("Enter 1 to Continue or 2 to Exit: ");
                int com = input.nextInt();

                if (com == 1){
                    S_menu = true;
                    choice = false;
                }else if(com == 2){
                    S_menu = false;
                    choice = false;
                }else{
                    System.out.println("Invalid Input...");
                }

            }

        }

    }


    // initialising

    public static void initialise( String shipRef[] ) {
        for (int x = 0; x < 12; x++ ) shipRef[x] = "e";
        System.out.println( "initilise ");
    }

    // adding customers to cabins

    public static void add_customer(String[] ship, int[] guestNo, String[] fName, String[] SName, long[] expense){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cabin Number 0 to 11: ");
        int cabin_num = input.nextInt();

        System.out.println("Enter Name for cabin Number " + cabin_num + ": ");
        String cabinName = input.next();
        ship[cabin_num] = cabinName;

        System.out.println("Enter the Number of Passengers in a cabin: ");
        int guest = input.nextInt();
        guestNo[cabin_num] = guest;

        System.out.println("Enter the First Name: ");
        String fNamePay = input.next();
        fName[cabin_num] = fNamePay;

        System.out.println("Enter the Surename: ");
        String sNamepay = input.next();
        SName[cabin_num] = sNamepay;

        System.out.println("Enter Expense : ");
        long cardNopay = input.nextLong();
        expense[cabin_num] = cardNopay;


    }

    // view all cabins

    public static void view_all_cabin (String[] ship , int[] guestNo, String[] fName, String[] SName, long[] expense){
        for (int x=0; x<ship.length; x++){
            if(ship[x].equals("e")){
                System.out.println("cabin Number " + x + " is Empty");
            }else{
                System.out.println("-------------------------------------");
                System.out.println("cabin " + x +" Occupied by " + ship[x]);
                System.out.println("Number of Passengers " + guestNo[x]);
                System.out.println("First Name " + fName[x]);
                System.out.println("SurnameName " + SName[x]);
                System.out.println("Expenses " + expense[x]);
                System.out.println("-------------------------------------");
            }

        }
    }

    //view empty cabins

    private static void empty_cabins(String[] ship){
        for (int x=0; x<ship.length; x++){
            if (ship[x].equals("e")){
                System.out.println("cabin " + x + " is empty");
            }
        }

    }

    //deleting a customer from a cabin

    public static void del_cus_cabin(String[] ship){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cabin number to remove customer: ");
        int cabinNumber=input.nextInt();
        ship[cabinNumber] = "e";
        System.out.println("Removed Successfully...");

    }

    // finding the cabin by a customer name

    public static void find_cabin(String[] ship){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Cabin Name: ");
        String cus_name = input.next();

        for(int i=0; i<ship.length; i++){
            if(ship[i].equals(cus_name)){
                System.out.println(cus_name + " is in cabin Number " + i);
            }
        }

    }

    //writing input data into a text file

    public static void info_file(String[] ship, int[] guestNo, String[] fName, String[] SName, long[] expense)throws FileNotFoundException {
        File info_file = new File("Customer_Info.txt");
        PrintStream writer = new PrintStream(info_file);

        for (String temp : ship){
            writer.println(temp);
        }
        for (int temp : guestNo){
            writer.println(temp);
        }
        for (String temp : fName){
            writer.println(temp);
        }
        for (String temp : SName){
            writer.println(temp);
        }
        for (long temp : expense){
            writer.println(temp);
        }
        System.out.println("...Successfully Saved...");
        writer.close();

    }

    //load the input data which has written into the text file

    public static void load_prog_data(String[] ship, int[] guestNo, String[] fName, String[] SName, long[] expense) throws IOException {

        try {
            File inputFile = new File("Customer_Info.txt");
            Scanner rf = new Scanner(inputFile);
            String fileLine;

            while (rf.hasNext()) {
                fileLine = rf.nextLine();
                System.out.println(fileLine);
            }
            rf.close();

        }

        catch (IOException e) {
            System.out.println("An error occurred");
        }

        System.out.println("...Successfully Loaded...");
    }



    //viewing the cabin names according to alphabetical order

    public static void order_name(String[] ship){
        String []shipArray = new String[ship.length];
        for(int i = 0; i < ship.length; i++){
            shipArray[i] = ship[i];
        }
        int n = shipArray.length;
        for (int x = 0; x < n - 1; x++)
        {
            for(int y = 0; y <= n - 2; y++)
            {
                if (shipArray[y].compareToIgnoreCase(shipArray[y + 1]) > 0)
                {
                    String temp = shipArray[y];
                    shipArray[y] = shipArray[y + 1];
                    shipArray[y + 1] = temp;
                }
            }
        }

        for(String temp:shipArray){
            if(!temp.equals("e")) {
                System.out.println(temp);
            }
        }

    }
}

