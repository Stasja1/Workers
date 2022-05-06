import java.util.function.*;

public class Workers {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Workers(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Attention! Task " + i + " with an error ");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}