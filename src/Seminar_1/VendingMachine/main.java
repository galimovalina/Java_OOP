package Seminar_1.VendingMachine;

public class main {
    public static void main(String[] args) {
        VendingMachine machine=new VendingMachine();
        machine.addProduct(new Product("шоколадка", 40.50));;
        machine.addProduct(new Product("вода", 65.99));
        machine.addProduct(new Product("чипсы", 100.20));
        machine.addProduct(new Product("газировка", 70.60));
        machine.addProduct(new Product("конфета", 20.35));

        System.out.println(machine.getProductByName("чипсы"));
        System.out.println(machine.gerProductBycost(20.35));

    }
}
