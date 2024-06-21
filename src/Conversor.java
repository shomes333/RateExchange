package com.conversor;

import org.json.simple.JSONObject;

public class Conversor {
    private com.conversor.ClientApi clientApi;
    private JSONObject ratesChange;

    public Conversor() {
        clientApi = new com.conversor.ClientApi();
        try {
            ratesChange = clientApi.getRatesChange();
        } catch (Exception e) {
            System.err.println("Error getting exchange rates:" + e.getMessage());
        }
    }

    public void showMenu() {

        System.out.println("\n1. Dollars to Argentine Pesos");
        System.out.println("2. Argentine Pesos to Dollars");
        System.out.println("3. Euros to Dollars");
        System.out.println("4. Dollars to Euros");
        System.out.println("5. Reals to Dollars");
        System.out.println("6. Dollars to Reals");
        System.out.println("7. Quit");
    }

    public void convert(int option, double amount) {
        double result = 0;
        JSONObject conversionRates = (JSONObject) ratesChange.get("conversion_rates");
        switch (option) {
            case 1:
                result = amount * ((Number) conversionRates.get("ARS")).doubleValue(); // Convert ARS to USD
                System.out.printf("\n %.2f USD are %.2f ARS%n", amount, result);
                break;
            case 2:
                result = amount / ((Number) conversionRates.get("ARS")).doubleValue(); // Convert USD to ARS
                System.out.printf("\n %.2f ARS are %.2f USD%n", amount, result);
                break;
            case 3:
                result = amount / ((Number) conversionRates.get("EUR")).doubleValue(); // Convert EUR to USD
                System.out.printf("\n %.2f EUR are %.2f USD%n", amount, result);
                break;
            case 4:
                result = amount * ((Number) conversionRates.get("EUR")).doubleValue(); // Convert USD to EUR
                System.out.printf("\n %.2f USD are %.2f EUR%n", amount, result);
                break;
            case 5:
                result = amount * ((Number) conversionRates.get("BRL")).doubleValue(); // Convert BRL to USD
                System.out.printf("\n %.2f USD are %.2f BRL%n", amount, result);
                break;
            case 6:
                result = amount / ((Number) conversionRates.get("BRL")).doubleValue(); // Convert USD to BRL
                System.out.printf("\n %.2f BRL are %.2f USD%n", amount, result);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}