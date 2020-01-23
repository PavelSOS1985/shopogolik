import java.util.*;

public class Level1 {
    public static int MaximumDiscount(int N, int[] price) {
        int res = 0;
        if (N < 3) return res;
        int tempEl;
        for (int i = 0; i < N; i++) {
            tempEl = price[i];
            for (int j = i; j < N; j++) {
                if (price[j] > tempEl) {
                    price[i] = price[j];
                    price[j] = tempEl;
                    tempEl = price[i];
                }
            }
        }
        for (int i = 2; i < N; i = i + 3) {
            res += price[i];
        }
        return res;
    }
}