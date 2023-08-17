public class StockObserver implements Observer{

    private double ibmPrice;
    private double applePrice;
    private double googPrice;

    private static int observerIDTracker=0;
    private int observerID;
    private StockGrabber stockGrabbe;
    public StockObserver(StockGrabber stockGrabber)
    {
        this.stockGrabbe=stockGrabber;
        this.observerID=++observerIDTracker;
        System.out.println("New Observer "+this.observerID);
        stockGrabber.register(this);
    }
    @Override
    public void update(double ibmPrice, double applePrice, double googPrice) {
        this.applePrice=applePrice;
        this.googPrice=googPrice;
        this.ibmPrice=ibmPrice;
        printThePrice();
    }
    public void printThePrice(){
        System.out.println(observerID+"\nIBM: " +ibmPrice+ "\nGoogle: "+googPrice+"\nApple: "+applePrice);
    }
}
