package Exercise6_21;

public class Exercise6_23 {

    public static int max(int val[]){
        int max =0;


        try{
            if(val.length ==0){
                max = -999999;
            }


            for(int i =0; i < val.length;i++){
                if(val[i] > max){
                    max = val[i];
                }
            }


        }catch (NullPointerException e){
            max = -999999;
        }

        return max;
    }
    public static void main(String[] args) {
        int[] data ={3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값 :"+max(new int[]{})); // 0 최대값 크기가 인 배열
    }

}
