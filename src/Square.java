import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Square {

    private int value;
    ArrayList<Integer> possibles;

    public Square() {
        this(0, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }
    public Square(int value, ArrayList<Integer> possibles) {
        this.value = value;
        this.possibles = possibles;
    }
    public int getValue() {
        return value;
    }

    public ArrayList<Integer> getPossibles() {
        return this.possibles;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPossibles(ArrayList<Integer> possibles) {
        this.possibles = possibles;
    }

    public void removePossible(int possible) {
        int index = possibles.indexOf((possible));
        possibles.remove(index);
    }
    // may need an addPossible here, but if we do it correctly when initializing all of these, don't think that should be necessary.
}
