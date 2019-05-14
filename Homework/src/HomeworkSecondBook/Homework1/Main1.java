package HomeworkSecondBook.Homework1;

import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {
        System.out.println();
         class Product {
             HashMap product;

            public HashMap Product() {
                HashMap productAll = new HashMap();
                int a = (int) (Math.random() * 3 + 1);

                System.out.println(a);
                if (a == 1) {
                    int b = (int) (Math.random() * 3 + 1);
                    int s = (int) (Math.random() * 10 + 1);
                    if (a == 1) {
                        product.put("Хлеб", s);
                    }
                    if (a == 2) {
                        product.put("Масло", s);
                    }
                    if (a == 3) {
                        product.put("Молоко", s);
                    }
                }
                if (a == 2) {
                    int b = (int) (Math.random() * 3 + 1);
                    if (a == 1) {
                        product.put("Хлеб", ((int) (Math.random() * 10 + 1)));
                        product.put("Молоко", ((int) (Math.random() * 10 + 1)));
                    }
                    if (a == 2) {
                        product.put("Хлеб", ((int) (Math.random() * 10 + 1)));
                        product.put("Масло", ((int) (Math.random() * 10 + 1)));
                    }
                    if (a == 3) {
                        product.put("Масло", ((int) (Math.random() * 10 + 1)));
                        product.put("Молоко", ((int) (Math.random() * 10 + 1)));
                    }
                }
                if (a == 3) {
                    product.put("Масло", ((int) (Math.random() * 3 + 1)));
                    product.put("Молоко", ((int) (Math.random() * 3 + 1)));
                    product.put("Хлеб", ((int) (Math.random() * 3 + 1)));
                }
                return product;
            }

        }
        Product p1 = new Product();
        System.out.println(p1.product.entrySet().toString());
    }

}
