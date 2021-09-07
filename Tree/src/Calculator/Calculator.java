package Calculator;
public class Calculator{
    public int  sumDigits(int n1){
        if(n1/10 == 0){
            return n1%10;
        }
        return n1%10 + sumDigits(n1/10);
    }
    public boolean prime(int n1,int pivot){
        if(pivot%n1==0 && n1!=pivot &&n1!=1){
            return false;
        }
        else if (n1 == 1){
            return true;
        }
        return prime(n1-1,pivot);
    }
    private int binarySearch(int[] arr, int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    public boolean contains(int item, int[] arr) {
        return binarySearch(arr, item) != -1;
    }
    public int timesRepeated(int n, int[] arr){
        int total= 0;
        if(contains(n,arr)){
            for(int i =0 ; i<arr.length;i++){
                if(n==arr[i]){
                    total ++;
                }
            }
        }
        return total;
    }

}