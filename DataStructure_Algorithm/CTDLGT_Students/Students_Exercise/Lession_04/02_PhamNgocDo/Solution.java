public class Solution {
    public static int search(int a[], int x){
            int n = a.length;
            int l = 0, r = n-1;
            while (l < r){
                int mid = (l+r)/2;
                if (a[mid] < x){
                    l = mid+1;
                }
                else{
                    r = mid;
                }
            }
            if (a[l] == x){
                return l;
            }
            return -1;
        }
        public static void main(String[] args) {
            int a[] = {1,2,3,7,8,9,22,33,44};
            System.out.println(search(a,-6 ));
        }
    }