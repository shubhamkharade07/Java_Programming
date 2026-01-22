
class Arithmetic {

    public int iNo1;
    public int iNo2;

    public Arithmetic() {
        this.iNo1 = 0;
        this.iNo2 = 0;
    }

    public Arithmetic(int i, int j) {
        this.iNo1 = i;
        this.iNo2 = j;
    }

    public int Addition() {
        int iAns = 0;
        iAns = this.iNo1 + this.iNo2;
        return iAns;
    }

    public int Subtraction() {
        int iAns = 0;
        iAns = this.iNo1 - this.iNo2;
        return iAns;
    }

}

class OOPX {

    public static void main(String A[]) {

        int iRet = 0;

        Arithmetic aobj1 = new Arithmetic(21, 20);

        iRet = aobj1.Addition();
        System.out.println("Addition is:" + iRet);  //cout<<"Addition is:"<<iRet;

        iRet = aobj1.Subtraction();
        System.out.println("Subtraction is:" + iRet);  //cout<<"Subtraction is:"<<iRet;

        aobj1 = null;

    }
}
