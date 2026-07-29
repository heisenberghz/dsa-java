import java.security.spec.RSAOtherPrimeInfo;

public class A1 {
    public static void main(String[] args) {

        StringBuilder S1 = new StringBuilder("NSAM");
        System.out.println(S1);
        StringBuilder S2 = new StringBuilder("NSAM_bb");
        System.out.println(S2);

        StringBuilder S3 = new StringBuilder("NSAm is a ");
        System.out.println(S3);
        S3.append("of a college");
        System.out.println(S3);
        S3.insert(2,"abcd");
        System.out.println(S3);

        String S6="gooner";
        String S5=new String("madhusudan");
        System.out.println(S6+S5);

        String m="madhusudan hates girls";
        System.out.println(m.charAt(0));
        System.out.println(m.toLowerCase());
        System.out.println(m.toUpperCase());


    }
}
