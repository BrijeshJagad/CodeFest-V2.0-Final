import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class Minesweeper {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner sc=new Scanner(new File("sample_input.txt"));
        // PrintWriter out = new PrintWriter(new File("sample_output.txt"));

        // Scanner sc=new Scanner(new File("testcases/problem-1-Minesweeper/small_input.txt"));
        // PrintWriter out = new PrintWriter(new File("testcases/problem-1-Minesweeper/small_output.txt"));
        
        Scanner sc=new Scanner(new File("testcases/problem-1-Minesweeper/big_input.txt"));
        PrintWriter out = new PrintWriter(new File("testcases/problem-1-Minesweeper/big_output.txt"));
        

        int T = sc.nextInt();
        for (int k = 0; k < T; k++) {
            
            int R = sc.nextInt();
            int C = sc.nextInt();
            int M = sc.nextInt();
            String[][] matrix = new String[R][];
            
            if(M > R*C-8)
            {
                out.println("case #"+(k+1)+":\nImpossible");
            }else{
                
                out.println("case #"+(k+1)+":");
                for (int i = 0; i < R; i++) {
                    matrix[i]=new String[C];
                    for (int j = 0; j < C; j++) {
                        matrix[i][j]=".";
                    }
                }
                int[] codinateofc = {R/2,C/2};
                matrix[codinateofc[0]][codinateofc[1]]="c";

                
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        if(M>0){
                            if(
                                i==codinateofc[0] && j==codinateofc[1]
                                || i==codinateofc[0]+1 && j==codinateofc[1]
                                || i==codinateofc[0]-1 && j==codinateofc[1]
                                || i==codinateofc[0] && j==codinateofc[1]+1
                                || i==codinateofc[0] && j==codinateofc[1]-1
                                || i==codinateofc[0]+1 && j==codinateofc[1]+1
                                || i==codinateofc[0]+1 && j==codinateofc[1]-1
                                || i==codinateofc[0]-1 && j==codinateofc[1]-1
                                || i==codinateofc[0]-1 && j==codinateofc[1]+1
                            )
                                continue;
                            matrix[i][j]="*";
                            M--;
                        }
                    }
                }

                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        out.print(matrix[i][j]);
                    }
                    out.println();
                }
            }
        }
        out.close();
    }
}
