package com.util;

import java.io.*;
import java.util.*;

public class Solution {

	   public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	     Scanner sc=new Scanner(System.in);
	        System.out.println("entet how many no u want to add");
	        int a=sc.nextInt();
	        List list=new ArrayList();
	        for(int i=0;i<a;i++){
	            int b=sc.nextInt();
	            list.add(b);
	        }
	        System.out.println("enter no of qurry");
	        int q=sc.nextInt();
	        System.out.println("enter qury 1");
	       String qry=sc.next();
	       
	        if(qry.equalsIgnoreCase("insert"))
	        {
	            int i=sc.nextInt();
	            
	            int j=sc.nextInt();
	            if(i<list.size())
	            list.add(i,j);
	            else 
	            	System.out.println("invalid input ");
	                            
	        }
	        else{
	            System.exit(0);
	        }
	        System.out.println("enter query2");
	        String qry1=sc.next();
	        if(qry1.equalsIgnoreCase("delete")) {
	        	int i=sc.nextInt();
	        	if(i<list.size())
	        	list.remove(i);
	        	else
	        	System.out.println("invalid input");
	        }
	        	
	        System.out.println(list);
	       for (Object object : list) {
			
		} 	
	        	
	    }
	}