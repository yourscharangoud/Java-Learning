class Add {
    public int add(int a, int b){
        int r = a + b;
        return r;
    }
}

public class Demo {
    public static void main(String[] args){
         Add calc = new Add();
         int result = calc.add(4,8);
         
         System.out.println(result);
         
    }
}