package src.oops_concepts.class_relationships.association;

import java.util.*;

/**
 * There are two classes, namely, states and cities. These two separate classes
 * are associated through their Objects. Moreover, every city exists in exactly
 * one state, but a state can have many cities, hence the term “many-to-one”
 * relationship. Importantly, the association in Java has two special forms.
 */
class CityClass {
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return cityName;
    }
}

class State {
    private String stateName;

    List<CityClass> citys;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<CityClass> getCities() {
        return citys;
    }

    public void setState(List<CityClass> citys) {
        this.citys = citys;
    }

}

public class AssociationDemo {
    public static void main(String[] args) {
        State state = new State();
        state.setStateName("California");

        CityClass city = new CityClass();
        city.setCityName("Los Angeles");
        CityClass city2 = new CityClass();
        city2.setCityName("San Diago");

        List<CityClass> empList = new ArrayList<>();
        empList.add(city);
        empList.add(city2);

        state.setState(empList);

        System.out.println(state.getCities() + " are cities in the state " +
                state.getStateName());
    }
}
