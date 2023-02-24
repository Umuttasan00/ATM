public class Main {
    public static void main(String[] args) {



        safety deneme = new safety();
        process pop = new process();
        deneme.selectpinn();
        deneme.login();


        if(deneme.safe){
            // log in is successfull
            pop.choicer();
        }

        else{
            // log in is not successfull
            System.out.println("log in is not successfull");
        }
    }
}