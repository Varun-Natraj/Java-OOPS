import java.util.*;
public class Anagram {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0)
        {
            String s1 = sc.next();
            String s2 = sc.next();
            
            List<Character> list1 = new ArrayList<>();
            for (int i=0;i<s2.length();i++) {
                char ch=s2.charAt(i);
                list1.add(ch);
            }
            List<Character> list2 = new ArrayList<>();
            for (int i=0;i<s1.length();i++) {
                char c=s1.charAt(i);
                list2.add(c);
            }
            list1.sort(Comparator.naturalOrder());
            list2.sort(Comparator.naturalOrder());
            if(list1.equals(list2))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }   
            }
        }
        
    }