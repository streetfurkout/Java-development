package com.pluralsight;

public class SearchInventoryMap {

    private Map<String, Product> inventoryMap = new HashMap<>();

    public static void main(String[] args) {
        SearchInventoryMap app = new SearchInventoryMap();
        app.loadInventory();

        Scanner scanner = new Scanner(System.in);
        String searchAgain;
    }
}