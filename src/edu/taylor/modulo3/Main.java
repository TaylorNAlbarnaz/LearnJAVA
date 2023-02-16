package edu.taylor.modulo3;

import java.util.Scanner;

import edu.taylor.modulo3.models.GameManager;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (gameManager.quit == false) {
            System.out.println("Type quit to exit");
            response = scanner.nextLine();

            if (response.equalsIgnoreCase("quit")) {
                gameManager.quit = true;
            }
        }

        scanner.close();
    }
}
