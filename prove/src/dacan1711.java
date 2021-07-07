import java.util.ArrayList;
import java.util.List;

public class dacan1711 {

    public static List<Integer> countPairs(int[] deliciousness) {
        int sum=0;
        int []b=new int[]{};
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> list1=new ArrayList<Integer>();
        for (int i=0;i<deliciousness.length-1;i++){
            for (int j=i+1;j<deliciousness.length;j++){
                int a=deliciousness[i]+deliciousness[j];
                list.add(a);
                if (ismi(a)==true){
                    list1.add(a);
                    sum=sum+1;
                }continue;
            }
        }
        list1.add(sum);
        return list1;
    }

    public  static boolean ismi(int n){
        if (n==1) return true;
        if (n%2==0&&n!=0){
            return ismi(n/2);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(1);
        int [] nums=new int[]{2160,1936,3,29,27,5,2503,1593,2,0,16,0,3860,28908,6,2,15,49,6246,1946,23,105,7996,196,0,2,55,457,5,3,924,7268,16,48,4,0,12,116,2628,1468};
        /*int []b=countPairs(nums);*/
        List<Integer> list=new ArrayList<Integer>();
        list=countPairs(nums);
        System.out.println(list);
    }
}
