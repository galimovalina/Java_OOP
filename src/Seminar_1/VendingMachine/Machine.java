package Seminar_1.VendingMachine;

public interface Machine {
    Product getProductByName(String serchName);
    Product gerProductBycost(Double searchCost);
}
