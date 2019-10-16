public class Menu {
    public static void main(String[] args) {
        CardCatalog catl = new CardCatalog();

        //first card
        Card card1 = new Card("xyz", "ravi", "Ic Engines");
        catl.addACard(card1);
        
        //second card
        Card card2 = new Card("pqr", "teja", "Java Mava");
        catl.addACard(card2);

        Card card3 = new Card("abc", "suresh", "random shift");
        catl.addACard(card3);

        Card card4 = new Card("ghi", "ravi dddf", "random shift");
        catl.addACard(card4);

        catl.printTheCatalog("title");

        catl.removeATitle("pqr");
        System.out.println("After removal");
        catl.printTheCatalog("title");

    }
}
