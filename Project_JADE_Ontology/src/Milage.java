import jade.content.Concept;

public class Milage implements Concept {
    private Integer _interval;
    private String _measurementUnit = "Unit";

    public Integer getInterval() {
        return _interval;
    }

    public void setInterval(Integer _interval) {
        this._interval = _interval;
    }

    public String getMeasurementUnit() {
        return _measurementUnit;
    }

    public void setMeasurementUnit(String _measurementUnit) {
        this._measurementUnit = _measurementUnit;
    }
}
