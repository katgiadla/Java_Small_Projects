import jade.content.Concept;

public class Car implements Concept {
    private String _registration;
    private String _model;
    private String _manufactured;

    public String get_registration() {
        return _registration;
    }

    public String get_model() {
        return _model;
    }

    public String get_manufactured() {
        return _manufactured;
    }

    public void set_registration(String _registration) {
        this._registration = _registration;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    public void set_manufactured(String _manufactured) {
        this._manufactured = _manufactured;
    }
}
