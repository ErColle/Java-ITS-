package Esercizi.hotel;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Room> camere = new ArrayList<Room>();

        camere.add(new Room(100, 1, 3));
        camere.add(new Room(112, 1, 3));
        camere.add(new Room(124, 1, 2));
        camere.add(new Room(111, 1, 3));
        camere.add(new Room(201, 2, 4));
        camere.add(new Room(210, 2, 4));
        camere.add(new Room(205, 2, 2));
        camere.add(new Room(222, 2, 3));

        int postiLettoTotali = 0;

        for(Room camera : camere ) {
            postiLettoTotali += camera.getnPostiLetto();
        }

        int plettop1 = 0;
        int plettop2 = 0;

        for(Room camera : camere ) {
            if(camera.getPiano() == 1){
            plettop1 += camera.getnPostiLetto();
            } else {
                plettop2 += camera.getnPostiLetto();
            }
        }

        int cameredoppiep1 = 0;
        int cameredoppiep2 = 0;

        for(Room camera : camere ) {
            if(camera.getnPostiLetto() == 2 && camera.getPiano() == 1 ){
                cameredoppiep1 += 1;
            } else if(camera.getnPostiLetto() == 2 && camera.getPiano() == 2 ){
                cameredoppiep2 += 1;
            }
        }

        for(Room camera : camere ){
            if(camera.getPiano() == 1 && camera.getnPostiLetto() == 2){
                System.out.println("prima camera doppia primo piano" + camera);
                break;
            }
        }

        for(Room camera : camere ){
            if(camera.getPiano() == 2 && camera.getnPostiLetto() == 2){
                System.out.println("prima camera doppia secondo piano" + camera);
                break;
            }
        }

        for(Room camera : camere ){
            if(camera.getPiano() == 1 && camera.getnPostiLetto() == 4){
                System.out.println("prima camera quadrupla primo piano" + camera);
                break;
            }
        }

        for(Room camera : camere ){
            if(camera.getPiano() == 2 && camera.getnPostiLetto() == 4){
                System.out.println("prima camera quadrupla secondo piano" + camera);
                break;
            }
        }

        System.out.println("camere doppie piano 2: " + cameredoppiep1);
        System.out.println("camere doppie piano 2: " + cameredoppiep2);

        System.out.println("posti letto piano 1: " + plettop1);
        System.out.println("posti letto piano 2: " + plettop2);
        System.out.println(postiLettoTotali);

    }
}
