import java.util.Scanner;

public class process {
    private static int totalmoney = 1000 ;
    int value;
    int quit;
    int i;// for switch case


    public void choicer(){
        System.out.println("Select what do you want.");
        System.out.println("1) Take Money");
        System.out.println("2) Deposit Money");
        System.out.println("3) Transfer Money");
        System.out.println("4) Show Total Money");
        System.out.println("5) Take Back The Card");
        Scanner task = new Scanner(System.in);
        i = task.nextInt();


        switch (i){
            case 1:
                takemoney();
                afterthanprocess();
                break;
            case 2:
                deposit();
                afterthanprocess();
                break;
            case 3:
                moneytransfer();
                afterthanprocess();
                break;
            case 4:
                showtotalmoney();
                afterthanprocess();
                break;
            case 5:
                takebackthecard();
                break;
            default:
                System.out.println("You was enter wrong value./nTry again");
                choicer();
                break;
        }


    }



    public void takemoney(){
        System.out.println("Enter the amount you want to receive");
        Scanner want = new Scanner(System.in);
        value=want.nextInt();
        if (value<totalmoney || value == totalmoney){
        totalmoney=totalmoney-value;
        }
        else
            System.out.println("You entered an invalid value");
        System.out.println("Total money: "+totalmoney);

    }

    public void deposit(){
        System.out.println("Enter the amount you want to deposit");
        Scanner want = new Scanner(System.in);
        value=want.nextInt();
        totalmoney=totalmoney+value;
        System.out.println("Total money: "+totalmoney);
    }

    public void showtotalmoney(){
        System.out.println("Total money is : "+totalmoney);
    }

    public void takebackthecard(){
        System.out.println("You can take back the card");
    }


    public void moneytransfer(){
        System.out.println("Enter the amount you want to transfer");
        Scanner want = new Scanner(System.in);
        value=want.nextInt();
        if (value<totalmoney || value == totalmoney){
            totalmoney=totalmoney-value;
        }
        else
            System.out.println("You entered an invalid value");
        System.out.println("Total money: "+totalmoney);
    }


    public void afterthanprocess(){

        Scanner forquit = new Scanner(System.in);
        System.out.println("Select the action you want to do");
        System.out.println("1) Continue");
        System.out.println("2) Quit");
        quit=forquit.nextInt();
        if (quit==1){
            choicer();
        }
        else if (quit==2) {
            takebackthecard();
            System.exit(0);
        }
    }



}
