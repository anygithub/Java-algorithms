package two;

public class Sort {

    /**
     * Сортировка пузырьком
     * @param mass
     */
    public static void sortBubble(Mass mass) {
        int in, out;
        for (out = mass.getSize() - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (mass.getEl(in) > mass.getEl(in+1)) {
                    int temp = mass.getEl(in);
                    mass.setEl(in, mass.getEl(in+1));
                    mass.setEl(in+1, temp);
                }
            }
        }
    }

    /**
     * Сортировка выбором
     * @param mass
     */
    public static void sortSelect(Mass mass) {
        int out, in, mark;
        for (out = 0; out < mass.getSize(); out++) {
            mark = out;
            for (in = out + 1; in < mass.getSize(); in++) {
                if (mass.getEl(in) < mass.getEl(mark))
                    mark = in;
            }
            int temp = mass.getEl(out);
            mass.setEl(out,mass.getEl(mark));
            mass.setEl(mark,temp);
        }
    }

    /**
     * Сортировка вставками
     * @param mass
     */
    public static void sortInsert(Mass mass) {
        int in, out;
        for (out = 1; out < mass.getSize(); out++) {
            int temp = mass.getEl(out);
            in = out;
            while (in > 0 && mass.getEl(in-1) >= temp) {
                mass.setEl(in,mass.getEl(in - 1));
                --in;
            }
            mass.setEl(in,temp);
        }
    }

}
