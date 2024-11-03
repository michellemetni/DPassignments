// Classe DataAdapterConcrete - Pattern Adapter-Objet
public class DataAdapterConcrete extends DataAdapterAbstract {
    private DataAdaptee aDataAdaptee;

    // Constructor initializes the DataAdaptee object
    public DataAdapterConcrete() { 
        aDataAdaptee = new DataAdaptee();
    }

    // Implementation of the Print method to adapt the PrintAdaptee method
    @Override
    public void Print() {
        aDataAdaptee.PrintAdaptee();
    }
}

