package org.example;

public class UniqueChar {
    public static void main(String[] args) {
        String str = "Hollywood";

        for(int i = 0; i < str.length(); i++) {
            int flag = 0;
            for(int j = 0; j < str.length(); j++ ) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    flag = 1;
                    break;
                    //System.out.print(str.charAt(i) + " ");
                }
            }
                if(flag == 0) {
                    System.out.println(str.charAt(i));
                }
            }

        }

    }

