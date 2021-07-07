public class test {
    public  static boolean ismi(int n){
        if (n==1||n==0) return true;
        if (n%2==0){
            return ismi(n/2);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(ismi(20));
    }
}
