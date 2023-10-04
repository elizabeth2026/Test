import java.util.Scanner;
public class Main {
    public static String main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to the jungle. Your task is to bypass the animals and complete the game without losing");
        System.out.println("please enter your name to begin");
        String theName = scanner.next();
        String firstName = name(theName);
        System.out.println(firstName);
        System.out.println("A monkey is staring at you, suspicious. The monkey reaches out a hand. To shake it, press 1. To not shake it, press 0 ");
        int monkey = scanner.nextInt();
        if (monkey == 1) {
            return "sorry :( you lose";
            System.exit(0);
        } else if (monkey == 0) {
            return "Congrats, you get to keep going!";
        }
        System.out.println("you keep walking and you run into a rhino");
        System.out.println("To touch the rhino's horn, press 1. To stroke the rhino, press 0");
        int rhino = scanner.nextInt();
        if (rhino == 1) {
            return "sorry haha you lose";
        }
        if (rhino == 0) {
            return "yay you can continue!";
        }

        System.out.println("Next, you run into a excited elephant");
        System.out.println("To calm it down, please input a five letter word that starts with 'r' and ends with 'x', and is a synonym with calm down");
        String relax = scanner.next();
        if (relax.equals("relax")) {
            return "correct!";
        }
            System.exit(0);


    }



    //method monkey1
    public static String name(String name) {
        return ("Hello " + name + "!");
    }

    //method checkRelax
    public static String checkRelax(String relax) {
        if (relax.equals("relax")) {
            return "correct!";
        } else if (relax.substring(0).equals("relax")) {
            return "Sorry :(";
        }
        System.exit(0);

    }
}