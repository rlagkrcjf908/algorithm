package Study.Friends;



import java.util.Scanner;

public class baek18222 {

    static long [] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        arr = new long[64];

        arr[0] = 1;

        long n = Long.parseLong(sc.nextLine());

        for(int i = 1 ; i < 64 ; i++) {

            arr[i] = arr[i-1]*2;

        }

        System.out.print(sol(n));

    }



    public static int sol(long n) {

        if(n==1) {

            return 0;

        }

        for(int i = 0; i<64;i++) {

            if(arr[i]>=n) {
                return 1 - sol( (int)n - arr[i-1]);
            }

        }

        return 0;











    }

}

/*import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;



public class baek18222 {

    static long [] map;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long K = Long.parseLong(br.readLine());

        map = new long[65];

        map[0] = 1;

        for(int i = 1; i < 65; ++i)

        {

            map[i] = map[i-1] * 2;

        }

        System.out.print(get(K));

    }

    static long get(long k)

    {

        if(k == 1) return 0;



        for(int i = 0; i < 65; ++i)

        {

            if(k <= map[i]) return 1- get(k - map[i-1]);

        }

        return 0;

    }



}*/



