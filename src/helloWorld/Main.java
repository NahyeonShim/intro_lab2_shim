package helloWorld;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      boolean[] chptList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
      int includeChpt;
      int i, j;
      
      // Get the chapter selections
      for (i = 1; i <= 15; ++i) {
         includeChpt = scnr.nextInt(); 
         if (includeChpt==1) {
            chptList[i] = true;
         }
         else {
            chptList[i] = false;
         }
      }
      
  
      // Print selected chapters using shorthand for ranges of 3 or more
      boolean anyChapterSelected = false;
      for (i = 1; i <= 15; i++) {
         if (chptList[i]) {
            anyChapterSelected = true;
            int rangeEnd = i;
            if ((i <= 14) && chptList[i+1]) {
               if ((i <= 13) && chptList[i+2]) {
                  if ((rangeEnd <= 1) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3] && chptList[rangeEnd+4] && chptList[rangeEnd+5] && chptList[rangeEnd+6] && chptList[rangeEnd+7] && chptList[rangeEnd+8] && chptList[rangeEnd+9] && chptList[rangeEnd+10] && chptList[rangeEnd+11] && chptList[rangeEnd+12] && chptList[rangeEnd+13] && chptList[rangeEnd+14]) {
                     rangeEnd+=14;
                  }
                  else if ((rangeEnd <= 2) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3] && chptList[rangeEnd+4] && chptList[rangeEnd+5] && chptList[rangeEnd+6] && chptList[rangeEnd+7] && chptList[rangeEnd+8] && chptList[rangeEnd+9] && chptList[rangeEnd+10] && chptList[rangeEnd+11] && chptList[rangeEnd+12] && chptList[rangeEnd+13]) {
                     rangeEnd+=13;
                  }
                  else if ((rangeEnd <= 3) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3] && chptList[rangeEnd+4] && chptList[rangeEnd+5] && chptList[rangeEnd+6] && chptList[rangeEnd+7] && chptList[rangeEnd+8] && chptList[rangeEnd+9] && chptList[rangeEnd+10] && chptList[rangeEnd+11] && chptList[rangeEnd+12]) {
                     rangeEnd+=12;
                  }
                  else if ((rangeEnd <= 4) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3] && chptList[rangeEnd+4] && chptList[rangeEnd+5] && chptList[rangeEnd+6] && chptList[rangeEnd+7] && chptList[rangeEnd+8] && chptList[rangeEnd+9] && chptList[rangeEnd+10] && chptList[rangeEnd+10]) {
                     rangeEnd+=11;
                  }
                  else if ((rangeEnd <= 5) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3] && chptList[rangeEnd+4] && chptList[rangeEnd+5] && chptList[rangeEnd+6] && chptList[rangeEnd+7] && chptList[rangeEnd+8] && chptList[rangeEnd+9] && chptList[rangeEnd+10]) {
                     rangeEnd+=10;
                  }
                  else if ((rangeEnd <= 6) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3] && chptList[rangeEnd+4] && chptList[rangeEnd+5] && chptList[rangeEnd+6] && chptList[rangeEnd+7] && chptList[rangeEnd+8] && chptList[rangeEnd+9]) {
                     rangeEnd+=9;
                  }
                  else if ((rangeEnd <= 7) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3] && chptList[rangeEnd+4] && chptList[rangeEnd+5] && chptList[rangeEnd+6] && chptList[rangeEnd+7] && chptList[rangeEnd+8]) {
                     rangeEnd+=8;
                  }
                  else if ((rangeEnd <= 8) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3] && chptList[rangeEnd+4] && chptList[rangeEnd+5] && chptList[rangeEnd+6] && chptList[rangeEnd+7]) {
                     rangeEnd+=7;
                  }
                  else if ((rangeEnd <= 9) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3] && chptList[rangeEnd+4] && chptList[rangeEnd+5] && chptList[rangeEnd+6]) {
                     rangeEnd+=6;
                  }
                  else if ((rangeEnd <= 10) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3] && chptList[rangeEnd+4] && chptList[rangeEnd+5]) {
                     rangeEnd+=5;
                  }
                  else if ((rangeEnd <= 11) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3] && chptList[rangeEnd+4]) {
                     rangeEnd+=4;
                  }
                  else if ((rangeEnd <= 12) && chptList[rangeEnd+1] && chptList[rangeEnd+2] && chptList[rangeEnd+3]) {
                     rangeEnd+=3;
                  }
                  else if ((rangeEnd <= 13) && chptList[rangeEnd+1] && chptList[rangeEnd+2]) {
                     rangeEnd+=2;
                  }
                  else if ((rangeEnd <= 14) && chptList[rangeEnd+1]) {
                     rangeEnd++;
                  }
                  System.out.print(i + "-" + rangeEnd + " ");
                  i = rangeEnd;
               }
               else {
                  System.out.print(i + " " + (i+1) + " ");
                  ++i;
               }
            }   
            else {
               // Single chapter
               System.out.print(i + " ");
            }
         }
      }
     
      // Print "None" if no chapters are selected
      if (!anyChapterSelected) {
         System.out.print("None ");
      }
      
      System.out.println();
   
   
   

   }
}
