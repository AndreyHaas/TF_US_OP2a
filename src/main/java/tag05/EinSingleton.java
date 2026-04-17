package tag05;

public class EinSingleton {

    // Bill Pugh Solution.
    // Vorteil: Threadsicher, lazy loading, keine Synchronisation – die Java-Ladeprogramm-Garantien werden genutzt.
    private EinSingleton() {}

    private static class SingletonHelper {
        private static final EinSingleton INSTANCE = new EinSingleton();
    }

    public static EinSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
