import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int MAX = 200001;
        int[] diff = new int[MAX + 1];

        // Step 1: Difference array for recipe ranges
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            diff[l]++;
            diff[r + 1]--;
        }

        // Step 2: Prefix sum to get coverage count
        // Step 3: Mark admissible (>=k), build another prefix sum for queries
        int[] prefix = new int[MAX + 1];
        int running = 0;
        for (int i = 1; i < MAX; i++) {
            running += diff[i];
            // prefix[i] = count of admissible temps from 1 to i
            prefix[i] = prefix[i - 1] + (running >= k ? 1 : 0);
        }

        // Step 4: Answer queries in O(1)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(prefix[b] - prefix[a - 1]).append("\n");
        }

        System.out.print(sb);
    }
}
