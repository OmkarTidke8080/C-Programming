class Multi3
{
    public static void main(String arg[])
    {
        Thread t = Thread.currentThread();
        System.out.println("Name of current Thread is "+t.getName());

        System.out.println("Priority of thread is "+t.getPriority());
        

    }
}