package org.velezreyes.quiz.question6;

import java.util.Map;
import java.util.HashMap;

public class VendingMachineImpl implements VendingMachine {
    private int balance;

    public VendingMachineImpl() {
        this.balance = 0;
    }

    public static VendingMachine getInstance() {
        return new VendingMachineImpl();
    }

    @Override
    public void insertCoin(int coin) {
        if (coin == 1 || coin == 5) {
            balance += coin;
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void selectItem(String item) {
        Map<String, Integer> itemPrices = new HashMap<>();
        itemPrices.put("item1", 10);
        itemPrices.put("item2", 5);

        if (itemPrices.containsKey(item) && balance >= itemPrices.get(item)) {
            balance -= itemPrices.get(item);
        }
    }

    @Override
    public Map<String, Integer> getItems() {
        Map<String, Integer> itemPrices = new HashMap<>();
        itemPrices.put("item1", 10);
        itemPrices.put("item2", 5);

        return itemPrices;
    }

    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        // Implement this method according to your business logic.
        // Check the user's balance, handle NotEnoughMoneyException, and return a Drink.
        // You may need to add a Drink class and create a Drink object to return.
        // Handle UnknownDrinkException if necessary.
        // Remove the throw statement.
        
        throw new UnsupportedOperationException("Unimplemented method 'pressButton'");
    }

    @Override
    public void insertQuarter() {
        // Implement this method to allow users to insert a quarter.
        // Update the balance accordingly.
        // Remove the throw statement.
        balance += 25;
    }
}
