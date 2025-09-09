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
    public static int reduce1(int n){
        int count = 0;
        int temp = n;
        while(true){
            if(temp == 0){
                return count;
            } else if (temp % 2 == 0) {
                temp /= 2;
                count++;
            }else {
                temp -= 1;
                count++;
            }
        }
    }

}
