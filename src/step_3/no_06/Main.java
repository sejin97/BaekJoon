package step_3.no_06;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        int [] numa = new int[num];

        for (int i = 0; i < num; i++) {
            String A = br.readLine();
            String []SA = A.split(" ");

            numa[i] =Integer.parseInt(SA[0]) + Integer .parseInt(SA[1]);
        }
        for(int j =0; j<num; j++) {
            bw.write(String.valueOf(numa[j]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
