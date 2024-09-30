import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String partyAfil = "";
        String trash = "";

        System.out.println("What party are you? [DRI]: ");


            if (console.hasNext("R")){
                System.out.println("You get a Republican Elephant!");
            } else if (console.hasNext("D")) {
                System.out.println("You get a Democratic Donkey");
            } else if (console.hasNext("I")) {
                System.out.println("You get a Independent Person");
            } else {
            trash = console.next();
            System.out.println("You said your party was " + trash + ", this is an incorrect format");
            System.out.println("Please run the program again.");
            }


    }
}