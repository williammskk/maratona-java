package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        ResourceBundle bundleBr = ResourceBundle.getBundle("mensagens", new Locale("pt", "BR"));
        ResourceBundle bundleEn = ResourceBundle.getBundle("mensagens", new Locale("en", "US"));
        System.out.println(bundleBr.getString("hello"));
        System.out.println(bundleEn.getString("hello"));
    }
}
