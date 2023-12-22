#1// Memory efficient:

class Solution {
    class Node {
        int i;
        int j;
        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    
    boolean isSafe(char M[][], int row, int col) {
        return (row >= 0) && (row < M.length) && (col >= 0) && (col < M[0].length) && (M[row][col] == '1');
    }
    
    public List<Node> getNeighbors(Node d, char[][] grid) {
        int rowNbr[] = new int[] { -1, 0, 0, 1 };
        int colNbr[] = new int[] { 0, -1, 1, 0 };
        List<Node> neighbors = new ArrayList<Node>();
        for (int k = 0; k < 4; k++)  {
            int row = d.i + rowNbr[k];
            int col = d.j + colNbr[k];
            if (isSafe(grid, row, col)) {
                Node n = new Node(row, col);
                neighbors.add(n);
            }
        }
        return neighbors;
    }
    
    public void BFS(boolean[][] visited, char[][] grid, Node n) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(n);
        while (!queue.isEmpty()) {
            int until = queue.size();
            for (int i = 0; i < until; i++) {
                Node d = queue.remove();              
                List<Node> neighbors = getNeighbors(d, grid);
                for (Node ne : neighbors) {
                    if (!visited[ne.i][ne.j]) {
                        visited[ne.i][ne.j] = true;
                        queue.add(ne);
                    }
                }
            }
        }
        return;
    }
    
    public void DFS(boolean[][] visited, char[][] grid, Node n) {
        List<Node> neighbors = getNeighbors(n, grid);
        for (Node ne : neighbors) {
            if (!visited[ne.i][ne.j]) {
                visited[ne.i][ne.j] = true;
                BFS(visited, grid, ne);
            }
        }
        return;
    }
    
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return -1;
        Queue<Node> queue = new LinkedList<Node>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        int counter=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && (grid[i][j] == '1'))  {
                    DFS(visited, grid, new Node(i, j));
                    counter++;
                }
            }
        }
        return counter;
    }
}

#2. Similar my Idea... connected land:

class Solution {
    class DisjointSet {
        private int[] parent;
        private int[] weight;

        public DisjointSet(int n) {
            parent = new int[n];
            weight = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = -1;
                weight[i] = 1;
            }
        }

        public void connect(int x, int y) {
            int p1 = find(x);
            int p2 = find(y);
            if (p1 == p2) {
                return;
            }

            if (weight[p1] <= weight[p2]) {
                parent[p1] = p2;
                weight[p2] += weight[p1];
            } else {
                parent[p2] = p1;
                weight[p1] += weight[p2];
            }
        }

        public boolean isConnect(int x, int y) {
            int p1 = find(x);
            int p2 = find(y);
            return p1 == p2;
        }

        public int find(int x) {
            if (parent[x] == -1) {
                return x;
            }
            parent[x] = find(parent[x]);
            return parent[x];
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;
        int[][] offset = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    grid[i][j] = '0';
                    queue.push(new int[]{i, j});
                    while (!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        int x = curr[0], y = curr[1];
                        for (int[] os : offset) {
                            int nx = x + os[0];
                            int ny = y + os[1];
                            if (0 <= nx && nx < m && 0 <= ny && ny < n && grid[nx][ny] == '1') {
                                grid[nx][ny] = '0';
                                queue.push(new int[]{nx, ny});
                            }
                        }
                        
                        // System.out.println(Integer.toString(x) + Integer.toString(y));
                    }
                }
            }
        }
        // for (int i = 0; i < ds.parent.length; i++) {
        //     System.out.println(ds.parent[i]);
        // }
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.println(grid[i][j]);
        //     }
        // }
        // for (int i = 0; i < ds.parent.length; i++) {
        //     ds.find(i);
        // }
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < ds.parent.length; i++) {
        //     if (ds.parent[i] != -1) {
        //         set.add(ds.parent[i]);
        //     }
        // }
        return result;
    }
}

#3. Fastest Solution:
class Solution {
 public  int numIslands(char[][] grid) {
		int count =0;
		int[] currentPos = {-1,-1};
		
		do {
			nextIsland(grid, currentPos);
			if(currentPos[0]!=-1) {
				count++;
				explore(grid, currentPos[0], currentPos[1]);
			}
			
		} while (currentPos[0] != -1);
		
		
		return count;
	}
	
	private void nextIsland(char[][] grid, int[] currentPos) {
		for(int i = Math.max(0, currentPos[0]) ; i < grid.length;i++) {
			for(int j=0; j< grid[0].length; j++) {
				if(grid[i][j] == '1') {
					currentPos[0] = i;
					currentPos[1] = j;
					return;
				}
			}
		}
			
			currentPos[0] = -1;
	}
	
	private void explore(char[][] grid, int row, int col) {
		if(row <0 || row >grid.length-1 || col < 0 || col > grid[0].length-1 || grid[row][col] != '1') return;
		grid[row][col] = '2';
		
		explore(grid, row+1, col);
		explore(grid, row-1, col);
		explore(grid, row, col+1);
		explore(grid, row, col-1);
	}
}