public class Pgm{
    public static void main(String[] args) {
        int n=5;
    Pgm O=new Pgm();
        for(int i=0; i<n;i++){
        System.out.println(O.fib(i));
        
        }
    }
  public int fib(int i){
    if(i<=1){
        return i;
    }
    else {
        return fib(i-1) + fib(i-2);
    }
  }
}