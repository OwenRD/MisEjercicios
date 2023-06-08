///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package clases;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Random;
//
//public class Baraja {
//    private List<Carta> cartas;
//    private List<Carta> monton;
//    private int siguiente;
//
//    public Baraja() {
//        cartas = new ArrayList<>();
//        monton = new ArrayList<>();
//        siguiente = 0;
//        for (Palo palo : Palo.values()) {
//            for (int numero = 1; numero <= 12; numero++) {
//                if (numero != 8 && numero != 9) {
//                    cartas.add(new Carta(numero, palo));
//                }
//            }
//        }
//    }
//
//    public void barajar() {
//        Collections.shuffle(cartas, new Random());
//        siguiente = 0;
//    }
//
//    public Carta siguienteCarta() {
//        if (siguiente >= cartas.size()) {
//            System.out.println("No hay más cartas en la baraja.");
//            return null;
//        }
//        Carta carta = cartas.get(siguiente);
//        monton.add(carta);
//        siguiente++;
//        return carta;
//    }
//
//    public int cartasDisponibles() {
//        return cartas.size() - siguiente;
//    }
//
//    public List<Carta> darCartas(int numero) {
//        int disponibles = cartasDisponibles();
//        if (disponibles == 0) {
//            System.out.println("No hay más cartas en la baraja.");
//            return null;
//        } else if (disponibles < numero) {
//            System.out.println("Solo hay " + disponibles + " cartas disponibles.");
//            numero = disponibles;
//        }
//        List<Carta> mano = new ArrayList<>();
//        for (int i = 0; i < numero; i++) {
//            mano.add(siguienteCarta());
//        }
//        return mano;
//    }
//
//    public void cartasMonton() {
//        if (monton.isEmpty()) {
//            System.out.println("No se ha sacado ninguna carta aún.");
//        } else {
//            System.out.println("Cartas del montón:");
//            for (Carta carta : monton) {
//                System.out.println(carta);
//            }
//        }
//    }
//
//    public void mostrarBaraja() {
//        System.out.println("Cartas en la baraja:");
//        for (int i = siguiente; i < cartas.size(); i++) {
//            System.out.println(cartas.get(i));
//        }
//    }
//}
//
//public class Carta {
//    private int numero;
//    private Palo palo;
//
//    public Carta(int numero, Palo palo) {
//        this.numero = numero;
//        this.palo = palo;
//    }
//
//    @Override
//    public String toString() {
//        String numeroStr = String.valueOf(numero);
//        switch (numero) {
//            case 1:
//                numeroStr = "As";
//                break;
//            case 10:
//                numeroStr = "Sota";
//                break;
//            case 11:
//                numeroStr = "Caballo";
//                break;
//            case 12:
//                numeroStr = "Rey";
//                break;
//        }
//        return numeroStr + " de " + palo.toString();
//    }
//}
//
//public enum Palo {
//    OROS, COPAS, ESPADAS, BASTOS
//}
//
