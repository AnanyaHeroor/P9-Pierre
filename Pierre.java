/**
 * This class aims to sort loose pages
 * @author Ananya Heroor
 */
import java.util.Random;
public class Pierre{
    public static void main (String [] args){
        // System.out.println(isInOrder(new int[]{1,2,3,4,5,6,7}));
        // System.out.println(isInOrder(new int[]{10,9,8,7,6,5,4,3}));
        // System.out.println(isInOrder(new int[]{1,2,4,5,6,7}));
        // System.out.println(isInOrder(new int[]{9,7,5,8,4}));
        // System.out.println(isInOrder(new int[]{3,4,5,6,2,1}));
        // System.out.println(isInOrder(new int[]{1,4,3,2,6}));
        // System.out.println(order({6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74}));
    //    int[] pages = {6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74};
    //    int[] pages = {3,4,1,2,7,9283};
    //    int[] pages = {10,9,8,7,6,5,4,3,2,1};
    //    int[] pages = {1,2,3,5,4,6,7,8};
    //    int[] pages = {6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74};
    //    order(pages);
    //    System.out.println("The correct page order: ");
    //    printPages(pages);
    // System.out.println((int) (Math.random()*100));
    //********** HOW I TESTED FOR EFFICIENCY: **********//
    // int [] pages = new int [100000];
    // for (int i = 0; i<pages.length;i++){
    //     pages [i] = (int) (Math.random()*100000);
    //     // System.out.println(pages[i]);
    // }
    // order(pages);
    // System.out.println("The correct page order: ");
    // printPages(pages);

}
/**
 * This function checks if the pages are in order or not
 * to determine when to stop sorting the pages
 */
    public static boolean isInOrder (int [] pages){
        int i = 0;
        for (i=0; i<pages.length-1; i++){
            if (pages[i]>pages[i+1] ){
                return false;
            }
        } return true;
    }
    /**
     * The function assembles the pages in the correct order
     */
    public static void order (int[] pages){
        int temp;
        int i = 0;
        int j = 0;
        for (i = 0; i<pages.length-1;i++){
            int min_i = i;
            for (j = i+1; j<pages.length;j++){
                if (pages[j]<pages[min_i]){
                    min_i = j;
                }
            }
            if (min_i !=i){
                temp = pages[i];
                pages[i]=pages[min_i];
                pages[min_i] = temp;
            }
        }
        
    }
    /**
     * This function prints the ordered pages 
     *
     */ 
    public static void printPages(int[] pages){
        System.out.print("{");
        for (int i = 0; i < pages.length-1; i++){
            System.out.print(pages[i] + ", ");
        }
        System.out.println(pages[pages.length-1] + "}");
    }
}
