
import java.io.File;                                 // Import the File class
import java.io.FileNotFoundException;                // Import this class to handle errors
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;                              // Import the Scanner class to read text files

public class Ship {
    private static boolean S_menu = true;


    public static void main(String[] args) throws IOException  {

        //initialising the array

        Ship shipObj = new Ship();
        Cabin[] cabinObj = new Cabin[12];
        Passenger[] perObj = new Passenger[12];

        Queue queObj = new Queue();

        Scanner input = new Scanner(System.in);


        for (int i = 0; i < cabinObj.length; i++){
            cabinObj[i] = new Cabin();

        }
        for(int i = 0; i < perObj.length; i++){
            perObj[i] = new Passenger();
        }

        shipObj.initialise(cabinObj);


        // Cruise ship menu

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
            System.out.println("Enter 'T' to view customer expenses                     :");

            String selection = input.next();

            switch (selection){

                case "A":
                    shipObj.add_customer(cabinObj, perObj , queObj);
                    break;

                case "V":
                    shipObj.view_all_cabins(cabinObj, perObj);
                    break;

                case "E":
                    shipObj.empty_cabins(cabinObj);
                    break;

                case "D":
                    shipObj.del_cus_cabin(cabinObj);
                    break;

                case "F":
                    shipObj.find_cabin(cabinObj , new Passenger[][]{perObj});
                    break;

                case "S":
                    shipObj.info_file(cabinObj , perObj);
                    break;

                case "L":
                    load_prog_data(cabinObj , perObj , queObj);
                    break;

                case "O":
                    shipObj.order_name(cabinObj);
                    break;

                case "T":
                    display_expenses(cabinObj , perObj);
                    break;

            }


            //exit or continue  the menu selection


            boolean choice = true;

            while (choice) {
                System.out.println("Enter 1 to Continue or 2 to Exit: ");
                int com = input.nextInt();

                if (com == 1) {
                    S_menu = true;
                    choice = false;
                }

                else if(com == 2){
                    S_menu = false;
                    choice = false;
                }

                else{
                    System.out.println("...Invalid Input...");
                }

            }

        }

    }


    public Ship(){}
    public void initialise(Cabin[] cabinObj) {
        for (int x = 0; x < 12; x++ ) cabinObj[x].setCusName("e");
        System.out.println("initialise");
    }

    //method for add a customer to a cabin

    public void add_customer(Cabin[] cabinObj, Passenger[] perObj , Queue queObj){

        boolean emCabin = false;

        for(int i = 0; i < cabinObj.length; i++){
            if(cabinObj[i].getCusName().equals("e")){
                emCabin = true;
            }
        }
        if(emCabin){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter cabin Number 0 to 11: ");
            int cabin_num = input.nextInt();

            System.out.println("Enter Name for Cabin Number " + cabin_num + ": ");
            String cabinName = input.next();
            cabinObj[cabin_num].setCusName(cabinName);

            System.out.println("Enter the Number of passengers in a Cabin: ");
            int pasenger = input.nextInt();
            perObj[cabin_num].setnoCabin(pasenger);

            System.out.println("Enter the First Name: ");
            String fNamePay = input.next();
            perObj[cabin_num].setcusFname(fNamePay);

            System.out.println("Enter the Surname: ");
            String sNamepay = input.next();
            perObj[cabin_num].setcusSname(sNamepay);

            System.out.println("Enter your Expenses ($): ");
            long expensespay = input.nextLong();
            perObj[cabin_num].setExpenses(expensespay);

        }

        else{

            queObj.addQue();

        }


    }

    void setcusSname(String sNamepay) {
    }


    //method  for view all cabins

    public void view_all_cabins(Cabin[] cabinObj , Passenger[] perObj){
        for (int x=0; x< cabinObj.length; x++){
            if(cabinObj[x].getCusName().equals("e")){
                System.out.println("Cabin Number " + x + " is Empty");
            }else{
                System.out.println("-------------------------------------");
                System.out.println("Cabin " + x +" Occupied by " + cabinObj[x].getCusName());
                System.out.println("Number of Guest " + perObj[x].getnoCabin());
                System.out.println("First Name " + perObj[x].getcusFname());
                System.out.println("SurName " + perObj[x].getcusSname());
                System.out.println("Expenses " + perObj[x].getExpenses());
                System.out.println("-------------------------------------");
            }

        }
    }

    //method  for Display Empty cabins

    public void empty_cabins(Cabin[] cabinObj){
        for (int x=0; x<cabinObj.length; x++){
            if (cabinObj[x].getCusName().equals("e")){
                System.out.println("cabin " + x + " is empty");
            }
        }

    }

    //method  for Delete customer from cabin

    public void del_cus_cabin(Cabin[] cabinObj){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cabin number to remove customer: ");
        int cabinNumber=input.nextInt();
        cabinObj[cabinNumber].setCusName("e");
        System.out.println("Removed Successfully...");

    }

    //method Find cabin from customer name

    public static void find_cabin (Cabin[] cabinObj, Passenger[][] perObj) {
        Scanner User = new Scanner(System.in);
        System.out.println("Enter cabin name: ");
        String getcusFName = User.next();
        for (int i = 1; i < perObj.length; i++) {
            for (int j = 1; j < perObj.length; j++) {
                String findName = perObj[i][j].getcusFName();
                if (findName.equalsIgnoreCase(getcusFName)) {
                    System.out.println("Cabin is " + i + " Passenger location is " + j + "\n");
                }
            }
        }

    }

    String getcusFName() {
        String cusFname = null;
        return cusFname;}


    //method Store program data into file

    public void info_file(Cabin[] cabinObj , Passenger[] perObj)throws FileNotFoundException {
        File info_file = new File("Customer_Info.txt");
        PrintStream writer = new PrintStream(info_file);

        for (int i = 0; i < cabinObj.length; i++){
            writer.println(cabinObj[i].getCusName());
        }
        for(int i = 0; i < perObj.length; i++){
            writer.println(perObj[i].getnoCabin());
            writer.println(perObj[i].getcusFname());
            writer.println(perObj[i].getcusSname());
            writer.println(perObj[i].getExpenses());
        }
        System.out.println("Successfully Saved...");

    }

    //method Load program data from file

    public static void load_prog_data(Cabin[] cabinObj, Passenger[] perObj , Queue queObj) {

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


    //method to view  expenses


    public static void display_expenses(Cabin[] cabinObj, Passenger[] perObj) {
        for (int x = 0; x < cabinObj.length; x++) {
            if (cabinObj[x].getCusName().equals("e")) {
                System.out.println("Expenses " + perObj[x].getExpenses());
            } else {
                System.out.println("Expenses " + perObj[x].getExpenses());
            }

        }
    }

    //method to View customers  alphabetically ordered by name

    public void order_name(Cabin[] cabinObj){
        String []shipArray = new String[cabinObj.length];
        for(int i = 0; i < cabinObj.length; i++){
            shipArray[i] = cabinObj[i].getCusName();
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