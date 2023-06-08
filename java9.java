import java.util.*;

class main {
    static int pop(int s, int p) {
        if (p == 0) {
            return s;
        }
        int z = s % p;
        return pop(p, z);
    }

    static int M = 6;

    static int maxPointOnSameLine(int[][] points) {
        if (M < 2)
            return M;
        int maxPoint = 0;
        int curMax, overlapPoints, verticalPoints;
        HashMap<String, Integer> slopeMap = new HashMap<>();
        for (int i = 0; i < M; i++) {
            curMax = overlapPoints = verticalPoints = 0;
            for (int j = i + 1; j < M; j++) {
                if (points[i][0] == points[j][0] && points[i][1] == points[j][1])
                    overlapPoints++;
                else if (points[i][0] == points[j][0])
                    verticalPoints++;

                else {
                    int yDif = points[j][1] - points[i][1];
                    int xDif = points[j][0] - points[i][0];
                    int q = pop(xDif, yDif);
                    yDif /= q;
                    xDif /= q;
                    String pair = (yDif) + " " + (xDif);
                    if (!slopeMap.containsKey(pair))
                        slopeMap.put(pair, 0);
                    slopeMap.put(pair, slopeMap.get(pair) + 1);
                    curMax = Math.max(curMax, slopeMap.get(pair));
                }

                curMax = Math.max(curMax, verticalPoints);
            }
            maxPoint = Math.max(maxPoint, curMax + overlapPoints + 1);
            slopeMap.clear();
        }

        return maxPoint;
    }

    public static void main(String[] args) {
        int points[][] = { { -1, 1 }, { 0, 0 }, { 1, 1 }, { 2, 2 }, { 3, 3 }, { 3, 4 } };
        System.out.println(maxPointOnSameLine(points));
    }
}
