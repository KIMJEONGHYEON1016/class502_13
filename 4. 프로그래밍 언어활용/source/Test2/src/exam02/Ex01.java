package exam02;

public class Ex01 {
    public Card createCard() {

        Card card = new Card();
        return card;
    }
    public static void main(String[] args) {

        Card card = new Card();

        Card ACard = card.createCard();
        Card BCard = card.createCard();
        Card CCard = card.createCard();
        Card DCard = card.createCard();

        System.out.println(ACard.getCardNumber());
        System.out.println(BCard.getCardNumber());
        System.out.println(CCard.getCardNumber());
        System.out.println(DCard.getCardNumber());
    }
}