import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functions {
    public static void main(String[] args) {
        // calling a normal function.
        int increment = incrementByOne(1);
        System.out.println(increment);

//function
        Function<Integer, Integer> increment2= x->x+1;
        System.out.println(increment2.apply(2));

        //function
        Function<Integer,Integer> multiplyBy10= number->number*10;
       int multi= multiplyBy10.apply(3);
        System.out.println(multi);
//combining 2 functions
        Function<Integer, Integer>newMulAndIncre= increment2.andThen(multiplyBy10);
        System.out.println(newMulAndIncre.apply(2));

        // bi-function
        BiFunction<Integer,Integer,Integer> biFunction= (num1, num2)->(num1+1)*num2;
        System.out.println(biFunction.apply(3, 100));
    }

    //normal function
    static int incrementByOne(int num){
        return num+1;
    }
}
