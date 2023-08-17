package Offers;

import Creditcards.BronzeCard;
import Creditcards.GoldCard;
import Creditcards.SilverCard;

public class GasOfferVisitor implements OfferVisitor{

    @Override
    public void visitBronzeCreditCard(BronzeCard b) {
        System.out.println("Computing Gas offer for Bronze Card.");
    }

    @Override
    public void visitSilverCreditCard(SilverCard s) {
        System.out.println("Computing Gas offer for Silver Card.");
    }

    @Override
    public void visitGoldCreditCard(GoldCard g) {
        System.out.println("Computing Gas offer for Gold Card.");
    }
}
