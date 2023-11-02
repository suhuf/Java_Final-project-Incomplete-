/* 4/12/2022



The intention of this program was too give a menu and then do various different things based on the input from the user

 */


import java.util.Arrays;
import java.util.Scanner;  // imports arrays and inputs

class Scratch {


   public static int AddCust( int[] A, int[] B, String [] C, int x1, int x2, String x3, int y, int z) { // Y is num z is counter rest
       // is input
       for (int i = 0; i < y; i++) {   // Used to add customer to its respective array, each array has its own variables A, B
           // and C. Y is what the number of iterations desired is put as in the future and Z is here so that the index number,
           // changes according to how many times the program has been rerun and not stuck on i
           A[z] = x1;
           B[z] = x2;
           C[z] = x3;  // For loop and then for each array it is attacthed a value based on user input
           z++;
       }
   return z; }

    public static int id_Find(int [] A, int x){

       int z = Arrays.asList(A).indexOf(x);

       return z;  // This was not finished as it kept returning -1 instead of the index number.
    }





               // return z;} */
    /*

    public static int Sales

    {

    } */

    public static int[] S_Comp(int [] A, int x, int y, int z ) // sales range x max y min and ABC for arrays

    {

        int[] good_index = new int[100]; // Declares an empty array

        for (int i = 0; i < z; i++) {

            if (A[i] < x && x > y) {
                good_index[i] = i;    // Index value in saved in this array.
            }
        }

        return good_index;  // This was intended to make an array of indexes that pass the min max filter, I was unable to
        // finish this so that it would have those numbers extracted

    }

    /* public static String Name

    {

    } */

    public static void Display(String[] A, int[] B, int[] C, int z) {
        // instead of void

        for (int i = 0; i < z; i++) {

            System.out.println(" Customer name: " + A[i] + " Customer ID: " + B[i] + " Sales: " + C[i] );

            // Prints customer attributes for various arrays based on i as index position Z is used to limit the number of runs


        }

    }

    public static void main(String[] args) {
        Scanner Sc_int = new Scanner(System.in);
        Scanner Sc_float = new Scanner(System.in);
        Scanner Sc_str = new Scanner(System.in);

        System.out.println();

        System.out.println("Hello! This is a system that saves customer data with a maximum of 100 customers," +
                " you will be prompted to give designated commands shortly.");
        System.out.println();
        System.out.println("What would you like to do today? ");

        int init_Loop = 0; // Init for while loop

        int f = 0; // Place holder

        int[] C_Id = new int[100];
        int[] t_Sales = new int[100];
        String[] C_Name = new String[100] ; // Declares arrays max values
        int counter = 0;


        while (init_Loop <= 0) { //While loop that causes loop as long as no breakage

            System.out.println();
            System.out.println("    " + "MENU\n" +
                "1: Add a customer\n" +
                "2: Display all customers\n" +
                "3: Retrieve a specific customer's data\n" +
                "4: Display customers according to sales range\n" +
                "9: Exit program"); // Change this to a method instead
            System.out.println();
            System.out.print("Please make your selection: ");

            int Select =  Sc_int.nextInt();
            if (Select == 1) { // If entered 1 as selection bleow is executed
                System.out.print("How many customers do you currently want to enter? ");
                int num = Sc_int.nextInt(); // input saved as "num"
                int numfinal = num + counter;


                for(int i = 0; i < num; i++){
                    System.out.print("Enter in Customer ID ");
                    C_Id[counter] = Sc_int.nextInt();
                    System.out.print("Enter in customer sales ");
                    t_Sales[counter] = Sc_int.nextInt();
                    System.out.print("Enter in Customer name ");
                    C_Name[counter] = Sc_str.nextLine();
                    counter++; //Counts number of succesful additoons to array this is used as the index so that
                    // the index position is not innaccurate through using i

                }
            }

            System.out.println(counter);
            if (Select == 9) {
                System.out.println("Thank you for using the program... Exiting ");
                break; // causes program to exit breaks wghile loop
            }

            if (Select == 2) {
                System.out.println("Displaying all Customers!");
                Display(C_Name, C_Id, t_Sales, counter);

            }



            if (Select == 3){
                System.out.print("Enter the ID of desired customer: ");
                int id = Sc_int.nextInt();

                int index = id_Find(C_Id,id);  // was meant to put array and then find number

                System.out.println(index);
            }

            if (Select == 4){
                System.out.println("Enter a maximum ");
                int Max = Sc_int.nextInt();
                System.out.println("Enter a Minimum");
                int Min =Sc_int.nextInt();
                 int [] Good_index = S_Comp(t_Sales, Max, Min, counter);

                System.out.print(Arrays.toString(Good_index));



                for(int i = 0; i < counter; i++){


                    System.out.println(" Customer name: " + C_Name[i] + " Customer ID: " + C_Id[i] + " Sales: " + t_Sales[i] );
                }
                System.out.println("Are within range");  // Unfinished work was supposed to run through good index array

            }




                //System.out.println(Id(C_Id, Num, id1));



                /*

                for(int i = 0, i < num; i++){

                 C_id[i] = Sc_int.nextInt()
                 t_Sales[i] = Sc_float.nextFloat()
                 C_Name[i] = Sc_String.next() // Check this one specifically and change to line if need be

Arrays.asList(TYPES).indexOf("Sedan");

                    }

                */


            }


        }
}
