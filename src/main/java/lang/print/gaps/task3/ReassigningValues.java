package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);

        int linkToFirst = first;
        int linkToSecond = second;
        int lingToThird = third;

        first = 15;
        second = 6;
        third = 4;

        System.out.println("linkToFirst = " + linkToFirst);
        System.out.println("linkToSecond = " + linkToSecond);
        System.out.println("lingToThird = " + lingToThird);

        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);


    }
}
