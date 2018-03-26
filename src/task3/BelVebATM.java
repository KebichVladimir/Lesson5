package task3;

public class BelVebATM extends ATM implements InfoATM {

    @Override
    public void getName() {
        System.out.println("Банкомат «Белвнешэкономбанк»");
    }

    @Override
    public void getFabricator() {
        System.out.println("Made in Germany «Wincor Nixdorf AG»");
    }
}