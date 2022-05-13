import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        HashMap<String,Long> hm = new HashMap<>();
        for(int i=0;i<T;i++){
            String name = sc.next();
            Long nu =sc.nextLong();
            hm.put(name,nu);
        }
        System.out.println(hm);
        for (int i = 0; i < T; i++) {
            String nam = sc.next();
            if(hm.containsKey(nam)){
                System.out.println(nam +"="+hm.get(nam));
            }else {
                System.out.println("Not Found");
            }
        }
    }
}
