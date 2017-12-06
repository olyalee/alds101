package part16;

/**
 * less than 1 hour
 */
public class Task161 {

    public static void swap(Value a, Value b){
        a.aPlusB(b);
        b.adjustB(a);
        a.adjustA(b);
    }
}

class Value{
    int data;

    public Value(int data){
        this.data = data;
    }

    void aPlusB(Value b){
        this.data += b.data;
    }

    void adjustB(Value a){
        this.data = a.data - this.data;
    }

    void adjustA(Value b){
        this.data = this.data - b.data;
    }
}
