import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        University MFTI = new University("МФТИ",300,30,100);
        University MGU = new University("МГУ",350,35,120);
        University DVGUPS = new University("ДВГУПС",310,20,110);
        University SPBGU = new University("СПбГУ",500,33,115);
        University VSHE = new University("ВШЭ",150,27,150);
        University MGIMO = new University("МГИМО",100,29,112);
        University RUT = new University("РУТ",130,21,101);

        City Moscow = new City("Москва",1000);
        City SaintPetersburg = new City("Санк-Петербург", 900);
        City Khabarovsk = new City("Хабаровск", 800);
        City Dolgoprudniy = new City("Долгопрудный", 400);

        HashSet<University> humanitiesUniversity = new HashSet<>();
        HashSet<University> technicalUniversity = new HashSet<>();
        HashSet<City> cities = new HashSet<>();

        cities.add(Moscow);
        cities.add(SaintPetersburg);
        cities.add(Khabarovsk);
        cities.add(Dolgoprudniy);

        technicalUniversity.add(RUT);
        technicalUniversity.add(MFTI);
        technicalUniversity.add(MGU);
        technicalUniversity.add(DVGUPS);
        technicalUniversity.add(SPBGU);

        humanitiesUniversity.add(VSHE);
        humanitiesUniversity.add(MGIMO);
        humanitiesUniversity.add(MGU);
        humanitiesUniversity.add(SPBGU);

        HashSet<University> allUniversity = new HashSet<>();
        allUniversity.addAll(technicalUniversity);
        allUniversity.addAll(humanitiesUniversity);
        System.out.println(allUniversity);
        University.getInfo(allUniversity);

        HashSet<University> andUniversity = new HashSet<>(technicalUniversity);
        andUniversity.retainAll(humanitiesUniversity);
        System.out.println(andUniversity);
        University.getInfo(andUniversity);

        HashSet<University> orUniversity = new HashSet<>(allUniversity);
        orUniversity.removeAll(andUniversity);
        System.out.println(orUniversity);
        University.getInfo(orUniversity);

        HashMap<University,City> universityCity = new HashMap<>();

        universityCity.put(MGU,Moscow);
        universityCity.put(VSHE,Moscow);
        universityCity.put(RUT,Moscow);
        universityCity.put(MGIMO,Moscow);
        universityCity.put(MFTI,Dolgoprudniy);
        universityCity.put(DVGUPS,Khabarovsk);
        universityCity.put(SPBGU,SaintPetersburg);

        for (City city: cities) {
            City.cityInfo(universityCity,city);
        }
    }
}