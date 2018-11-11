import java.util.Hashtable;
import static java.lang.Math.pow;

public class main {

    public static void main(String[] args){
        excel("AB");
    }

    public static void excel(String s ){
        char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Hashtable<Character,Integer> h = new Hashtable<>();
        int count = 0;
        double total= 0;
        for(int i =0;i<letters.length;i++){
            h.put(letters[i],i+1);
        }



        for(int i = s.length()-1;i>=0;i--){
            if(count == 0){
                int  x = h.get(s.charAt(i));
                total += x;
            }
            else {
                double x = h.get(s.charAt(i));
                x = x * pow(26, count) ;
                total += x ;
            }
            count++;

        }
        int intTotal = (int) Math.round(total);
        System.out.println(intTotal);
    }
}
