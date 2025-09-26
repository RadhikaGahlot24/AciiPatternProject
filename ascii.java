import javax.swing.*;
import java.util.*;
public class ascii 
{
    String s[][]={
                {" XXX  XXXX   XXX  XXXX  XXXXX XXXXX  XXX  X   X XXXXX XXXXX X   X X     XX XX X   X  XXX  XXXX   XXX  XXXX  XXXXX XXXXX X   X X   X X   X X   X X   X XXXXX "},
                {"X   X X   X X   X X   X X     X     X   X X   X   X     X   X  X  X     XX XX XX  X X   X X   X X   X X   X X       X   X   X X   X X   X  X X   X X     X  "},
                {"X   X XXXX  X     X   X XXXX  XXXX  X     XXXXX   X     X   XX    X     X X X X X X X   X XXXX  X   X XXXX  XXXXX   X   X   X X   X X X X   X     X     X   "},
                {"XXXXX X   X X   X X   X X     X     X X X X   X   X   X X   X X   X     X   X X  XX X   X X     X  XX X  X      X   X   X   X X   X XX XX  X X   X     X    "},
                {"X   X XXXX   XXX  XXXX  XXXXX X     X X X X   X XXXXX  XX   X   X XXXXX X   X X   X  XXX  X      XXX  X   X XXXXX   X    XXX    X   X   X X   X  X     XXXXX "}
            };
            char c[];
     public static void main(String args[]) {
        MainModule();
     }   
     void letter()
     {
        // char c[];
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the Letter (a-z) -- ");
            String s1 = in.nextLine();
            int i,j,cnt;
            int p = Character.toUpperCase(s1.charAt(0))-64;
            cnt = 6*(p-1);
            for (i = 0 ; i < 5 ; i++){
                c = String.valueOf(s[i][0]).toCharArray();
                for (j = cnt ; j < cnt+6 ; j++){
                    System.out.print(c[j]);
                }
                System.out.println();
            }
     }
     void word()
     {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String -- ");
        String s1 = in.nextLine();
        int i,j,cnt,p;
        for (i = 0 ; i < 5 ; i++){
            for (int k = 0 ; k < s1.length() ; k++){
                p = Character.toUpperCase(s1.charAt(k)) - 64;
                cnt = 6 * (p-1);
                c = String.valueOf(s[i][0]).toCharArray();
                for (j = cnt ; j < cnt + 6 ; j++){
                    System.out.print(c[j]);
                }
            }
            System.out.println();
        }
     }
     void range()
     {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Range (a-z) -- ");
        String s1 = in.nextLine();
        for (int i = 0 ; i < 5 ; i++){
            int start = Character.toUpperCase(s1.charAt(0))-64;
            int end = Character.toUpperCase(s1.charAt(2))-64;
            c = String.valueOf(s[i][0]).toCharArray();
            for (int j = (6 * (start - 1)) ; j < (6 * (end - 1) + 6) ; j++){
                System.out.print(c[j]);
            }
            System.out.println();
        }
     }
     static void MainModule()
     {
        System.out.println("Ascii Project");
        System.out.println("1.Letter\t2.Word\t3.Range");
        String c;
        System.out.println("Choose any one of them...");
        c = JOptionPane.showInputDialog("Enter your choice -- ");
        ascii p = new ascii();
        if (c.equals("1")){
            p.letter();
        }
        else if (c.equals("2")){
            p.word();
        }
        else if (c.equals("3")){
            p.range();
        }
        System.out.println("\n Do you want to continue.. press 1 else any key");
        c = JOptionPane.showInputDialog("Enter your choice -- ");
        if (c.equals("1")){
            MainModule();
        }
        
     }

}