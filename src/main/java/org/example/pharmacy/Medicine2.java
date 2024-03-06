package org.example.pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine2 implements Iterable<MedicineComponent>, Comparable<Medicine2> {
    private List<MedicineComponent> components;
    private int index;

    public Medicine2() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine2 addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }


//    @Override
//    public boolean hasNext() {
////        return components.iterator().hasNext();
//        return index < components.size();
//    }
//
//    @Override
//    public MedicineComponent next() {
////        return components.iterator().next();
//        return components.get(index++);
//    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }

    @Override
    public Iterator<MedicineComponent> iterator() {
        return new Iterator<MedicineComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedicineComponent next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(Medicine2 o) {
        int oPower = 0;
        for (MedicineComponent component : o.getComponents()){
            oPower += component.getPower();
        }

        int thisPower = 0;
        for (MedicineComponent component : this.components){
            thisPower += component.getPower();
        }

        return thisPower - oPower;
//        return oPower - thisPower;
    }

    public List<MedicineComponent> getComponents() {
        return this.components;
    }
}
