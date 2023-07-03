// Write a program to copy some charaters from string to character arrays

public class getChar
{
    public static void main(String arg[])
    {
        String s1 = "Hello this book is on Java";
        char Arr[] = new char[20];

        // copy characters from s1 into character array from 7th to 20th 
        s1.getChars(7, 20, Arr, 0);

        System.out.println(Arr);
    }
    
}
