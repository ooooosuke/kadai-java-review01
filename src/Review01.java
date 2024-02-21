
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double rate = 0.1;
        int salesTax;
        salesTax= tax(price,rate);
        int total = price+ salesTax;

       System.out.println(price+"円の商品の税込み価格は"+total+"円(消費税は"+salesTax+"円)です");

     }

    public static int tax(int price,double rate) {

        int salesTax = (int)(price*rate);
        return salesTax;

    }

}


