package inheritance;

import com.sun.source.util.SourcePositions;

class nitte
{
    void display(){
        System.out.println("from nitte");
    }
}
class nsam extends nitte {
    void nsam_details() {
        System.out.println("from nsam");
    }
}
class jksim extends nitte{
    void jksim_details(){
        System.out.println("jkism");
    }
}
public class I1 {
    public static void main(String []args){
        nitte n=new nitte();
        nsam n2=new nsam();
        jksim n3=new jksim();
        n.display();
        n2.nsam_details();
        n3.jksim_details();




    }

}


