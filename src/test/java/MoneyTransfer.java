public class MoneyTransfer {
    public static void main(String[] args) {
        int currentAccount = 2_000_000_000;
        long sumTransfer = 500_000_000;
        long sum = (currentAccount + sumTransfer);
        System.out.println(sum);


        {
            double regularBonus = 0.3;
            double specialBonus = 0.6;
            double totalBonus = regularBonus + specialBonus;
            System.out.println(totalBonus);
        }
    }
}