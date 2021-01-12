import java.util.*;
class Game
{
    char a[]={'0','1','2','3','4','5','6','7','8','9'};int i;String s1;String s2;int e=0;int u=1;
    Scanner sc=new Scanner(System.in);
public static void main()
{
            int d1=0;char e1;
            while (d1!=1)
            {
                        Scanner in=new Scanner(System.in);
                        int b=0;int k=0;char b1;
                        Game obj=new Game();
                        System.out.println("Welcome Gamers");
                        System.out.println("Gamer 1 Enter Your Name");
                        s1=in.nextLine();
                        System.out.println("Gamer 2 Enter Your Name");
                        s2=in.nextLine();
                        System.out.println(a[0]+" | "+a[1]+" | "+a[2]);
                        System.out.println("----------");
                        System.out.println(a[3]+" | "+a[4]+" | "+a[5]);
                        System.out.println("----------");
                        System.out.println(a[6]+" | "+a[7]+" | "+a[8]);
                        System.out.println(s1+" Your Symbol Is 'X'");
                        System.out.println(s2+" Your Symbol Is 'O'"); 
                        for (i=1;i<=9;i=obj.check(b,k,s1,s2))
                        {           
                            if (i%2==1)
                            {    
                                System.out.println(s1+" Enter Your Position Where You Want 'X'");
                                b=sc.nextInt();
                                k=1;
                            }
                            else
                            {
                                System.out.println(s2+" Enter Your Position Where You Want 'O'");
                                b=sc.nextInt();
                                k=0;
                            }   
                        }   
                     
                        System.out.println("Press 'E' for Exit or 'F' playing again");
                        e1=sc.next().charAt(0);
                        if (e1=='e' || e1=='E')
                        System.exit(0);
                        else if (e1=='f' || e1=='F')
                        d1=0;
                        else
                        System.out.println("Wrong Choice");
    }
}
int check(int m,int n,String s3,String s4)
    {
        u++;
        if (a[m]!='X' && a[m]!='O')
        {
           if(n==1)
a[m]='X';
else
a[m]='O';
}
else
{
    u--;
System.out.println("Position is already filled please re-enter");
}
System.out.println(a[0]+" | "+a[1]+" | "+a[2]);
System.out.println("----------");
System.out.println(a[3]+" | "+a[4]+" | "+a[5]);
System.out.println("----------");
System.out.println(a[6]+" | "+a[7]+" | "+a[8]);
if ((a[0]=='X' && a[1]=='X' && a[2]=='X') || (a[3]=='X' && a[4]=='X' && a[5]=='X') || (a[6]=='X' && a[7]=='X' && a[8]=='X') || (a[0]=='X' && a[3]=='X' && a[6]=='X') ||(a[1]=='X' && a[4]=='X' && a[7]=='X') || (a[2]=='X' && a[5]=='X' && a[8]=='X') || (a[0]=='X' && a[4]=='X' && a[8]=='X') || (a[2]=='X' && a[4]=='X' && a[6]=='X'))
{
System.out.println(s3+" Wins!!!");
u=10;
}
else if((a[0]=='O' && a[1]=='O' && a[2]=='O') || (a[3]=='O' && a[4]=='O' && a[5]=='O') || (a[6]=='O' && a[7]=='O' && a[8]=='O') || (a[0]=='O' && a[3]=='O' && a[6]=='O') ||(a[1]=='O' && a[4]=='O' && a[7]=='O') || (a[2]=='O' && a[5]=='O' && a[8]=='O') || (a[0]=='O' && a[4]=='O' && a[8]=='O') || (a[2]=='O' && a[4]=='O' && a[6]=='O'))      
{
System.out.println(s4+" Wins!!!");
u=10;
}
else if (u>9)
{
System.out.println("Game Over.......No One Wins");
u=10;
}
return u;
}
}