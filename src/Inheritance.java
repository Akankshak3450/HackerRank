import java.util.Scanner;

public class Inheritance {
    String firstname;
    String lastname;
    int ID;
    int arr[];
    public Inheritance(String firstName, String lastName, int identification,int arr[]) {
        this.firstname= firstName;
        this.lastname = lastName;
        this.ID = identification;
        this.arr = arr;
    }

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String firstname = sc.next();
            String lastname = sc.next();
            int ID =sc.nextInt();
            int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Student(firstname,lastname,ID,arr);
        System.out.println("Grade: "+calculate(n,arr));

//

    }
    public static void Student(String firstname, String lastname, int ID, int[] arr){
        System.out.println("Name: "+lastname+","+firstname);
        System.out.println("ID: "+ID);
    }

    public static char calculate(int n ,int arr[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        int grade = sum/n;
        char res=' ';
        if(grade<=100 && grade>=90){
            res ='O';
        }else if(grade<90 && grade>=80){
            res ='E';
        }else if(grade<80 && grade>=70) {
            res ='A';
        }else if(grade<70 && grade>=55) {
            res ='P';
        }else if(grade<55 && grade>=40) {
            res ='D';
        }else if(grade<40) {
            res ='T';
        }
        return res;
    }
}
