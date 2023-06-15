public class ex {
    public static void main(String[] args) {

        AppleStore appleStore = new AppleStore();

        Runnable task = () -> {
            while (appleStore.getStoreApple() > 0){
                appleStore.eatApple();
                System.out.println("남은 사과의 수 =" + appleStore.getStoreApple());
            }
        };
        for (int i =0; i <3; i++){
            new Thread(task).start();
        }
    }
}
class AppleStore{
    private int storeApple =10;
    public int getStoreApple(){
        return storeApple;
    }
    public void eatApple(){
        synchronized (this){
            if(storeApple > 0){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                storeApple -=1;
            }
        }
    }
}