import java.util.Arrays;

public class TestEquals {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = a;

        if(a == b){
            System.out.println("a == b");
        }
        else
            System.out.println("a!= b");

        if(a == c)
            System.out.println("a == c");
        else
            System.out.println("a!= c");

        if(equals(a,b)){
            System.out.println("a equals b");
        }
        else
            System.out.println("a !equals b");

        if(Arrays.equals(a,b)){
            System.out.println("a equals b");
        }
        else
            System.out.println("a !equals b");
    }

    public static boolean equals(int[] a, int[] b){
        boolean match = true;
        if(a.length != b.length)
            match = false;
        else
        {
            int i  = 0;
            while(match && (i < a.length)){
                if(a[i] != b[i])
                    match = false;
                i++;
            }
            i++;
        }
        return match;
    }
}
