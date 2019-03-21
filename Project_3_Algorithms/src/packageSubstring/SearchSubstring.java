package packageSubstring;

import java.util.EmptyStackException;

public class SearchSubstring{
    int substring(String a, String b){
        if (b.length() == 0 || a.length() == 0){
            throw new EmptyStackException();
        }
        if (b.length() < a.length()){
            System.out.println("This strings can not be a substring.");
            int error = -1;
            return error;
        }
        if(!b.contains(a)){
            System.out.println("This strings can not be a substring.");
            int error = -1;
            return error;
        }
        int countOfStrings = 0;

        //check from longer string
        int i = 0;
        int j = 0;
        int k = 0; // count of compatibility points
        while(i < b.length()){
            while(j < a.length()){
                if(b.charAt(i) == a.charAt(j)){
                    j++;
                    k++;
                    i++;
                    break;
                } else { j++; }
                if(j == a.length()&& k!= 0){
                   countOfStrings++;
                   k = 0;
                }
            }
            }
        return countOfStrings;
        }
}

