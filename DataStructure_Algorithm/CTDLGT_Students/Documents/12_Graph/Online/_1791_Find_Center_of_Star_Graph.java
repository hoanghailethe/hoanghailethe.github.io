public class _1791_Find_Center_of_Star_Graph {
    public static int findCenter(int[][] e) {
        
        int soDinh = e.length + 1;

        int[] count = new int[soDinh + 1];
        // soDinhLienKe[i] => so Dinh lien ke voi dinh i



        for (int i = 0; i < e.length; i++) {
            // int[] canhDangXet = e[i];
            //i 
            int dinhDau = e[i][0];
            int dinhCuoi = e[i][1];

            count[dinhDau]++; // Tang so dinh lien ke voi dinhDau len 1
            count[dinhCuoi]++; // Tang so dinh lien ke voi dinhCuoi len 1
        }

        for (int i = 1; i <= soDinh; i++) {
            if(count[i] == soDinh - 1){
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[][] s = {{1,2},{2,3},{4,2}};
        findCenter(s);
    }
}
