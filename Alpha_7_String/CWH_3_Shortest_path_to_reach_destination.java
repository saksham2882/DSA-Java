package Alpha_7_String;

public class CWH_3_Shortest_path_to_reach_destination {

    // T.C :  O(n)
    public static float Shortest_path(String str) {
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);

            // North :
            if (s == 'N') {
                y++;
            }
            // South :
            else if (s == 'S') {
                y--;
            }
            // East :
            else if (s == 'E') {
                x++;
            }
            // West :
            else if (s == 'W') {
                x--;
            }
        }
        
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {

        // Given a route containing 4 Directions (E,W,N,S), find the shortest path to reach Destination.

        var str = "WNEENESENNN";

        System.out.println("Shortest path : " + Shortest_path(str));

        System.out.println("Shortest path : " + Shortest_path("NS"));
    }
}