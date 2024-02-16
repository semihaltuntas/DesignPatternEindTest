package be.vdab.eiland.inwoners;

import be.vdab.eiland.events.Vulkaan;
import be.vdab.eiland.events.VulkaanObserver;

public class Zoogdier extends InwonersEiland {


    public Zoogdier(String naam) {
        super(naam);
    }



    @Override
    public void reageerStartVulkaanuitbarsting() {
        System.out.println("\t"+"-> "  + getNaam() + " reageert door in hun hol te schuilen.");

    }

    @Override
    public void reageerStopVulkaanuitbarsting() {
        System.out.println("\t"+"-> " + getNaam() + " reageert door van hun schuilen naar buiten te gaan.");

    }
}
