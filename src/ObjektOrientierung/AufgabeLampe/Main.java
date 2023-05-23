package ObjektOrientierung.AufgabeLampe;
import ObjektOrientierung.AufgabeLampe.Objects.*;

public class Main {
    public static void main(String[] args){
        GlowElements e1 = new GlowElements("Arcchhio", "schwarz", 10);
        GlowElements e2 = new GlowElements("Philips", "blau", 8);
        GlowElements e3 = new GlowElements("Samsung", "grau", 20);
        GlowElements e4 = new GlowElements("LED", "grün", 4);

        Lamp l1 = new Lamp();
        l1.addLightElement(e1);
        l1.addLightElement(e2);
        l1.addLightElement(e3);
        l1.addLightElement(e4);

        l1.printNamesOfLightElements();
        System.out.println("Stromverbrauch: " + l1.getOverallPowerUsage());

        l1.turnAllOn();
        System.out.println(e1.isStatus());
        System.out.println(e2.isStatus());
        System.out.println(e3.isStatus());
        System.out.println(e4.isStatus());

        System.out.println("Stromverbrauch: " + l1.getOverallPowerUsage());

        l1.turnAllOff();
        System.out.println(e1.isStatus());
        System.out.println(e2.isStatus());
        System.out.println(e3.isStatus());
        System.out.println(e4.isStatus());

        l1.turnAllOn();
        l1.turnAllOn();
    }
}
