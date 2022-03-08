package src.garbage_collection;

class Train {
    int trainNo;

    public Train(int trainNo) {
        this.trainNo = trainNo;
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        Train train1 = new Train(24152);
        Train train2 = new Train(75632);

        train1 = null;

        System.gc();
    }
}
