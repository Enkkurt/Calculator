public class Math {

    public static void main(String[] args) {
        System.out.println("Math Class");
        int num1 = 4;
        int num2 = 18;

        int numSum = num1+num2 %2;

        boolean check = numSum == 0;

        System.out.println(check);
    }


    public static double subtract(double num1 , double num2){

        return num1-num2;

    }
}

