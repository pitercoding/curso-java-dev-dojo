package pitercoding.devdojo.javacore.threads.main;

import pitercoding.devdojo.javacore.threads.domain.Members;
import pitercoding.devdojo.javacore.threads.service.EmailDeliveryService;

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
