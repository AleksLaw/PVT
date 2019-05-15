package HomeworkSecondBook.Homework1.Test;

public class Client {
    private int count;
    private Size clientSize;
    private Type clientType;

    public Client(Size size, Type type) {
        this.clientSize = size;
        this.clientType = type;
    }

    public void add(int count) {
        this.count += count;
    }

    public boolean countCheck() {
        if (count >= clientSize.getValue()) {
            return false;
        }
        return true;
    }

    public int getCount() {
        return count;
    }

    public Type getType() {
        return clientType;
    }

    public Size getSize() {
        return clientSize;
    }
}
