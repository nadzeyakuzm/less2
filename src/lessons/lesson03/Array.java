package lessons.lesson03;

public class Array {
    public static void main(String[] args) {
        int [] array = new int [5];
        array[1] = 1;
        array[2] = 5;
        array[3] = 15;
        array[4] = 100;
        for (int i = 0; i<5; i++)
            array[i] *=2;
        for (int i = 0; i<5; i++)
            System.out.println(array[i]);
        System.out.println(array)[3];
        System.out.println(array)[5];

    }


}
