package pkg_sutda;
public class Exercise6_20 {

    public static int[] shuffle(int param[]){
        int rand1, rand2;


        for (int i =0 ; i < param.length; i++){
            rand1 = (int) (Math.random()*9);
            rand2 = (int)(Math.random()*9);
            int temp;
            temp = param[rand1];
            param[rand1] = param[rand2];
            param[rand2] = temp;
        }

        return param;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
