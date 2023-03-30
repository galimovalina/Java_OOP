package Seminar_1.VendingMachine;

import java.util.List;

public class WaterMachine implements VendingMachine {
    private final List<Product> products;

    public WaterMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public waterBottle getProduct(String name, int volume){
        for(Product product: products){
            if(product instanceof waterBottle){
                if(product.getName().equalsIgnoreCase(name) && ((waterBottle) product).getVolume() == volume){
                    return (waterBottle) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
}
