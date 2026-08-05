package Interfaces;

abstract class NSAM{
    abstract void cse_dept();
    void com_dept(){
        System.out.println("from com_dept");
    }
}
class students extends NSAM{
    void cse_dept(){
        System.out.println("from cse");
    }
}
public class a2 {
    public static void main(String[]args){
        students s=new students();
        s.cse_dept();
        s.com_dept();
    }
}
