import java.io.*;
public class CarRacing {
    static int R, C;

    static int solve(int norm, int turbo, int cool, int dura) {
        int time = 0;
        int flag = 0;
        int dist = 0;
        while (true) {
            for (int j = 1; j <= dura; j++) {
                dist = dist + turbo;
                time++;
                if (dist >= R) {
                    flag++;
                    break;
                }
            }
            if (flag > 0) {
                break;
            }
            for (int k = 1; k <= cool; k++) {
                dist = dist + norm;
                time++;
                if (dist >= R) {
                    flag++;
                    break;
                }
            }
            if (flag > 0) {
                break;
            }
        }
        return time;
    }
    public static void main(String[] args) throws IOException {
        FileReader fin = new FileReader("C:\\Users\\System5\\Downloads\\input.txt");
        BufferedReader in = new BufferedReader(fin);
        FileWriter fout = new FileWriter("C:\\Users\\System5\\Downloads\\output.txt");
        BufferedWriter bout = new BufferedWriter(fout);
        PrintWriter pout = new PrintWriter(bout);

        int T = Integer.parseInt(in.readLine());//Number of test cases.
        CarRacing obj;
        obj = new CarRacing();

        for (int cas = 1; cas <= T; cas++) {
            
            String s = in.readLine();
            String[] str = s.split(" ");
            
            R = Integer.parseInt(str[0]); // Track length in meters
            C = Integer.parseInt(str[1]); // number of cars;
            int[][] arr = new int[C][2];//stores id and time.
            String[] stat = new String[5];//Takes the stats for per car per line.

            for (int q = 0; q < C; q++) {//each car
                String st = in.readLine();
                
                stat = st.split(" ");
                int id = Integer.parseInt(stat[0]);
                int ns = Integer.parseInt(stat[1]);
                int ts = Integer.parseInt(stat[2]);
                int tc = Integer.parseInt(stat[3]);
                int td = Integer.parseInt(stat[4]);

                arr[q][0] = id;
                arr[q][1] = solve(ns, ts, tc, td);

            }
            int minTime = arr[0][1];
            int winnerId = arr[0][0];

            for (int i = 0; i < C; i++) {
                if (arr[i][1] < minTime || (arr[i][1] == minTime && arr[i][0] < winnerId)) {
                    minTime = arr[i][1];
                    winnerId = arr[i][0];
                }
            }

            pout.println("Case #" + cas + ": " + winnerId);

        }
        pout.close();
        in.close();
    }
}
