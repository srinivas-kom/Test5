package org.example;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "Hollywood";
        int count;

        //Converts given string into character array
        char[] string = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            count =1;
            for (int j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j] && string[i]!=' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = 0;
                }

            }
            if(count>1 && string[i]!=0){
                System.out.println(string[i]);
            }

        }

    }
}