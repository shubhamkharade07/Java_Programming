
import java.util.Scanner;

class Operator {

    public int iNo1;
    public int iNo2;

    public Operator(int a, int b) {
        this.iNo1 = a;
        this.iNo2 = b;
    }

    public int Addition() {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

    public int Subtraction() {
        int iAns = 0;
        iAns = iNo1 - iNo2;
        return iAns;
    }

    public int Multiplication() {
        int iAns = 0;
        iAns = iNo1 * iNo2;
        return iAns;
    }

    public int Division() {

        if (iNo2 < iNo1) {

            int iAns = 0;
            iAns = iNo1 / iNo2;
            return iAns;
        } else {
            System.out.println("Not Divisible");
        }
        return 0;
    }

}

class Calculator {

    public static void main(String A[]) {

        Scanner sc = new Scanner(System.in);

        int iRet = 0;

        System.out.println("Enter your First number:");
        int i = sc.nextInt();

        System.out.println("Enter your Second number:");
        int j = sc.nextInt();

        Operator obj1 = new Operator(i, j);

        System.out.println("Select the operator:\n" + "1 = + \n" + "2 = - \n" + "3 = * \n" + "4 = / \n");
        int eOperator = sc.nextInt();

        switch (eOperator) {
            case 1:
                iRet = obj1.Addition();
                System.out.println("Calculated Output is:" + iRet);
                break;

            case 2:
                iRet = obj1.Subtraction();
                System.out.println("Calculated Output is:" + iRet);
                break;

            case 3:
                iRet = obj1.Multiplication();
                System.out.println("Calculated Output is:" + iRet);
                break;

            case 4:
                iRet = obj1.Division();
                System.out.println("Calculated Output is:" + iRet);
                break;

        }

    }
}
