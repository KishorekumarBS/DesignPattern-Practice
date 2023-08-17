import Creditcards.BronzeCard;
import Creditcards.CreditCards;
import Creditcards.GoldCard;
import Creditcards.SilverCard;
import Offers.GasOfferVisitor;
import Offers.HotelOfferVisitor;
import Offers.OfferVisitor;

public class Main {
    public static void main(String[] args) {
        OfferVisitor hv =new HotelOfferVisitor();
        OfferVisitor gv=new GasOfferVisitor();
        CreditCards bz=new BronzeCard();
        CreditCards sc=new SilverCard();
        CreditCards gl=new GoldCard();

        bz.accept(gv);
        sc.accept(hv);
        gl.accept(gv);

    }
}