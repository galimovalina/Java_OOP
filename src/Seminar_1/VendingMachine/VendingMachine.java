package Seminar_1.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}



