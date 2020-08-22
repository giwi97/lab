import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static String solve(long n, long k) {
        
        String prm = "";
        String ans = "";

        if(n > 0 && k > 0 && n > k){
        
        if (k % 2 == 0 || k == 1){
            
            prm = "false";
            
        }
     
        for(int i=3;i<=Math.sqrt(k);i+=2) { 
            
            if(k % i == 0){
                
            prm = "false";
            
            }
        } 
        
        prm = "true";
        
        if(prm == "true" && n >= (k * (k + 1)) / 2){
            
            ans = "Yes";
            
        }else{
            
            ans = "No";
            
        }
        
       

    }else{
            
            ans = "No";
            
        }
        
        
         return ans;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            long n = Long.parseLong(nk[0]);

            long k = Long.parseLong(nk[1]);

            String result = solve(n, k);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
