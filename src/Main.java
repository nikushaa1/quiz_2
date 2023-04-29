public class Main {
    public static void main(String[] args) {
        int[] arra = Pri_Cons.Reader();
        System.out.println("Elements:");
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + " ");
        }
        System.out.println("\n");
        int[] arr = {8, 7, 27, 5, 1};

        int sum = Pri_Cons.SumArr(arr);
        System.out.println("Sum: " + sum);



    }
}

