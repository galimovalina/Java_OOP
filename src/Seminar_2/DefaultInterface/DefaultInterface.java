package Seminar_2.DefaultInterface;

public interface DefaultInterface {
    void printBankAccount();
    default void getUserName(){
        System.out.println("default behavior");
    }
}
