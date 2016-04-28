package al;

import java.util.Scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main 
{
	static int price;
	static int post;
	static int postF;
    public static void main( String[] args )
    { 
    	Scanner scanner=new Scanner(System.in);
    	price=scanner.nextInt();
    	post=scanner.nextInt();
    	int sum=price;
    	if(!isFreePost(price)){
    			sum+=post;
    		
    	}
    	sum+=redP(price);
    	System.out.println("顾客付款为"+sum);
    	
    }
    
    public static boolean isFreePost(int price){
    		if(price>=postF){
    			return true;
    		}
    		return false;
    }
    public static int redP(int price){
    		if(price>=100&&price<=300){
    			return 10;
    		}
    		else if(price>=300){
    			return 30;
    		}
    		return 0;
    }
}