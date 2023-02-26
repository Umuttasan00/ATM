import java.util.Scanner;

public class safety {

    static int pinn;// this one is real password
    static int pinn2; //this one is the 'taken from customer'
    int chance=3;// this one is wrong password chance
    boolean safe; //it's for is safe or not


    public void selectpinn(){
        int m=0;
        int r;
        System.out.println("Enter your pinn. Pinn must 4 character (Number).");
        Scanner wanna = new Scanner(System.in);
        pinn=wanna.nextInt();
        r=pinn;
        while(r > 0) {
            r /= 10;
            m++;
        }
        if (m==4){
            System.out.println("Pinn created successfully");
        }
        else {
            System.out.println("Try again");
            selectpinn();
        }
    }

    public void login(){
        System.out.println("Enter your password.");
        Scanner wanna2 = new Scanner(System.in);
        pinn2=wanna2.nextInt();
        chance=chance-1;
        if (pinn==pinn2){
            System.out.println("Log in is successfull !!");
            safe=true; // that's means is "that's true customers"
        }
        else if(chance>0 && pinn!=pinn2){
            System.out.println("Wrong password.Try again.You have "+chance+" more chance.");
            login();
        }
        else if(chance==0){
            System.out.println("Wrong password !!!");
            safe=false; // that's means is "that's wrong customers"
            //System.exit(0);
        }
    }




}
