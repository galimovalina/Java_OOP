package Seminar_1.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine implements Machine {
    private List<Product> products=new ArrayList<>();

    public void addProduct(Product item){
        products.add(item);
    }


    @Override
    public Product getProductByName(String serchName) {
        for (Product item: products)
            if(item.getName().equals(serchName))
                return item;
        return null;
    }
//    public Product getProductByName(String serchName, int volume){
//        for (Product item: products)
//            if((item.getName().equals(serchName))&&((waterBottle)(item).getVolume().equals(volume)))
//                return item;
//        return null;
//    }

    @Override
    public Product gerProductBycost(Double searchCost){
        for (Product item: products){
            if (item.getCost().equals(searchCost)){
                return item;
            }
        }
        return null;
    }


}
