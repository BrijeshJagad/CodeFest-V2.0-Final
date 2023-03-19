import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class P2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("s_input.txt"));
        PrintWriter out = new PrintWriter(new File("s_output.txt"));

        int O=Integer.parseInt(sc.nextLine());
        String[] se=sc.nextLine().split(",");
        double[] start = {Double.parseDouble(se[0]),Double.parseDouble(se[1])};
        double[] end = {Double.parseDouble(se[2]),Double.parseDouble(se[3])};

        String[][] map=new String[30][100];
        double avg=0,avg2=0;
        double[][] mapele=new double[O][];
        for (int i = 0; i < O; i++) {
            String[] temp=sc.nextLine().split(",");
            double a= Double.parseDouble(temp[0]);
            double b= Double.parseDouble(temp[1]);
            mapele[i] = new double[2];
            mapele[i][0]=a;
            mapele[i][1]=b;
            avg+=mapele[i][0];
            avg2+=mapele[i][1];
        }
        avg=30/avg;
        avg2=O/avg2;
        System.out.println(avg+","+avg2);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j]="_";
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                out.print(map[i][j]);
            }
            out.println();
        }
        out.close();
    }    
}
