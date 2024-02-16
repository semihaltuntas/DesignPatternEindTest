package be.vdab.eiland.inwoners;

import be.vdab.eiland.events.Vulkaan;
import be.vdab.eiland.events.VulkaanObserver;

public class Vogel extends InwonersEiland {


    public Vogel(String naam) {
        super(naam);
    }

    @Override
    public void reageerStartVulkaanuitbarsting() {
        System.out.println("\t"+ getNaam() + " reager hierop door hoger op te vliegen ");

    }

    @Override
    public void reageerStopVulkaanuitbarsting() {
        System.out.println("\t"+ getNaam() + " reager door laag te vliegen ");
    }
}



