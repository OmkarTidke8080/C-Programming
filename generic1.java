

class generic1
{
    public static <T> void  Display(T []Arr)
    {
        for(T no : Arr)
        {
            System.out.println(no);
        }
    }
    public static void main(String arg[])
    {
        Integer A[] = {10,20,30,40};
        Float   B[]   = {50.21f,60.25f,40.30f};
        Double  C[]  = {50.45,60.25,40.12};


        Display(A);
        Display(B);
        Display(C);


    }
}






