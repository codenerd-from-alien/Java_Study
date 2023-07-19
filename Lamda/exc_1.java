package Lamda;


interface Calculation{
    int sum(int x, int y);
}
/*********************************************/
//솔루션
interface SumCalculator{
    int sol_sum(int a, int b);
}
public class exc_1 {
    public static void main(String[] args) {
        Calculation sumation = (x, y) -> {
            return x+y;
        };
        System.out.println(sumation.sum(1,2));

        //******************************************
        SumCalculator sumCalculator = (x,y) -> x+y;
        int result = sumCalculator.sol_sum(7,6);
        System.out.println("정답 : " + result);


    }
}
