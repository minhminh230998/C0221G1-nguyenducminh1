package com.example.aop;



public class bac {


    public static void main(String[] args) {
        int[] mangDem = new int[Character.MAX_VALUE];
        String str = "aabbcaa";

        for(int i=0;i<str.length();i++){
            try{

                mangDem[str.charAt(i)]++;
                System.out.println(mangDem[str.charAt(i)]);
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("index over limit");
            }
        }
        for(int i=0;i<mangDem.length;i++){
          if(mangDem[i]>1){
                System.out.println((char)i);
           }
        }

    }
}
