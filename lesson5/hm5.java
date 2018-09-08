package java2.hm2_5;

public class hm5 {

    static final int size = 10000000;
    static final int h = size / 2;

    public static float[] firstMethod(){
        float[] arr = new float[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=1;
        }
        long a = System.currentTimeMillis();
        for(int i=0;i<arr.length;i++){
            arr[i]=(float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения метода №1: "+(System.currentTimeMillis() - a));

        return arr;
    }

    public static float[] secondMethod(){
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        for(int i=0;i<arr.length;i++){
            arr[i]=1;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread th1 = new Thread(()->calcArray(a1));
        th1.start();

        Thread th2 = new Thread(()->calcArray(a2));
        th2.start();

        try {
            th1.join();
            th2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Время выполнения метода №2: "+(System.currentTimeMillis() - a));

        return arr;
    }

    public static void calcArray(float a[]){
        for(int i=0;i<a.length;i++){
            a[i]=(float)(a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

    }

    public static void main(String[] args){

        float[] arr1=firstMethod();
        float[] arr2=secondMethod();
    }
}
