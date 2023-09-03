package W3resource;

import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class StringExcercises {

    public static void main(String[] args){
        // performance time
        long start = System.currentTimeMillis();
        //System.out.println(System.currentTimeMillis() - start + "ms"); It should be at the end of test or specified step
//1. Write a Java program to get the character at the given index within the string.

        String str = "Java Exercises!";
        System.out.println("This is original string:" + str);

        //Get character at described position
        int index0 = str.charAt(0);
        int index10 =str.charAt(10);


        System.out.println((char)index0);
        System.out.println((char)index10);

        //2. Write a Java program to get the character (Unicode code point) at the given index within the string.

        String webAddress = "w3resource.com";

        //int result1 = webAddress.codePointAt(0);
        int sizeWebAddress = (webAddress.length());

        //System.out.println(result1);

        for (int f=0; f < sizeWebAddress; f++) {
            int unicodeUnits = webAddress.codePointAt(f);
           if(unicodeUnits==51 || unicodeUnits==101) {
               System.out.println(unicodeUnits);
               System.out.println(webAddress.charAt(f));
           }
        }

        //3.Write a Java program to get the character (Unicode code point) before the specified index within the string.

        System.out.println("Excercise 3 Berginning!!!!!!!");
        for (int f=0; f < sizeWebAddress; f++) {
            int unicodeUnits = webAddress.codePointAt(f);
            if(unicodeUnits==51 || unicodeUnits==101) {
                System.out.println(webAddress.codePointBefore(f));
                System.out.println(webAddress.charAt(f-1));
            }
        }
        System.out.println("Excercise 3 End!!!!!!!");

        //4.Write a Java program to count Unicode code points in the specified text range of a string.

        System.out.println("Excercise 4 Berginning!!!!!!!");

        System.out.println("Original String : " + webAddress);

        // codepoint from index 1 to index 10, 10th index is not included
        int ctr = webAddress.codePointCount(1, 10);

        //for loop just for checking codePointCount
        for (int f=0; f < ctr; f++) {
            int unicodeUnits = webAddress.codePointAt(f+1);
            System.out.println(unicodeUnits);
            System.out.println(webAddress.charAt(f+1));
        }

        // prints character from index 1 to index 10 --- 10th index has been skiped because dot is not included in unicode ?
        System.out.println("4.Codepoint count = " + ctr);

        System.out.println("Excercise 4 End!!!!!!!");

        //5.Write a Java program to compare two strings lexicographically.
        //Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

        String string1 = "This is exercise 1";
        String string2 = "This is Exercise 1";

        //if (string1 > string2) it returns a positive value.
        //if both the strings are equal lexicographically i.e.(string1 == string2) it returns 0.
        //if (string1 < string2) it returns a negative value.

        System.out.println("5.Compare two strings lexicographically "+ string1.compareTo(string2));


        //6.Write a Java program to compare two strings lexicographically, ignoring case differences.

        System.out.println("6.Compare two strings lexicographically with ignore case "+ string1.compareToIgnoreCase(string2));

        //7.Write a Java program to concatenate a given string to the end of another string.

        String concatenate1="7.PHP Exercises and ";
        String concatenate2 = "Python Exercises" ;

        String con1con2 = concatenate1 + concatenate2;
        System.out.println(con1con2);
        System.out.println(concatenate1.concat(concatenate2));

        //8 Write a Java program to test if a given string contains the specified sequence of char values.
        boolean u = con1con2.contains("and");
        System.out.println("8. String contains specified word 'and':" + u) ;

        //9. Write a Java program to compare a given string to the specified character sequence.
        String stringNo1 = "example.com";
        String stringNo2 = "example.com";
        String stringNo3 = "Example.com";

        System.out.println("9.Exercise");
        System.out.println(stringNo1.compareTo(stringNo2));
        System.out.println(stringNo1==stringNo2);
        System.out.println(stringNo2.compareTo(stringNo3));
        System.out.println(stringNo2==stringNo3);
        System.out.println(stringNo1.contentEquals(stringNo3));



        //10 Write a Java program to compare a given string to a specified string buffer.

        String string11 = "Example";
        String string22 = "example";
        StringBuffer sb = new StringBuffer();

        String sbString = sb.append("example").toString();
        System.out.println(sbString);

        System.out.println(string11==sbString);
        System.out.println(string11.contentEquals(sbString));
        System.out.println(string22==sbString);
        System.out.println(string22.contentEquals(sbString));


        //11. Write a Java program to create a String object with a character array.

        System.out.println("Excersice 11");

        char[] characters = {'1', '2', '3', '4'};

        String str11 = String.copyValueOf(characters, 0, 2);

        System.out.println("\nThe book contains:" + str11 + " pages");

        //12.Write a Java program to check whether a given string ends with another string.

        System.out.println("Excercise 12");

        String correct1 = "Python Exercises";
        String incorrect1 = "Python Exercise";

        System.out.println(correct1.endsWith("se"));
        System.out.println(incorrect1.endsWith("se"));

        //13. Write a Java program to check whether two String objects contain the same data.
        System.out.println("Excercise 13");
        String exc13_1 = "Stephen Edwin King";
        String exc13_2 = "Walter Winchell";
        String exc13_3 = "stephen edwin king";

        System.out.println(exc13_1.equals(exc13_2));
        System.out.println(exc13_1.equals(exc13_3));

        //14. Write a Java program to compare a given string to another string, ignoring case considerations.
        System.out.println("Excercise 14");

        String exc14_1 = "Stephen Edwin King";
        String exc14_2 = "Walter Winchell";
        String exc14_3 = "stephen edwin king";

        System.out.println(exc13_1.equalsIgnoreCase(exc13_2));
        System.out.println(exc13_1.equalsIgnoreCase(exc13_3));

        //15. Write a Java program to print the current date and time in the specified format.
        System.out.println("Excercise 15");

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
       // LocalDateTime ldt = LocalDateTime.now();
        //System.out.println(ldt + "before formatting");

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println(myDateObj + "before formatting");
        //formatting
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMMM-dd-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate + "After formatting");

        Calendar c = Calendar.getInstance();
        System.out.println("Current date and time:");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);















    }
}
