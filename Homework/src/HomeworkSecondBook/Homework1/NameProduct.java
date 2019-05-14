package HomeworkSecondBook.Homework1;

public enum NameProduct {
    MILK ("Молоко"),
    BREAD ("Хлеб"),
    OIL ("Масло");
     String nameProduct;

    NameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return nameProduct;
    }
}
