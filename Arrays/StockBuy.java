public class StockBuy {
    
    public static void main(String[] args) {
        int[] arr = {7, 10, 1, 3, 6, 9, 2};
        System.out.println("Max Profit Is");
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]>max)
                {
                    max=arr[j]-arr[i];
                }
     
            }
        }
        System.out.println(max);
        
    }
}
