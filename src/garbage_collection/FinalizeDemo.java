package src.garbage_collection;

class Label {
}

class PlasticBottle {
    int bottleNo;

    public PlasticBottle(int bottleNo) {
        this.bottleNo = bottleNo;
    }

    @Override
    public void finalize() {
        System.out.println("Thank you for choosing to recycle " + this.hashCode());
    }
}

public class FinalizeDemo {
    public static void main(String[] args) {
        PlasticBottle bottle1 = new PlasticBottle(1);
        PlasticBottle bottle2 = new PlasticBottle(2);

        bottle1 = null;
        bottle2 = null;

        System.gc();
    }
}
