public class _1791_FirstCenter {
    public static int findCenter(int[][] e) {
        
        int soDinh = e.length + 1;

        int[] soDinhLienKe = new int[soDinh + 1];
        // soDinhLienKe[i] => so Dinh lien ke voi dinh i

        for (int i = 0; i < e.length; i++) {
            int[] canhDangXet = e[i];
            int dinhDau = canhDangXet[0];
            int dinhCuoi = canhDangXet[1];

            soDinhLienKe[dinhDau]++; // Tang so dinh lien ke voi dinhDau len 1
            soDinhLienKe[dinhCuoi]++; // Tang so dinh lien ke voi dinhCuoi len 1
        }

        for (int i = 1; i <= soDinh; i++) {
            if(soDinhLienKe[i] == soDinh - 1){
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
