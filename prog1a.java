import java.util.Scanner;

public class prog1a {
    public static void main(String[] args) {
        double sal,DA,HRA,CCA,PF,PT,TAX,GINCOME,DEDUC,NET;
        Scanner s=new Scanner(System.in);
        System.out.println("enter name");
        String name=s.nextLine();
        System.out.println("enter id");
        int id=s.nextInt();
        System.out.println("enter salary");
       sal=s.nextDouble();
        DA=0.4*sal;
        HRA=0.*sal;
        CCA=250;
        PF=0.1*sal;
        PT=100;
        TAX=0.1*sal;
        GINCOME=sal+DA+HRA+CCA;
        DEDUC=PF+PT+TAX;
        NET=GINCOME-DEDUC;
        System.out.println("EMPLOYE:"+name+"id:"+id+"basic salary:"+sal);
        System.out.println("EMPLOYE:"+name+"id:"+id+"basic salary:"+NET);
    }





    }

