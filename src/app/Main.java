package app;

import java.util.Scanner;

public class Main {

    static String text;
    static String fileName;
    static String choice;

    public static void main(String[] args) {

        getData();

        if (Integer.parseInt(choice) == 1){
        getOutput(writeData());
        } else {
            getOutput(readData());
        }

    }

    private static void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                What would you like to do:
                                
                1 - to create new file with info
                2 - to read the file
                                
                """
        );

        choice = sc.nextLine();

        if (Integer.parseInt(choice) == 1) {
            System.out.println("Enter your text");
            text = sc.nextLine().trim();
            System.out.println("Enter file name: ");
            fileName = sc.nextLine().trim();
        } else if (Integer.parseInt(choice) == 2) {
            System.out.println("Enter file name: ");
            fileName = sc.nextLine().trim();
        } else {
            System.out.println("Try again");
        }
        sc.close();
    }

    private static String writeData() {
        return new FileWriteService().writeFile(text, fileName);
    }

    private static String readData() {
        return new FileReadService().readFile(fileName);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
