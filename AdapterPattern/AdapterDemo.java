// Classe AdapterDemo - Pattern Adapter-Objet
public class AdapterDemo {
    private DataAdapterAbstract aDataTarget;

    // Constructor initializes the adapter (DataAdapterConcrete)
    public AdapterDemo() {
        aDataTarget = new DataAdapterConcrete();
        aDataTarget.Print(); // Call to the Print method that uses the adaptee's method
    }

    public static void main(String[] args) {
        new AdapterDemo(); // Instantiates the AdapterDemo, which in turn demonstrates the adapter functionality
    }
}
