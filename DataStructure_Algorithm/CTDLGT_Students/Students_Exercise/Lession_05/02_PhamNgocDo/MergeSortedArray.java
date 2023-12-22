public class MergeSortedArray {
   public static void mergeS(int arr[], int l, int m, int r){
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;
        int [] L = new int[n1];
        int [] R = new int[n2];
        for (i = 0; i < n1; i++){
            L[i] = arr[l + i];
        }  
        for (j = 0; j < n2; j++){
            R[j] = arr[m + 1+ j];
        }
        i = 0;
        j = 0; 
        k = l; 
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int a[], int l, int r){
        if (l < r){
            int m = l+(r-l)/2;
            mergeSort(a, l, m);
            mergeSort(a, m+1, r);
            mergeS(a, l, m, r);
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums[] = new int[n+m];
        for(int i =0 ; i<m ; i++){
            nums[i]= nums1[i];
        }
        for(int i =m ; i<n+m ; i++){
            nums[i]= nums2[i-m];
        }
        mergeSort(nums, 0, nums.length-1);
        for(int i :  nums){
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        int [] a={1,25,3,3,0,0,0};
        int[] b ={2,5,9,6};
        merge(a, 5, b, 4);
    }}
