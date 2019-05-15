package HomeworkSecondBook.Homework1.Test;

public enum Size {
    Ten(100), Twenty(200), Thersty(300);

    Size(int id) {
        this.id = id;
    }

    private int id;

    public int getValue() {
        return id;
    }

    public static String getClassName() {
        return HomeworkSecondBook.Homework1.test2.Size.class.getName();
    }
}
