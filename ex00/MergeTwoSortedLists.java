import java.util.Scanner;

class MergeTwoSortedLists{

    public static void main(String[] args){
        int i, i1, i2;
        int[] t1 = {1, 2, 3};
        int[] t2 = {1, 3, 4};
        int[] t3 = new int[6];

        i = 0;
        i1 = 0;
        i2 = 0;
        while(i < t3.length){
        System.out.println("In boucle");
            while (t1[i1] <= t2[i2] && i1 < t1.length){
                t3[i] = t1[i1];
                i1++;
                i++;
                System.out.println("Boucle i1");
            }
            if (i >= t3.length){
                break;
            }
            while (t2[i2] <= t1[i1] && i2 < t2.length){
                t3[i] = t2[i2];
                i2++;
                i++;
                System.out.println("Boucle i2");
            }
        }
        for (int num : t3){
            System.out.println(num);
        }
    }
}