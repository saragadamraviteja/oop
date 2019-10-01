public final class CardCatalog{
       int number;
       Card[] cards = new Card [10];
       int cardCount = 0;
       
       public void addACard(final Card card) {
           cards[cardCount++] = card;
       } 

       public Card getATitle(final String title) {
           for(int i = 0; i < cardCount; i++) {
               if (title.equals(cards[i].getTitle())) {
                   return cards[i];
               }
           }
       }
        public Card getAnAuthor(final String author) {
            int count = 0;
            for (int i =0; i < cardCount; i++) {
                if (author.equals(cards[i].getAuthor())) {
                    count++;
                }
            }
            Card[] tempAuthor = new Card[count];
            int z = 0;
            for (int i = 0; i < cardCount; i++) {
                if (author.equals(cards[i].getAuthor())) {
                    tempAuthor[z] = cards[i];
                    z = z+1;
                }
            }
            return tempAuthor;
        }
        public Card getSubject(final String subject) {
            int count1 = 0;
            for (int = 0; i < cardCount; i++) {
                if (subject.equals(cards[i].getSubject())) {
                    count1 ++;
                }
            }
            Card[] tempSubject = new Card[count1];
            int y = 0;
            for(int i = 0; i < cardCount; i++) {
                if(subject.equals(cards[i].getSubject())) {
                    tempSubject[y] = cards[i];
                    y = y + 1;
                }
            }
            return tempSubject;
        }
        public void removeATitle(String title) {
            for(int i = 0; i < cardCount; i++) {
                if(title.equals(cards[i].getTitle())) {
                    for (int k = i; k < cardCount - 1; k++) {
                        
                        cards[k] = cards[k + 1];
                    }
                    cards[cardCount - 1] = null;
                    cardCount--;
                }
            }

        } 
    }
}