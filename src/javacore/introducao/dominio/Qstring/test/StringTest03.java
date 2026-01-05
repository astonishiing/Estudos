package javacore.introducao.dominio.Qstring.test;

import java.util.HashMap;
import java.util.Map;

public class StringTest03 {
    public static void main(String[] args) {
        String value = "java;java;java;java";
        String test = "/******java******/";
        String json = """
                {"name":"João","age":18}""";
        String repeat = "a";

        value = value.replaceFirst("j", "J"); //Altera o valor

        System.out.println(value);
        String[] split = value.split(";");//Gera uma lista de String a partir da nossa String
        String[] split2 = value.split(";", 2);//Gera uma lista de String a partir da nossa String

        for (String v : split) {
            System.out.println(v);
        }
        System.out.println("============");

        for (String v : split2) {
            System.out.println(v);
        }

        System.out.println("===========");

        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());

        System.out.println("==========");
        System.out.println(value.contains(";"));

        System.out.println("==========");
        System.out.println(value.indexOf("j"));
        System.out.println(value.indexOf("j", 1));
        System.out.println(value.indexOf("j", 1, 5));
        System.out.println(value.indexOf("a", 1, 5));

        System.out.println("=============");
        System.out.println(value.startsWith("ja"));
        System.out.println(value.endsWith("va"));

        System.out.println("===============");
        System.out.println(value.isEmpty()); // Verifica se está vazia
        System.out.println(value.isBlank()); // Verifica se contêm apenas espaços vazios
        System.out.println(value.trim()); // Elimina todos os espaços em branco

        System.out.println("=============");
        System.out.println(test.substring(7, 11)); //Extração de valores

        System.out.println("============");
        Map<String, String> stringMap = new HashMap<>();
        json = json.replace("{", "").replace("}", "").replace("\"", "");
        var valueArr = json.split(",");

        for (String v : valueArr) {

            var keyValue = v.split(":");
            stringMap.put(keyValue[0], keyValue[1]);
        }
        System.out.println(stringMap);

        System.out.println("===============");
        System.out.println(repeat.repeat(5));

    }

}

