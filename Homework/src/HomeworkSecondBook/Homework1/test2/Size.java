package HomeworkSecondBook.Homework1.test2;

public enum Size {
    o50(50), o100(100), o150(150);

    Size(int id) {
        this.id = id;
    }

    private int id;

    public int getValue() {
        return id;
    }

    public static String getClassName() {
        return Size.class.getName();
    }
}
