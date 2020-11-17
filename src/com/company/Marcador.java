package com.company;

import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Marcador {

    private AtomicIntegerArray marcador = new AtomicIntegerArray(6);
    Random r = new Random();

    public synchronized void increment(){
        marcador.incrementAndGet(r.nextInt(6));
    }

    public AtomicIntegerArray getMarcador() {
        return marcador;
    }
}
