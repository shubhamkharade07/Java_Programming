
class Demo {

    public int i;                            //Instance variable
    static public int j;               //class variable

    static {
        j = 21;
    }

    public Demo() {
        this.i = 11;
    }

    public void fun() {                             //Instance Method
        System.out.println("fun i :" + this.i);
        System.out.println("fun j :" + Demo.j);
    }

    static public void gun() {                          //class Method
        // System.out.println("gun i :" + this.i);          //Not Allowed
        System.out.println("gun j :" + Demo.j);
    }

}

class StaticBlock {

    public static void main(String A[]) {

        Demo.gun();                                //static Method call

        System.out.println(Demo.j);               //static characteristics call

        Demo dobj = new Demo();

        System.out.println(dobj.i);

        dobj.fun();

    }
}
