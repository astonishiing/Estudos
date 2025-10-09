package javacore.introducao.dominio.ZZGconcorrencia.test;

import javacore.introducao.dominio.ZZGconcorrencia.dominio.Members;
import javacore.introducao.dominio.ZZGconcorrencia.service.EmaiDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmaiDeliveryService(members), "Jiraya");
        Thread kakashi = new Thread(new EmaiDeliveryService(members), "Kakashi");
        jiraya.start();
        kakashi.start();

        while(true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()) {
                members.close();
                break;
            }

            members.addMemberEmail(email);
        }

    }
}
