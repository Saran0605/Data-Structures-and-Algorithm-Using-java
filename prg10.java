//Count and say problem
//by using recurssion function
public class prg10 {
    public static void main(String[] args){
        int n = 5;
        String s = count(n);
        System.out.println(s);
    }
    public static String count(int n){
        if(n==1){
            return "1";//base case
        }
        String pre = count(n-1);//recursive case
        return getseq(pre);//return to another method

    }
    public static String getseq(String pre){
        StringBuilder s = new StringBuilder();
        int i = 0;
        int len = pre.length();
        while(i<len){
            int count = 1;
            while(i+1 <len && pre.charAt(i)==pre.charAt(i+1)){
                count++;
                i++;
            }
            s.append(count).append(pre.charAt(i));
            i++;
        }
        return s.toString();
    }
    
}
