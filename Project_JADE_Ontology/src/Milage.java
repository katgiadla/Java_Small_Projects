import jade.content.Concept;

public class Milage implements Concept {
    private Integer _interval = 0;
    private String _measurementUnit = "Unit";

    public Integer get_interval() {
        return _interval;
    }

    public void set_interval(Integer _interval) {
        this._interval = _interval;
    }

    public String get_measurementUnit() {
        return _measurementUnit;
    }

    public void set_measurementUnit(String _measurementUnit) {
        this._measurementUnit = _measurementUnit;
    }
}
