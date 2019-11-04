import java.util.NoSuchElementException;
import java.util.Scanner;

class Dec2Hex{

    public static int Arg1;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("================= Decimal to Hexadecimal Converter ===============");
        do{
            try{
                switch (menu()) {
                    case 1:
                        System.out.println("Please enter an Integer:");
                        Arg1 = input.nextInt();
                        if (Arg1 != 0) {
                            if (args.length > 0) {
                                try {
                                    Arg1 = Integer.parseInt(args[0]);
                                } catch (NumberFormatException e) {
                                    System.err.println("Argument" + args[0] + " must be an integer.");
                                    System.exit(1);
                                }
                            }
                            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                            int rem, num;
                            num = Arg1;
                            String hexadecimal = "";
                            System.out.println("Converting the Decimal Value " + num + " to Hex...");

                            while (num != 0) {
                                rem = num % 16;
                                hexadecimal = ch[rem] + hexadecimal;
                                num = num / 16;
                            }

                            System.out.println("Hexadecimal representation of " + Arg1 + " is : " + hexadecimal);
                        }else{
                            System.out.println(Arg1 + " is invalid, please try again");
                        }

                        break;
                    case 2:
                        System.out.println("Thank you, Goodbye");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice Please Try again");
                }
            }catch(NoSuchElementException e){
                System.out.println("Error: Timeout on user input");
                System.exit(0);
            }
        }while (menu() == 1  || menu() == 2);

    }
    private static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Please enter your choice and press enter:");
        System.out.println("1 - Enter a Decimal to convert to Hexadecimal \n2 - Quit");

        selection = input.nextInt();
        return selection;
    }
}

