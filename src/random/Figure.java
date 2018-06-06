package random;

import java.util.ArrayList;
import java.util.List;

public interface Figure {

    static Integer getPerimeter(List<Integer> sides) {
        return sides.stream().mapToInt(Integer::intValue).sum();
    }

}


class Run {

    public static void main(String... arg) {

        List<Integer> sides = new ArrayList<>();

        sides.add(100);
        sides.add(100);
        sides.add(100);

        int result = Figure.getPerimeter(sides);

        System.out.println("Perimeter is "+ result);

    }

}



