public class Study_0617 {
    public static void main(String[] args) {
        int[] A = {24,45,12,12,23232};
        int maxscore = Integer.MIN_VALUE, left = A[0];
        for (int i = 1; i < A.length; i++) {
            maxscore = Math.max(maxscore, A[i] - i + left);  //更新 最大值
            left = Math.max(left, A[i] + i);  //更新 A[i] + i
        }
        System.out.println(maxscore);
    }
}
