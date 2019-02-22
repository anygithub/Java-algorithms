package two;


import static two.Sort.sortBubble;


public class App {
    public static void main(String[] args) {

        Mass array = new Mass(1000);
        Mass array1 = new Mass(1000);
        Mass array2 = new Mass(1000);

        array.fillArrayWithRandNum(1000);
        array.copyArray(array1);
        array.copyArray(array2);

        //Сортировка пузырьком
        long startTime = System.currentTimeMillis();
        sortBubble(array);
        long endTime = System.currentTimeMillis();
        long diff = endTime - startTime;
        System.out.println("Время сортировки пузырьком: " + diff + " миллисекунд");

        //Сортировка вставками
        long startTime1 = System.currentTimeMillis();
        sortInsert(array1);
        long endTime1 = System.currentTimeMillis();
        long diff1 = endTime1 - startTime1;
        System.out.println("Время сортировки вставками: " + diff1 + " миллисекунд");

        //Сортировка выбором
        long startTime2 = System.currentTimeMillis();
        sortSelect(array2);
        long endTime2 = System.currentTimeMillis();
        long diff2 = endTime2 - startTime2;
        System.out.println("Время сортировки выбором: " + diff2 + " миллисекунд");

    }



}
