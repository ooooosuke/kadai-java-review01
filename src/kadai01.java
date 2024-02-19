
public class kadai01 {

    public static void main(String[] args) {
        int price = 1500;
        double rate = 0.1;
        int tax;
        tax = taxMethod(price,rate);
        int total = price+ tax;   
        
       System.out.println(price+"円の商品の税込み価格は"+total+"円(消費税は"+tax+"円)です");
    
     }
    
    public static int taxMethod(int price,double rate) {
        
        int tax = (int)(price*rate);
        return tax;
         
    }

}
