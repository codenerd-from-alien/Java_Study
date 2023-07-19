package Lamda;

public class Ex14_0 {
    public static void main(String[] args) {
//        Myfunction f =new Myfunction(){
//            public int max(int a, int b){//오버라이딩 규칙 접근제어자 좁게 못바꿈
//                return a> b ? a:b;
//            }
//        };

        //위의 함수를 더 간결하게 만들기 참조변수 타입은 함수형 인터페이스로 한다.
        Myfunction f = (a,b) -> a > b ? a : b;
        int val = f.max(3, 5);
        System.out.println(val);



    }
}

@FunctionalInterface //어노테이션을 붙히면 추상 메서드가 두개 이면 에러줌
interface Myfunction {//함수형 인터페이스 선언
    int max(int a, int b);
}