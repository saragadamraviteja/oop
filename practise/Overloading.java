public class Overloading{
    public int a = 5;
    public int b = 10;
    
    public static void main(String args[]){

        int c = add(a,b);
    }
    int a,b;
    public int add(int a, int b) {
        return a+b;
    }
    public float add(int a, float b) {
        return a+b;
    }
    public float add(float a, float b) {
        return a+b;
    }
    public String add(String a, String b) {
        return a+b;
    }
    
}