class _1791FindCenterofStarGraph {

  public static int findCenter(int[][] edges) {
    int peakNumber = edges.length + 1;
    int processingPeak[] = new int[peakNumber + 1];

    for (int i = 0; i < edges.length; i++) {
      int[] processingEdgePeak = edges[i];

      int firstPeak = processingEdgePeak[0];
      int secondPeak = processingEdgePeak[1];

      processingPeak[firstPeak]++;
      processingPeak[secondPeak]++;
    }
    for (int i = 1; i <= peakNumber; i++) {
      if (processingPeak[i] == peakNumber - 1) {
        return i;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int[][] edges = { { 1, 2 }, { 2, 3 }, { 4, 2 } };
    findCenter(edges);
  }
}
