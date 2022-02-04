public class MultiplyByTen {
    public static void main(String[] args){
        for(String s : args){
            System.out.print(multiplyByTen(Integer.parseInt(s)) + " ");
        }
    }

    public static int multiplyByTen(int n){
        return n * 10;
    }
}