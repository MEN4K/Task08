import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainList {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        IntList intList = new IntListImpl();

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            intList.add(num);
        }

        intList.insert(2, 33);
        intList.insert(3, 36);
        intList.insert(1, 34);

        printIntList(intList);

        intList.set(3, 22);

        printIntList(intList);

        System.out.println(intList.capacity());

        System.out.println(intList.getIndexByValue(7));

        System.out.println(intList.contains(33));

        intList.removeValue(1);
        intList.removeByIndex(2);

        printIntList(intList);
        System.out.println(intList.capacity());

        IntList list2 = intList.subList(2, 4);

        printIntList(list2);


    }

    public static void printIntList(IntList intList){

        System.out.print("[ ");

        for (int i = 0; i < intList.size(); i++){
            if (i == intList.size() - 1){
                System.out.print(intList.getByIndex(i) + " ");
                continue;
            }
            System.out.print(intList.getByIndex(i) +", ");
        }
        System.out.print("]\n");
    }
}

