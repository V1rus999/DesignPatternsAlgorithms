package main.cracking_coding_iv;

import java.util.*;

/**
 * Created by johannesC on 2019/02/26.
 */
public class Maps {

    private static Map<String, Double> products = new HashMap<>();

    public static void main(String[] args) {
        products.put("Rice", 6.9);
        products.put("Flour", 3.9);
        products.put("Sugar", 4.9);
        products.put("Milk", 3.9);
        products.put("Egg", 1.9);
        products.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("=======");

        Map<String, Double> shoppingCart = new HashMap<>();
        addToShoppingCart("Egg", shoppingCart);
        addToShoppingCart("Egg", shoppingCart);
        addToShoppingCart("Milk", shoppingCart);
        shoppingCart.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("=======");

        Map<String, Double> shoppingCart1 = new HashMap<>();
        addToShoppingCart("Egg", shoppingCart1);
        addToShoppingCart("Milk", shoppingCart1);
        addToShoppingCart("Sugar", shoppingCart1);

        Map<String, Double> shoppingCart2 = new HashMap<>();
        addToShoppingCart("Egg", shoppingCart2);
        addToShoppingCart("Milk", shoppingCart2);

        Map<String, Double> shoppingCart3 = new HashMap<>();
        addToShoppingCart("Egg", shoppingCart3);
        addToShoppingCart("Milk", shoppingCart3);
        addToShoppingCart("Flour", shoppingCart3);

        System.out.println("=======");
        Map<String, Double> multiParameterMerge = mergeMapsOnKey(Arrays.asList("Egg", "Milk"), shoppingCart1, shoppingCart2, shoppingCart3);
        multiParameterMerge.forEach((key, value) -> System.out.println(key + " " + String.format("%.2f", value)));
    }

    @SafeVarargs
    private static Map<String, Double> mergeMapsOnKey(List keys, Map<? extends String, ? extends Double>... maps) {
        Map<String, Double> finalMap = new HashMap<>();
        for (Map<? extends String, ? extends Double> map : maps) {
            map.keySet().forEach((key) -> {
                if (keys.contains(key)) {
                    addValuesToMap(key, map.get(key), finalMap);
                }
            });
        }
        return finalMap;
    }

    private static void addValuesToMap(String key, Double value, Map<String, Double> map) {
        map.merge(key, value, (oldValue, newValue) -> oldValue += value);
    }

    private static void addToShoppingCart(String product, Map<String, Double> shoppingCart) {
        shoppingCart.compute(product, (key, value) -> {
            if (value != null) {
                value += products.get(product);
            } else {
                value = products.get(product);
            }
            return value;
        });
    }
}
