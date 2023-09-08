import java.util.ArrayList;

public class ModArrayList<X> extends ArrayList<X> {

    public X getUsingMod(int index) {

        try {
            return this.get(index);
        }
        catch(IndexOutOfBoundsException e) {
            int adjustedIndex = Math.abs(index) % this.size();
            return this.get(adjustedIndex);
        }
    }
}