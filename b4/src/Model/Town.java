package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Town {
    Set<Family> families;

    public Town() {
        families = new HashSet<>();
    }
    public void addFamily(Family family) {
        this.families.add(family);
    }
    public void showFamily(){
        //this.families.forEach(families -> System.out.println(families.toString()));
        this.families.forEach(Family::showMem);

    }
}
