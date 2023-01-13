import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int noofgues;
    public int getNoofgues(){
        return noofgues;
    }
    public void setNoofgues(int noofgues){
        this.noofgues=noofgues;
    }

     game(){
        Random rand=new Random();
       this.number= rand.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
      inputnumber= sc.nextInt();
    }
    boolean iscorrectnumber(){
        if (inputnumber==number){
            return true;
        }
        else if (inputnumber<number){
            System.out.println("too low..");
        }
        else if (inputnumber>number){
            System.out.println("too high..");
        }
        return false;
    }
}
public class Guessthenumber {
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while(!b) {


            g.takeuserinput();
            b = g.iscorrectnumber();
            System.out.println(b);
        }
    }
}
