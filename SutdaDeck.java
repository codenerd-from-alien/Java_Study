package pkg_sutda;

public class SutdaDeck {
    final int CARD_NUM =20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck(){
        for(int i =0; i < cards.length;i++){

            if(i == 0 || i == 2 || i ==7){
                cards[i] = new SutdaCard(i +1, true);
            }else{
                cards[i] = new SutdaCard((i %10) + 1, false);
            }
        }
    }

   public void shuffle(){
        int idx = (int) (Math.random() * CARD_NUM) + 1;
        for(int i =0; i < 20;i++){

        }
    }

    SutdaCard pick(){
        int idx = (int) (Math.random() * CARD_NUM);
        return cards[idx];
    }
    SutdaCard pick(int idx){
        return cards[idx];
    }




    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for(int i =0; i <deck.cards.length; i++){
            System.out.println(deck.cards[i] +",");
        }
    }
}
class SutdaCard{
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang ? "K":"");
    }
}
