import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double IBMPrice;
    private double applePrice;
    private double googPrice;

    public StockGrabber()
    {
        observers=new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex=observers.indexOf(deleteObserver);
        System.out.println("Observer "+(observerIndex+1)+" Deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers)
        {
            observer.update(IBMPrice, applePrice,googPrice);
        }
    }
    public void setIBMPrice(double newIBMPrice)
    {
        IBMPrice=newIBMPrice;
        notifyObserver();
    }
    public void setApplePrice(double applePrice)
    {
        this.applePrice = applePrice;
        notifyObserver();
    }
    public void setGoogPrice(double googPrice)
    {
        this.googPrice=googPrice;
        notifyObserver();
    }

}
