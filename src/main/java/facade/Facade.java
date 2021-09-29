package facade;
import java.util.Scanner;

import java.util.List;

public class Facade {
    // This class only has the skeleton of the methods used by the test.
    // You must fill in this class with your own code. You can (and should) create more classes
    // that implement the functionalities listed in the Facade and in the Test Cases.

    public Facade(){
    }
    public static void displayMainMenu()
    {
        System.out.println("Main Menu: Please choose among the options below.");
        System.out.println();
        System.out.println("0. Close system. \n1. Open Item options.\n2. Open Review options.\n3. Open Transaction History options.");
        System.out.println("Type an option number:");
    }

    public static void displayItemsMenu()
    {
        System.out.println("Item options menu:");
        System.out.println("0. Return to Main Menu.\n1. Create an Item.\n2. Remove an Item.\n3. Print all registered Items.\n4. Buy an Item.\n5. Update an item’s name.\n6. Update an item’s price.");
        System.out.println("Type an option number:");
    }
    public static void displayReviewMenu()
    {
        System.out.println("Review options menu:");
        System.out.println("\n0. Return to Main Menu.\n1. Create a review for an Item.\n2. Print a specific review of an Item.\n3. Print all reviews of an Item.\n4. Print mean grade of an Item\n5. Print all comments of an Item.");
        System.out.println("6. Print all registered reviews.\n7. Print item(s) with most reviews.\n8. Print item(s) with least reviews.\n9. Print item(s) with best mean review grade.\n10. Print item(s) with worst mean review grade.");
        System.out.println("Type an option number:");
    }

    public static void displayTransactionsMenu()
    {
        System.out.println("Transaction History options menu:");
        System.out.println("0. Return to Main Menu.\n1. Print total profit from all item purchases\n2. Print total units sold from all item purchases\n3. Print the total number of item transactions made.\n4. Print all transactions made.");
        System.out.println("5. Print the total profit of a specific item.\n6. Print the number of units sold of a specific item.\n7. Print all transactions of a specific item.\n8. Print item with highest profit.");
        System.out.println("Type an option number:");
    }

    public static int getUserInput()
    {
        Scanner input = new Scanner(System.in);
        int userInput;
        userInput = input.nextInt();
        input.close();
        return userInput;
    }

    public static void itemsMenu()
    {
        displayItemsMenu();
        int choice = getUserInput();
    }

    public static void reviewMenu()
    {
        displayReviewMenu();
        int choice = getUserInput();
    }

    public static void transactionMenu()
    {
        displayTransactionsMenu();
        int choice = getUserInput();
    }

    public static void mainMenu()
    {
        displayMainMenu();
        int choice = getUserInput();
    do {
        switch (choice){
            case 1:
            {
                itemsMenu();
                break;
            }
            case 2:
            {
                reviewMenu();
                break;
            }
            case 3:
            {
                transactionMenu();
                break;
            }
            default:
            {
                System.out.println("Invalid menu option. Please type another option");
                break;
            }
        }
    }
    while(choice !=0);

    }


    public String createItem(String itemID, String itemName, double unitPrice){return "";}

    public String printItem(String itemID) {
        return "";
    }

    public String removeItem(String itemID) {
        return "";
    }

    public boolean containsItem(String itemID) {
        return false;
    }

    public double buyItem(String itemID, int amount) {
        return 0.0;
    }

    public String reviewItem(String itemID, String reviewComment, int reviewGrade) {
        return "";
    }

    public String reviewItem(String itemID, int reviewGrade) {
        return "";
    }

    public String getItemCommentsPrinted(String itemID) {
        return "";
    }

    public List<String> getItemComments(String itemID) {
        return null;
    }

    public double getItemMeanGrade(String itemID) {
        return -1.0;
    }

    public int getNumberOfReviews(String itemID) {
        return -1;
    }

    public String getPrintedItemReview(String itemID, int reviewNumber) {
        return "";
    }

    public String getPrintedReviews(String itemID) {
        return "";
    }

    public String printMostReviewedItems() {
        return "";
    }

    public List<String> getMostReviewedItems() {
        return null;
    }

    public List<String> getLeastReviewedItems() {
        return null;
    }

    public String printLeastReviewedItems() {
        return "";
    }

    public double getTotalProfit() {
        return -1.0;
    }

    public String printItemTransactions(String itemID) {
        return "";
    }

    public int getTotalUnitsSold() {
        return -1;
    }

    public int getTotalTransactions() {
        return -1;
    }

    public double getProfit(String itemID) {
        return -1.0;
    }

    public int getUnitsSolds(String itemID) {
        return -1;
    }

    public String printAllTransactions() {
        return "";
    }

    public String printWorseReviewedItems() {
        return "";
    }

    public String printBestReviewedItems() {
        return "";
    }

    public List<String> getWorseReviewedItems() {
        return null;
    }

    public List<String> getBestReviewedItems() {
        return null;
    }

    public String printAllReviews() {
        return "";
    }

    public String updateItemName(String itemID, String newName) {
        return "";
    }

    public String updateItemPrice(String itemID, double newPrice) {
        return "";
    }

    public String printAllItems() {
        return "";
    }

    public String printMostProfitableItems() {
        return "";
    }
}