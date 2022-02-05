package session15.labs15assessment;

import java.util.Arrays;

public class lab2 {

       public static void main(String[] args) {
              // Declare Array String of Cities to Sort
              String[] arrayOfStrings = {
                     "Hobart",
                     "Melbourne",
                     "Canberra",
                     "Darwin",
                     "Adelaide",
                     "Perth",
                     "Sydney"
              };
              // Call method and sort
              linearSearchOfCities(arrayOfStrings);
              //Output to Console
              System.out.println(Arrays.toString(arrayOfStrings));

       }

       // String Sort Method
       private static void linearSearchOfCities(String array[]) {
              String temp;
              int count = array.length;
              for (int i = 0; i < count; i++) {
                     for (int j = i + 1; j < count; j++) {
                            if (array[i].compareTo(array[j]) > 0) {
                                   temp = array[i];
                                   array[i] = array[j];
                                   array[j] = temp;
                            }
                     }
              }

       }

}
