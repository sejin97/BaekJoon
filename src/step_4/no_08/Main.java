package step_4.no_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b=42,cnt = 0;
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<arr.length; i++) {
            a = sc.nextInt();
            arr[i] = a%b;
        }

        for(int i =0;i<arr.length;i++) {
            for(int j =0; j<=i;j++) {
                if(i == 0 && j == 0)
                    cnt++;
                else if(i==j)
                    cnt++;
                else if(arr[i] == arr[j])
                    break;
            }
        }
        System.out.println(cnt);
    }
}
