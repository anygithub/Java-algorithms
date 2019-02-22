package two;

import java.util.Random;

public class Mass {
    private int[] mass;
    private int size;

    public Mass(int size) {
        this.size = 0;
        this.mass = new int[size];
    }

    public void display() {
        for (int i = 0; i < this.getSize(); i++) {
            System.out.print(mass[i] + " ");
        }
    }

    public int getEl(int i) {
        return mass[i];
    }

    public void setEl(int i, int el) {
        mass[i] = el;
    }

    public void insert(int value) {
        mass[size] = value;
        size++;
    }

    public int[] delEl(int el) {
        int i = 0;
        for (i = 0; i < mass.length; i++) {
            if (mass[i] == el) break;
        }
        for (int j = i; j < mass.length - 1; j++) {
            mass[j] = mass[j + 1];
        }
        size--;
        return mass;
    }

    public int getSize() {
        return size;
    }

    /**
     * Линейный
     *
     * @param value
     * @return
     */
    public boolean isFind(int value) {
        int i;
        for (i = 0; i < size; i++) {
            if (mass[i] == value) break;
        }
        if (i == size) {
            return false;
        } else return true;
    }

    public boolean isBinaryFind(int value) {
        int low = 0;
        int high = size - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (value == mass[mid]) return true;
            else {
                if (value < mass[mid]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }

    /**
     * Заполнить массив произвольными числами
     */
    public void fillArrayWithRandNum(int arrSize) {
        Random random = new Random();
        for (int i = 0; i < arrSize; i++) {
            this.insert(random.nextInt(100));
        }
    }

    /**
     * Копировать элементы массива в массив arr2
     * @param arr2
     */
    public void copyArray(Mass arr2) {
        for (int i = 0; i < this.getSize(); i++) {
            arr2.insert(this.getEl(i));
        }
    }
}
