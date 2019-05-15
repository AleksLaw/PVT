package HomeworkSecondBook.Homework1.test2;

public class Client {
    private int count;
    private Size clientSize;


    public Client(Size size) {
        this.clientSize = size;

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



    public Size getSize() {
        return clientSize;
    }
}
