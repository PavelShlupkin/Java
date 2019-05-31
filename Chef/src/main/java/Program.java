import modules.*;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Technique toaster = new KitchenTechnique("Toaster", 600, true, true, 3, true);
        Technique column = new EntertaimentTechique("Column", 80, true, true, true, true, 100);
        Technique conditioner = new СonvenienceTechique("Conditioner", 300, true, true, true, 3, false, 25);

        PowerCompare pc = new PowerCompare();
        ArrayList<Technique> flat = new ArrayList<Technique>();

        flat.add(toaster);
        flat.add(column);
        flat.add(conditioner);

        flat.sort(pc);

        System.out.println("Sorted by power: ");
        for (Technique h: flat) {
            System.out.println(h.getName() + " " + h.getPower());
        }
    }
}
