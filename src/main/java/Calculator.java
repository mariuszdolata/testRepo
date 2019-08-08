public class Calculator {

    public int add(int f, int s){
        return f+s;
    }

    public int substraction(int f, int s){
        return f-s;
    }

    public int multiplication(int f, int s){
        return f*s;
    }

    public float devision(int f, int s) throws IllegalArgumentException{
        if(s== 0) throw new IllegalArgumentException( "Argument divisor cannot be 0!");
        return f/s;
    }


}
