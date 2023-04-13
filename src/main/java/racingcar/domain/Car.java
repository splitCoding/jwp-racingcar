package racingcar.domain;

import java.util.Objects;

public class Car {

    private final Name name;
    private int position = 0;

    public Car(final String name, final int order) {
        this.name = new Name(name, order);
    }

    public void drive(int distance) {
        position += distance;
    }

    public boolean isWinner(int maxDistance) {
        return position == maxDistance;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name.getName();
    }

    public int getIdentifier() {
        return name.getIdentifier();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", position=" + position +
                '}';
    }
}
