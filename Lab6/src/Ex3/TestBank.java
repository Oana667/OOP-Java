package Ex3;

public class TestBank {
    public static void main(String[]args){
        Bank bank=new Bank();
        for(int i=0; i<10; i++){
            bank.addAccount("Owner"+(i+1),10.50*i);

        }
        System.out.println(bank.getAccount("Owner2"));
        System.out.println(bank.getAccount("Owner7"));
        System.out.println(bank.getAccount("Owner11"));
        System.out.println("\n");
        bank.printAccounts();
        System.out.println(("\n"));
        bank.printAccounts(30, 80);
    }
}
