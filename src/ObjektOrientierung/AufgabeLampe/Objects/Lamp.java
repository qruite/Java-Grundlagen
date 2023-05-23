package ObjektOrientierung.AufgabeLampe.Objects;
import ObjektOrientierung.TaskOne.Objects.RearMirror;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    public String name;
    public List<GlowElements> glowElements;

    public Lamp(){
        this.glowElements = new ArrayList<>();
    }

    public void addLightElement(GlowElements lightElement){
        this.glowElements.add(lightElement);
    }

    public void turnAllOn(){
        for (int i = 0; i < glowElements.size(); i++) {
            glowElements.get(i).turnOn();
        }
    }

    public void turnAllOff(){
        for (int i = 0; i < glowElements.size(); i++) {
            glowElements.get(i).turnOff();
        }
    }

    public double getOverallPowerUsage(){
        double overallPowerUsage = 0;

        for (int i = 0; i < glowElements.size(); i++) {
            double powerUsage = glowElements.get(i).getPowerConsumption();
            overallPowerUsage += powerUsage;
        }

        return overallPowerUsage;
    }

    public void printNamesOfLightElements(){
        for (int i = 0; i < glowElements.size(); i++) {
            System.out.println("Lampe" + (i+1) + ": " + glowElements.get(i).getName());
        }
    }
}
