package pitercoding.devdojo.javacore.concorrencia.service;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceDeprecated {

    public double getPriceSync(String name){
        System.out.printf("capturando preço para %s%n", name);
        return priceGen();
    }

    private double priceGen(){
        System.out.printf("%s gerando preço %n ", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) *10;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}