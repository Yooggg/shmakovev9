import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class City {
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return population == city.population && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    public static void cityInfo(HashMap<University,City> a, City city){
        int stud = 0;

        for (Map.Entry<University,City> b : a.entrySet()) {
            if (b.getValue().equals(city)){
                stud += b.getKey().getStudentsNumber();
            }
        }
        System.out.println(city.name + ": " + "на " + city.population +" житилей приходится " + stud + " студентов");
    }
}
