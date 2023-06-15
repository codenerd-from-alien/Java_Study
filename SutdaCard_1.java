public class SutdaCard_1 {
    public static void main(String[] args) {
        SutdaCard_2  card1 = new SutdaCard_2(3, false);
        SutdaCard_2  card2 = new SutdaCard_2();
        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
class SutdaCard_2{
    private int num;
    private boolean isKawng = false;

    SutdaCard_2(){
//기본 생성자 생성
    }
    SutdaCard_2(int num, boolean isKawng){//매개 변수 생성자
        this.num = num;
        this.isKawng = isKawng;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isKawng() {
        return isKawng;
    }

    public String print_K1(){
        return"1K";
    }
    public void setKawng(boolean kawng) {
        isKawng = kawng;
    }

    public String info(){
        if( num >1 && num<10 ){
            return String.valueOf(num);
        }else{
            return print_K1();
        }

    }


}