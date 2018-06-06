package random;

import java.util.ArrayList;
import java.util.List;

public interface Figure {

    public Integer getPerimeter(List<Integer> sides);

}

class AnyFigure implements Figure {

    @Override
    public Integer getPerimeter(List<Integer> sides) {
        return sides.stream().mapToInt(Integer::intValue).sum();
    }

}

class Run {
    public static void main(String... arg) {

        AnyFigure abstractFigure = new AnyFigure();

        List<Integer> sides = new ArrayList<>();

        sides.add(100);
        sides.add(10);
        sides.add(1);

        int result = abstractFigure.getPerimeter(sides);

        System.out.println("Perimeter is "+ result);

    }
}




