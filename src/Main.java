
public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Workers workers = new Workers(listener, errorListener);
        workers.start();
    }
}