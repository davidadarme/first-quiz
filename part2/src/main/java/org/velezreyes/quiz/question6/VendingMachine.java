package org.velezreyes.quiz.question6;

import java.util.Map;

public interface VendingMachine {

    void insertCoin(int coin);
    int getBalance();
    void selectItem(String item);
    Map<String, Integer> getItems();
    Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException;
    void insertQuarter();
}
