package be.vdab.eiland.inwoners;

import be.vdab.eiland.events.TsunamiAlarmObserver;
import be.vdab.eiland.events.Vulkaan;
import be.vdab.eiland.events.VulkaanObserver;

public class Zoogdier extends InwonersEiland implements TsunamiAlarmObserver {


    public Zoogdier(String naam) {
        super(naam);
    }


    @Override
    public void reageerStartVulkaanuitbarsting() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door in hun hol te schuilen.");

    }

    @Override
    public void reageerStopVulkaanuitbarsting() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door van hun schuilen naar buiten te gaan.");

    }

    public void reageerZeeOverSpoeltEiLand() {
        System.out.println("\t" + "-> " + getNaam() + " reageert kruipen in de bomen");
    }

    public void reageerZeeTrektZichTerug() {
        System.out.println("\t" + "-> " + getNaam() + " reageert worden nerveus");
    }

    public void reageerEilandDroogOp() {
        System.out.println("\t" + "-> " + getNaam() + " reageert komen uit de bomen");
    }


    @Override
    public void zeeOverSpoeltEiland() {
        this.reageerZeeOverSpoeltEiLand();

    }

    @Override
    public void zeeTrektZichTerug() {
        this.reageerZeeTrektZichTerug();
    }

    @Override
    public void eilandDroogtOp() {
        this.reageerEilandDroogOp();
    }
}
