
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int result[]=new int[10];
        for(int i=1;i<=10;i++)
        {
                result[i]=N*i;
                System.out.print(N+" x "+i+" = "+result[i]);
                System.out.println();
        }

        bufferedReader.close();
    }
    
}
