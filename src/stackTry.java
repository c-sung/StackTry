/**
 * Created by jamesbaloney on 2017/7/10.
 */
import java.util.Stack;
import java.util.Scanner;
public class stackTry {
    static Scanner sc = new Scanner(System.in);
    static boolean emp,wh1,wh2;
    static Stack in = new Stack();
    public static void main(String[] args){
        wh1=true;
        wh2=true;
        System.out.println("Please enter end when finished saving data");
        while(wh1){
            in.push(sc.next());
            if(in.peek().equals("end")){
                wh1=false;
                in.pop();
            }
        }
        System.out.println("seikou");

        while(true){
            emp=in.empty() ;
            if(emp==false){
                System.out.print(in.pop()+"\t");
            } else{
                System.exit(0);
            }

        }


    }
}
