public class TestVarArgs {
    static int sum(int... arr) {
        //Available as int[] arr
        int result = 0;
        for (int a : arr) {
        result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("nothing will print "+ sum());
        System.out.println("The sum:"+ sum(2));
        System.out.println("The sum:"+ sum(1,3));
        System.out.println("The sum:"+ sum(2,4,3));
        System.out.println("The sum:"+ sum(3,5,3,4));
        System.out.println("The sum:"+ sum(4,7,3,6,2,1));
    }
}
