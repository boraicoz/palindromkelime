import java.util.Scanner;

public class PalindromKelime {

private static boolean check(String word){
    for(int i=0,j=word.length()-1;i<=j;i++,j--)
    {
        if(word.charAt(i)!=word.charAt(j))
        {
            return false;
        }

    }
    return true;
}
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
        System.out.print("Kelimeyi Giriniz:");
        String word=in.next();
        System.out.println(check(word)?"Palindrom":"Palindrom Degil");
    }
}
