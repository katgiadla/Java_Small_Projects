import jade.content.onto.BasicOntology;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.schema.*;

import javax.print.DocFlavor;

public class CarOntology extends Ontology {
    public static final String ONTOLOGY_NAME = "Car-ontology";

    public static final String CAR = "car";
    public static final String REGISTRATION = "registration";
    public static final String MODEL = "model";
    public static final String MANUFACTURED = "manufactured";


    public static final String MILAGE = "milage";
    public static final String INTERVAL = "0.0";
    public static final String MEASUREMENTUNIT = "unit";


    private static Ontology theInstance = new CarOntology();
    public static Ontology getInstance(){
        return theInstance;
    }

    private CarOntology() {
        super(ONTOLOGY_NAME, BasicOntology.getInstance());
        try {
            add(new ConceptSchema(CAR), Car.class);
            add(new ConceptSchema(MILAGE), Milage.class);
        } catch (OntologyException oe) {
            oe.printStackTrace();
        }
    }
}
