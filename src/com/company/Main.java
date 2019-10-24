package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] array= new String[100];
	    for(int i = 0; i < array.length; i++){
	        array[i] = "open";
        }
	    for(int i = 0; i < array.length; i++){
	        if((i+1)%2 == 0){
	            if(array[i].equalsIgnoreCase("open")){
	                array[i] = "closed";
                }
	            else{
	                array[i] = "open";
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            if((i+1)%3 == 0){
                if(array[i].equalsIgnoreCase("open")){
                    array[i] = "closed";
                }
                else{
                    array[i] = "open";
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println((i+1) + " " + array[i]);
        }

    }
}
