package pitercoding.devdojo.javacore.concorrencia.main;

import pitercoding.devdojo.javacore.concorrencia.domain.Members;
import pitercoding.devdojo.javacore.concorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryMain01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
        jiraya.start();
        kakashi.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email ==  null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addEmail(email);
        }
    }
}
