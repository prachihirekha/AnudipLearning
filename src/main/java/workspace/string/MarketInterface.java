package workspace.string;
interface Cash{// marker interface

}
interface Cheque{

}
class PaymentOne implements Cash{
    static  void paymentByCash(){
        System.out.println("payment done by cash");
    }

}
class PaymentTwo implements Cheque{
    //@Override //Annotation
     static  void paymentByCheque(){
        System.out.println("payment done by cheque");
    }
}

public class MarketInterface {
    public static void main(String[] args) {

    }
}


