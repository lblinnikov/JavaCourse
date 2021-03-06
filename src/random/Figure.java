package random;

import java.util.ArrayList;
import java.util.List;

public interface Figure {

    public String getName();

    public Integer getPerimeter();

    public Integer getSidesNumber();
}


class Triangle extends AnyFigure {

    public Triangle(List<Integer> sides) {
        super(sides);
    }

    @Override
    public String getName() {
        return "TRIANGLE";
    }

    @Override
    public Integer getSidesNumber() {
        return 3;
    }
}

class Square extends AnyFigure {

    public Square(List<Integer> sides) {
        super(sides);
    }

    @Override
    public String getName() {
        return "SQUARE";
    }

    @Override
    public Integer getSidesNumber() {
        return 4;
    }
}

class Box extends AnyFigure {

    public Box(List<Integer> sides) {
        super(sides);
        if (!sides.stream().allMatch(it -> it.equals(sides.get(0)))) {
            throw new IllegalArgumentException("this is not proper " + getName().toLowerCase());
        }
    }

    @Override
    public String getName() {
        return "BOX";
    }

    @Override
    public Integer getSidesNumber() {
        return 4;
    }
}

abstract class AnyFigure implements Figure {
    protected final List<Integer> sides;

    protected AnyFigure(List<Integer> sides) {
        if (sides.size() != getSidesNumber()) {
            throw new IllegalArgumentException("this is not proper " + getName().toLowerCase());
        }
        this.sides = sides;
    }

    @Override
    public Integer getPerimeter() {
        return sides.stream().mapToInt(Integer::intValue).sum();
    }
}


class Run {
    public static void main(String... arg) {
        List<Integer> triangleSides = new ArrayList<>();

        List<Integer> boxSides = new ArrayList<>();

        boxSides.add(1);
        boxSides.add(1);
        boxSides.add(1);
        boxSides.add(1);

        Figure box = new Box(boxSides);

        triangleSides.add(100);
        triangleSides.add(10);
        triangleSides.add(1);

        Figure triangle = new Triangle(triangleSides);
        List<Integer> squareSides = new ArrayList<>();

        squareSides.add(100);
        squareSides.add(10);
        squareSides.add(1);
        squareSides.add(1);


        Figure square = new Square(squareSides);

        System.out.println("Perimeter triangle is " + triangle.getPerimeter());
        System.out.println("Perimeter square is " + square.getPerimeter());
        System.out.println("Perimeter box is " + box.getPerimeter());
    }
}




