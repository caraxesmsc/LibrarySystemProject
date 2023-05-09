package com.example.libraryproject54fx8may;

import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Login {
    public  void run() {
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("C:\\Users\\mdzhs\\IdeaProjects\\LibraryProject54FX8MAY\\src\\loginDetails.txt"));
            while (scan.hasNextLine()) {
                String user = scan.nextLine();
                String pass = scan.nextLine();
                users.add(user);
                passwords.add(pass);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inpUser = keyboard.nextLine();
        System.out.print("Enter password: ");
        String inpPass = keyboard.nextLine();

        int index = users.indexOf(inpUser);
        if (index != -1 && passwords.get(index).equals(inpPass)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}

