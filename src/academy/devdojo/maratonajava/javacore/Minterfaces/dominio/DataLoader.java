package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Checando permissões...");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro da interface DataLoader: "+MAX_DATA_SIZE);
    }
}
