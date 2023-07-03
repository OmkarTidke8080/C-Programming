// Write a program to use string methods

public class StringMethods
{
    public static void main(String srg[])
    {
        // we would create string in three ways

        // way 1 : Assigning group of characters to a string variable
        String s1 = "A Book On Java";

        // way 2 : By creating object to a string class
        String s2  = new String("I Like it");

        // way 3 : by creating character array
        char Arr[] = {'P','r','o','f','e','s','s','o','r'};
        String s3  = new String(Arr);

        // Display all three String
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // find length of all three strings individually
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());

        // Concatenate all three string
        System.out.println(s1+s2+s3);

        // compare two string
        System.out.println(s1.compareTo(s3));
        
        // check if two strings are equal
        System.out.println(s1.equals(s2));

        // extract substring from s2
        String p = s2.substring(0, 6);
        System.out.println(p);





    }
}