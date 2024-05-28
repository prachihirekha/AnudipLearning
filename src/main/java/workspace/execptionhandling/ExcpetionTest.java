package workspace.execptionhandling;
// MyException is a exception



class MYException extends Exception{
    private int ex;
    MYException(int a){
        ex=a;

    }

    @Override
    public String toString() {
        return "MYException{" +
                "ex=" + ex +
                "is less than 0}";
    }
}

public class ExcpetionTest {
    static void sum(int a, int b) throws MYException {
        if(a<0){
            throw new MYException(a);
        }else {
            System.out.println(a+b);
        }
    }

    public static void main(String[] args) {
            try{
                sum(-10,20);
            }catch (MYException e){
                System.out.println(e);
            }
    }
}


//represent the ojebect
// right chick source- generate toString()
// to srting method represent of object