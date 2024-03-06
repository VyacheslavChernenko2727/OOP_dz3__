package org.example;

import org.example.pharmacy.Medicine;
import org.example.pharmacy.Medicine2;
import org.example.pharmacy.MedicineComponent;
import org.example.pharmacy.impl.Asitromin;
import org.example.pharmacy.impl.Penicilinium;
import org.example.pharmacy.impl.Vetbicid;

import java.text.CollationElementIterator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<MedicineComponent> medList = new ArrayList<>();
        ArrayList<Medicine2> medicine2List = new ArrayList<>();
        Asitromin asitr = new Asitromin("Asitro", 50, 25);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);

        Medicine2 medicine1 = new Medicine2();
        medicine1.addComponent(asitr).addComponent(penicilinium);

        Medicine2 medicine2 = new Medicine2();
        medicine2.addComponent(penicilinium).addComponent(vetbic);

        Medicine2 medicine3 = new Medicine2();
        medicine3.addComponent(asitr).addComponent(vetbic);

        medicine2List.add(medicine1);
        medicine2List.add(medicine2);
        medicine2List.add(medicine3);

//        for (MedicineComponent companent : medicine1) {
//
//        }
//        Iterator<MedicineComponent> med = medicine1;
//        while (medicine1.hasNext()) {
//            System.out.println(med.next());
//        }
//        for (MedicineComponent component : medicine1) {
//            System.out.println(component);
//        }
//        medList.add(asitr);
//        medList.add(penicilinium);
//        medList.add(vetbic);
//        System.out.println(medList);
//        Collections.sort(medList);
//        System.out.println(medList);
        // 75, 80, 55 - non-sorted
        // 80, 75, 55


        System.out.println("-----non-sorted-----");
        System.out.println(medicine2List);
        Collections.sort(medicine2List);
        System.out.println("-----sorted-----");
        System.out.println(medicine2List);

    }
}