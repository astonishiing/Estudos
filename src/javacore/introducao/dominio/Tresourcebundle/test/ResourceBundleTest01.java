package javacore.introducao.dominio.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        boolean sasa = bundle.containsKey("sasa");
        System.out.println(sasa);

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

        bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        //Local("fr", "CA");
        //message_fr_CA.properties
        //message_fr.properties
        //message_pt_BR.properties
        //message_pt.properties
        //message.properties



    }
}
