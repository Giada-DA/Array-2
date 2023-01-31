import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        String aliceToDos[] = new String[]{"Coding", "Reading", "Learning"};
        String bobToDos[] = new String[]{"Reading", "Coding", "Learning", "Sleeping"};
        String timToDos[] = new String[]{"Reading", "Learning", "Coding"};
        //alice array è uguale a bob array? -> false
        System.out.println("Is Alice's array equal to Bob array? " + aliceToDos.equals(bobToDos));
        //alice array è uguale a tim array? -> false
        System.out.println("Is Alice's array equal to Tim array? " + aliceToDos.equals(timToDos));
        //lunghezza alice array è uguale a lunghezza bob array? -> false
        boolean a = aliceToDos.length == bobToDos.length;
        System.out.println("Is Alice's array having the same length of Bob's array? " + a);
        //lunghezza alice array è uguale a lunghezza tim array? -> false
        System.out.println("Is Alice's array having the same length of Tim's array? " + (aliceToDos.length == bobToDos.length));

        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);
        //alice ha gli stessi elementi di bob? -> false
        System.out.println("Is Alice having the same tasks of Bob? " + Arrays.deepEquals(aliceToDos, bobToDos));
        //alice ha gli stessi elementi di bob? -> true
        System.out.println("Is Alice having the same tasks of Bob? " + Arrays.deepEquals(aliceToDos, timToDos));
    }
}
