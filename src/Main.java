import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HDFCAccount hdfcAccount1=new HDFCAccount("Sacin",1000, "123abc");
        System.out.println("Congras !"+hdfcAccount1.getName()+
                " Your Account has been made successfully with account No : "+
                hdfcAccount1.getAccountNo());

        HDFCAccount hdfcAccount2=new HDFCAccount("Abhi",2000, "123");
        System.out.println("Congras !"+hdfcAccount2.getName()+
                " Your Account has been made successfully with account No : "+
                hdfcAccount2.getAccountNo());

        System.out.println("Your money has been added Successfully ans your current amount is : "
                +hdfcAccount1.addMoney(100000));

        System.out.println(hdfcAccount1.withdrawMoney("123abc", 50000));

        System.out.println(hdfcAccount2.withdrawMoney("123", 50000));

        System.out.println(hdfcAccount1.fetchBalance("123abc"));
        System.out.println(hdfcAccount1.changePassword("abc123", "123abc"));

        int pow=sc.nextInt();

        System.out.println("your total Interest is:"+hdfcAccount1.calculateInterest(pow));
    }
}