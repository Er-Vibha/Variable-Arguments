public class TestVarArgs1 {
    static int sum(int ...arr){
       int result=0;
        for (int a:arr ) {
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        //For each loop use
        for (int i : new int[]{sum(2, 3, 4), sum(5, 3, 2, 1), sum(2, 3, 1, 7, 4)}) 
        System.out.println("Sum is:" + i);
    }
}
