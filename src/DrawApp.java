import java.util.Scanner;

public class DrawApp {
    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.printf("Menu: \n " +
                    "1. Draw the triangle \n " +
                    "2. Draw the square \n " +
                    "3. Draw the rectangle \n " +
                    "4. Exit \n" +
                    "Enter your choice:");
            choice = scanner.nextInt();
            DrawApp.draw(choice);
        } while (choice != 4);
    }

    private static void draw(int choice) {
        switch (choice) {
            case 1:
                DrawApp.drawTriangle();
                break;
            case 2:
                DrawApp.drawSquare();
                break;
            case 3:
                DrawApp.drawRectangle();
                break;
        }
    }

    private static void drawTriangle() {
        int row = 5;
        int column = 5;
        String result = "";
        for (int i=0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result += "*";
            }
            result += "\n";
            column -= 1;
        }
        System.out.printf(result);
    }

    private static void drawSquare(){
        int size = 5;
        String result = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result += "*";
            }
            result += "\n";
        }
        System.out.printf(result);
    }

    private static void drawRectangle() {
        int height = 3;
        int width = 5;
        String result = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result += "*";
            }
            result += "\n";
        }
        System.out.printf(result);
    }
}
