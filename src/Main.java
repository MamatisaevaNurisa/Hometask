import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        int [] size = new int[50];

        for (int i = 0; i <size.length; i++) {
            size [i]= random.nextInt(100);
            arrayList.add(size[i]);

        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            Integer number = arrayList.get(i);
            if (number % 2 == 0) {
                list1.add(number);
            } else
                list2.add(number);
        }
        System.out.println(list1);
        System.out.println(list2);





    }


}
