public class _59_SpiralMatrix {
    int[][] res;
    int length;
    // String direction;

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        length = n*n;
        String direction = "right";
        createSpiral(res, 0, 0, 1, direction);
        return res;
    }

    public void createSpiral(int[][] res, int x, int y, int cellValue, String direction) {
        if(cellValue <= length) {
            res[x][y] = cellValue;
            switch(direction) {
                case "right": 
                    if (y >= res.length - 1 || res[x][y+1] !=  0) {
                        createSpiral(res, x, y+1, cellValue + 1, "down");
                    } else 
                    createSpiral(res, x, y+1, cellValue + 1, "right");
                    
                    break;
                case "down": 
                    if (x >= res.length - 1 || res[x+1][y] !=  0) {
                        createSpiral(res, x, y-1, cellValue + 1, "left");
                    } else 
                    createSpiral(res, x+1, y, cellValue + 1, "down");
                    break;
                case "left": 
                    if (y==0 || res[x][y-1] !=  0) {
                        createSpiral(res, x-1, y, cellValue + 1, "up");
                    } else 
                    createSpiral(res, x, y-1, cellValue + 1, "left");
                    break;
                default: //UP
                    if (x == 0 || res[x-1][y] !=  0) {
                        createSpiral(res, x, y+1, cellValue + 1, "right");
                    } else 
                    createSpiral(res, x-1, y, cellValue + 1, "up");            }
            
        }
    }
}
