package Seminar_1.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products=new ArrayList<>();

    public void addProduct(Product item){
        products.add(item);
    }

    public Product getProductByName(String serchName) {
        for (Product item: products)
            if(item.getName().equals(serchName))
                return item;
        return null;
    }

    public Product gerProductBycost(Double searchCost){
        for (Product item: products){
            if (item.getCost().equals(searchCost)){
                return item;
            }
        }
        return null;
    }


}
