package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {
    private int quarters = 0;

    // Implementación del método para insertar un cuarto
    @Override
    public void insertQuarter() {
        quarters++;
    }

    // Implementación del método para presionar un botón y obtener una bebida
    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        if ("ScottCola".equals(name) && quarters < 3) {
            throw new NotEnoughMoneyException();
        } else if ("KarenTea".equals(name) && quarters < 4) {
            throw new NotEnoughMoneyException();
        }

        // Resetear los cuartos después de comprar una bebida
        quarters = 0;

        if ("ScottCola".equals(name)) {
            return new ScottCola();
        } else if ("KarenTea".equals(name)) {
            return new KarenTea();
        } else {
            throw new UnknownDrinkException();
        }
    }

    // Implementación del método para crear una instancia de VendingMachine
    public static VendingMachine getInstance() {
        return new VendingMachineImpl();
    }

    // Clase interna que representa la bebida ScottCola
    private class ScottCola implements Drink {
        @Override
        public String getName() {
            return "ScottCola";
        }

        @Override
        public boolean isFizzy() {
            return true;
        }
    }

    // Clase interna que representa la bebida KarenTea
    private class KarenTea implements Drink {
        @Override
        public String getName() {
            return "KarenTea";
        }

        @Override
        public boolean isFizzy() {
            return false;
        }
    }
}
