

/*public class Demo074 {
    public static void main(String[] args) {
        int arr[] = {5,3,1,2};
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                   
                   }

                   for( int r : arr)
                   System.out.print(r);
                

                }
            }
        }
    }*/

class Demo074{
    public static void main(String[] args){
        int[] arr = {5,3,1,2};
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    arr[i] = arr[i]+arr[j];
                    arr[j] = arr[i]-arr[j];
                    arr[i] = arr[i]-arr[j];
                }
            }
        }
        for(int r : arr)
        System.out.print(r);
    }
}


