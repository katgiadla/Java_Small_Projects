import jade.content.Concept;

public class Car implements Concept {
    private String registration;
    private String model;
    private String manufactured;

    public String getRegistration() {
        return registration;
    }

    public String getModel() {
        return model;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }
}
