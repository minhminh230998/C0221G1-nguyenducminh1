package controller;

import java.util.Scanner;

public class MainController {
    static Scanner sc=new Scanner(System.in);
    public static void displayMainMenu() {
        while (true) {
            System.out.println("1.\t Add New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            String input=sc.nextLine();
            switch (input){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                default:
                    System.out.println("Nhap lai");
            }

        }
    }
    public static void addNewServies()  {
        while (true) {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            String input=sc.nextLine();
            switch (input){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                default:
                    System.out.println("Nhap lai");
            }
        }

    }
    public static void showServices()  {
        while (true) {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            String input=sc.nextLine();
            switch (input){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                default:
                    System.out.println("Nhap lai");
            }

        }
    }



}
