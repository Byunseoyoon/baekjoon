package java_src;

import java.io.*;

public class B4_31403_ABC {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        System.out.println(A+B-C);
        System.out.println(Integer.parseInt(""+A+B)-C);
    }
}
