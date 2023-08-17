public class GrabStocks {
    public static void main(String args[])
    {
        StockGrabber stoc =new StockGrabber();
        StockObserver observer1= new StockObserver(stoc);
        stoc.setApplePrice(150);
        stoc.setGoogPrice(160);
        stoc.setIBMPrice(200);

        StockObserver o2=new StockObserver(stoc);

        stoc.unregister(observer1);
        stoc.setApplePrice(123);
        stoc.setGoogPrice(142);
        stoc.setIBMPrice(264);


    }
}
