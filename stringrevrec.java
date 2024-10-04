public class stringrevrec {
    public static void rev(String s,int i){
    if(i==0){
        System.out.println(s.charAt(i));
        return;
    }

        System.out.print(s.charAt(i));
        rev(s,i-1);
    }
    public static void main(String[] args) {
        String s="bhanu";
        int i=s.length()-1;
        rev(s,i);
    }
}
