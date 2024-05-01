package exam02;

public class Card {

    private int cardNumber;
    private static int serialNum = 0;

    public Card() {
        serialNum++;
        this.cardNumber = serialNum;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public Card createCard() {

        Card card = new Card();
        return card;
    }

}