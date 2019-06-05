import jade.content.Concept;

public class Milage implements Concept {
    private Integer interval = 0;
    private String measurementUnit = "Unit";

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }
}
