// Write a program to create a queue with Integer objects

import java.util.*;
import java.util.LinkedList;

import javax.management.Query;

public class Program7
{
    public static void main(String args[])
    {
        // create a linked list as Queue
        Queue<Integer> q = new LinkedList<>();

        // store integers from 1 - 5
        for(int i = 1; i <= 5; i++)
        {
            q.offer(i);
        }

        // retrive the elements from queue

        while(!q.isEmpty())
        {
            System.out.println(q.poll());
        }
    }
    
}
