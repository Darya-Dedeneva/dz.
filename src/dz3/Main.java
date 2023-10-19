package dz3;

public class Main {


    private static int pos;
    private static int neg;
    private static int zero;
    private static Object sumPos;
    private static Object sumNeg;
    private static int avg;

    public static void main(String[] args) {

        int[] arr = new int[50];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 - 50); // внести в массив из 50 элементов рандомные числа
            // отрицательные и положительные
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int pos = 0;
        int neg = 0;
        int zero = 0;
        int sumPos = 0;
        int sumNeg = 0;
        int avg =0; // среднее значение

        for (int i: arr){
            if (i>0){
                pos++;

            }else if (i<0){
                neg++;

            } else {
                zero++;

            } if (i>0){
                pos++;
                sumPos=sumPos + i;
            } else if(i<0){
                neg++;
                sumNeg=sumNeg + i;
            }
            avg = (sumNeg + sumPos)/50; //среднее значение

        } System.out.println("----------------");
        System.out.println("+:"+pos);
        System.out.println("-:"+neg);
        System.out.println("0:"+zero);
        System.out.println("SumPos:"+sumPos);
        System.out.println("Sumneg:"+sumNeg);
        System.out.println("avg:"+avg);

    }
}