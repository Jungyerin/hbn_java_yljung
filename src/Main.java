import java.util.stream.Stream;

public class Main {

    public static void main(){
        sequentialSum(10);
        iterativeSum(10);
        parallelSum(10);

    }

    public static long sequentialSum(long n){
        return Stream.iterate(1L, i->i+1)
                .limit(n)
                .reduce(0L,Long::sum);
    }

    public static long iterativeSum(long n){
        long result = 0;
        for(long i= 1L;i<=n ; i++){
            result += 1;
        }
        return result;
    }

    public static long parallelSum(long n){
        return Stream.iterate(1L,i->i+1)
                        .limit(n)
                        .parallel()
                        .reduce(0L,Long::sum);
    }
}
