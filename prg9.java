import java.util.*;
public class prg9 {
    public static void main(String[] args){
    String s1 = "listn";
    String s2 = "silent";
    if(isanagram(s1,s2)){
        System.out.println("Its an Anagram");
    }
    else{
        System.out.println("Not an anagram");
    }
}

public static boolean isanagram(String s1,String s2){
    if(s1.length() != s2.length()){
        return false;

    }
    int[] alp = new int[26];
    for(int i=0;i<s1.length();i++){
        alp[s1.charAt(i) - 'a']++;
        alp[s2.charAt(i)- 'a']--;


    }
    for(int count:alp){
        if(count!=0){
            return false;
        }
    }
    return true;
}



    
}



//time complexity = O(n)
//space complexity = O(26) = O(1) -> Constant
