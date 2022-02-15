public class UPIPaymentApps implements Cloneable {
    String name;
    String country;
    int dailyLimit;
    double maxDailyAmount;
    // Address headOfficeLocation;

    public UPIPaymentApps() {
    }

    public UPIPaymentApps(String name, String country, int dailyLimit, double maxDailyAmount) {
        this.name = name;
        this.country = country;
        this.dailyLimit = dailyLimit;
        this.maxDailyAmount = maxDailyAmount;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        return "UPIPaymentApps [country=" + country + ", dailyLimit=" + dailyLimit + ", maxDailyAmount="
                + maxDailyAmount + ", name=" + name + "]";
    }
}

class UPIDriver {
    public static void main(String[] args) throws Exception {
        UPIPaymentApps bhim = new UPIPaymentApps("BHIM", "India", 10, 100000);
        System.out.println(bhim);

        // not a copy, but an impostor
        UPIPaymentApps phonePe = bhim;
        phonePe.name = "PhonePe";

        // shallow copy
        UPIPaymentApps gPay = (UPIPaymentApps) bhim.clone();
        gPay.name = "GPay";

        System.out.println(phonePe);
        System.out.println(gPay);
        System.out.println(bhim);
    }
}
