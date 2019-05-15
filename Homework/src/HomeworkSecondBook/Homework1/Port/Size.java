package HomeworkSecondBook.Homework1.Port;

public enum Size {
    Ten(10), Twenty(20), Thersty(30);

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
