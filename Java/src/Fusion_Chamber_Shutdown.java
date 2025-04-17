// Task name: Fusion Chamber Shutdown
// Difficulty: 7 kyu
// Condition: Task has been solved
// Date of creation: 2025-04-17

public class Fusion_Chamber_Shutdown {
    public static void main(String[] args) {
        var result = burner(939, 3, 694);
        for (int elem : result) {
            System.out.println(elem);
        }
    }

    public static int [] burner(int c, int h, int o) {
        int h2o = Math.max(Math.min(h / 2, o), 0);
        int co2 = Math.max(Math.min(c, (o - h2o) / 2), 0);
        int ch4 = Math.max(Math.min(c - co2, (h - h2o * 2) / 4), 0);
        return new int[]{h2o, co2, ch4};
    }

//    public static int [] burner(int c, int h, int o) {
//        int [] result = new int[3];
//
//        int res_1 = Math.min(h / 2, o);
//        result[0] = res_1;
//        h -= res_1 * 2;
//        o -= res_1;
//
//        int res_2 = Math.min(c, o / 2);
//        result[1] = res_2;
//        c -= res_2;
//        o -= res_2 * 2;
//
//        int res_3 = Math.min(c, h / 4);
//        result[2] = res_3;
//        c -= res_3;
//        h -= res_3 * 4;
//
//        return result;
//    }
}