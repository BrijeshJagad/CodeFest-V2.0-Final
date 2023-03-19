import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class TeaPoint {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("sample_input.txt"));
        PrintWriter out = new PrintWriter(new File("sample_output.txt"));

        int T=sc.nextInt();

        for (int k = 0; k < T; k++) {
            int B,C,D;
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();
            int owned_cap = 0;
            int total_renting_expense=0;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                arr.add(sc.nextInt());
            }
            for (int i = 0; i < arr.size(); i++) {
                total_renting_expense += ((arr.get(i)*C + (Math.ceil((double)(arr.get(i)/3)))*D)*(2/B));        
            }
            
            out.println("Case #"+(k+1)+":"+arr.get(arr.size()/2)+" "+total_renting_expense);
        }
        out.close();
    }
}
