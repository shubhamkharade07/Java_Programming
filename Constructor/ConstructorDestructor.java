
class Demo {

    public int iNo1;
    public int iNo2;

    public Demo() {
        System.out.println("Inside Default Constructor..");
    }

    1
    public Demo(int i, int j) {
        System.out.println("Inside Parametrized Constructor");
    }

    protected void finalize() // ~Demo
    {
        System.out.println("Inside Finalize..");
    }

}

class ConstructorDestructor {

    public static void main(String A[]) {

        Demo dobj1 = new Demo();                       //Demo dobj1();
        Demo dobj2 = new Demo(11, 21);                 // Demo dobj2(11,21);

        dobj1 = null;
        dobj2 = null;

        System.gc();

        System.out.println("End of Main..!");

    }
}
