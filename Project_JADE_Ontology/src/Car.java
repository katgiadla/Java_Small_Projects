import jade.content.Concept;

public class Car implements Concept {
    private String _registration;
    private String _model;
    private String _manufactured;

    public String getRegistration() {
        return _registration;
    }

    public String getModel() {
        return _model;
    }

    public String getManufactured() {
        return _manufactured;
    }

    public void setRegistration(String _registration) {
        this._registration = _registration;
    }

    public void setModel(String _model) {
        this._model = _model;
    }

    public void setManufactured(String _manufactured) {
        this._manufactured = _manufactured;
    }
}
