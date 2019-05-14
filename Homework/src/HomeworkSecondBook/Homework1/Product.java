package HomeworkSecondBook.Homework1;

import java.util.HashMap;

public class Product {
    private HashMap product;



    public HashMap Product() {
        HashMap productAll = new HashMap();
        int a = (int) (Math.random() * 3 + 1);

        System.out.println(a);
        if (a == 1) {
            int b = (int) (Math.random() * 3 + 1);
            int s = (int) (Math.random() * 10 + 1);
            if (a == 1) {
                productAll.put("Хлеб", s);
            }
            if (a == 2) {
                productAll.put("Масло", s);
            }
            if (a == 3) {
                productAll.put("Молоко", s);
            }
        }
        if (a == 2) {
            int b = (int) (Math.random() * 3 + 1);
            if (a == 1) {
                productAll.put("Хлеб", ((int) (Math.random() * 10 + 1)));
                productAll.put("Молоко", ((int) (Math.random() * 10 + 1)));
            }
            if (a == 2) {
                productAll.put("Хлеб", ((int) (Math.random() * 10 + 1)));
                productAll.put("Масло", ((int) (Math.random() * 10 + 1)));
            }
            if (a == 3) {
                productAll.put("Масло", ((int) (Math.random() * 10 + 1)));
                productAll.put("Молоко", ((int) (Math.random() * 10 + 1)));
            }
        }
        if (a == 3) {


            productAll.put("Масло", ((int) (Math.random() * 3 + 1)));
            productAll.put("Молоко", ((int) (Math.random() * 3 + 1)));
            productAll.put("Хлеб", ((int) (Math.random() * 3 + 1)));

        }return productAll;
    }

}
