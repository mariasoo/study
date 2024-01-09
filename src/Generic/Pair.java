package Generic;

public class Pair<T, U> {
    private T t;
    private U u;

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }
    public Pair(T t, U u) {
        this.t = t;
        this.u = u;
    }

}
