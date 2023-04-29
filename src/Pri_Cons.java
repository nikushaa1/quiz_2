import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pri_Cons {

    private Pri_Cons(){}
    public static int[] Reader(){
        int[] arra = new int[10];
        try {
            File file_1 = new File("file1.txt");
            Scanner scanner = new Scanner(file_1);
            for (int i = 0; i < 10; i++) {
                arra[i] = scanner.nextInt();
            }
            scanner.close();
        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("Something get wrong" + e.getMessage());
        }
        return arra;
    }
    public static int SumArr(int[] array){
        int sum = 0;
        for(int i =0; i< array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
