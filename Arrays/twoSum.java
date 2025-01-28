public class twoSum {
    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;
        boolean result = checkSum(arr, target);
        System.out.println("The Result Is = " + result);
    }

    static boolean checkSum(int[] arr, int tar) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == tar) {
                    return true;
                } 
            }
        }
        return false;
    }
}