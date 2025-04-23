package Day_1.Practice;

import java.util.*;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();

        float area = 3.14f * radius * radius;
        // this f convert value into float value because java take value as double by
        // default

        System.out.println(area);

        sc.close();

    }

}
