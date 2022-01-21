import java.util.Arrays;

public class FloydTortoiseAndHare {
    public static void main(String[] args) {
        methodBrutForce(); // 399600 ns
        FloydMethod();  //1200 ns
        //I mean it's pretty amazing ... floyd amazing job !  clap clap !
    }

    public static int FloydMethod(){
        long startTime = System.nanoTime();
            int array[] = {1, 4, 3, 5, 6, 1, 2};
            int hare = 0, tortoise = 0;

            do {
                hare = array[array[hare]];
                tortoise = array[tortoise];
            }while (hare != tortoise);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);

        System.out.println("duration = " + duration);
        return array[hare];
    }

    public static int methodBrutForce(){
        //i even made it so that the duplicate is 1 so it finds it as fast as possible.
        long startTime = System.nanoTime();
            int array[] = {1, 4, 1, 3, 6, 5, 2};
            Arrays.sort(array);
            int duplicate=0;
            for(int i= 0; i<array.length-1;i++ ){
                if(array[i] == array[i+1])
                    duplicate = array[i];
            }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("duration = "+duration);
        return duplicate;
    }
}


