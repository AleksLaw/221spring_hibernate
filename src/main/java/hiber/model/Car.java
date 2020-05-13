package hiber.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component()
@Entity
@Table(name = "cars")


public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    String name;

    @Column(name = "series")
    int series;

    public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car id=" + id + ", name='" + name + ", series=" + series;
    }
}
