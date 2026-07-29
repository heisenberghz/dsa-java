public class a4 {
    public static void main(String[]args){
        bank b =new bank();
    }


    class bank{
        private double balance;
        int acc;
        String sc;
        private int pin;

        public void set_pic(int pin){}



        void deposit(int e_pin,double amount)
        {
            balance+=amount;
            System.out.println("amount credited");


        }

    }
}
