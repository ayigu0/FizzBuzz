package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(5));
    }

    public static int reduce(int n){
        int result = 0;
        if(n == 0){
            return result;
        }
        else if(n % 2 == 0){
            result = reduce(n / 2);
        } else{
            result = reduce(n - 1);
        }
        return result + 1;
    }
    //good job on using the recursion! you are a fking genius!

}
