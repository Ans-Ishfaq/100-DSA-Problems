import java.util.ArrayList;

public class Duplicates {
 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 3, 6, 1};
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j] && !duplicates.contains(arr[i]))
                {
                    duplicates.add(arr[i]);
                }
            }
        }
        System.out.println(duplicates);
    }
}
