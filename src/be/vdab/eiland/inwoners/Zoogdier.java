package be.vdab.eiland.inwoners;

import be.vdab.eiland.events.Vulkaan;
import be.vdab.eiland.events.VulkaanObserver;

public class Zoogdier extends InwonersEiland {


    public Zoogdier(String naam) {
        super(naam);
    }



    @Override
    public void reageerStartVulkaanuitbarsting() {
        System.out.println("\t" + getNaam() + " reagert door in hun hol te schuilen.");

    }

    @Override
    public void reageerStopVulkaanuitbarsting() {
        System.out.println("\t" + getNaam() + " reagert door terug te keren naar hun holen.");

    }
}
