package be.vdab.eiland.inwoners;

import be.vdab.eiland.events.TsunamiAlarmObserver;

public class Mens extends InwonersEiland implements TsunamiAlarmObserver {

    public Mens(String naam) {
        super(naam);
    }

    @Override
    public void reageerStartVulkaanuitbarsting() {
        System.out.println("\t" + "-> " + getNaam() + " reageert hierop door zijn huis te inlopen");

    }

    @Override
    public void reageerStopVulkaanuitbarsting() {
        System.out.println("\t" + "-> " + getNaam() + " reageert hierop door naar buiten te gaan");
    }

    public void reageerZeeOverSpoeltEiLand() {
        System.out.println("\t" + "-> " + getNaam() + " reageert vulkaan door op en bouwen daar een nieuw huis te lopen");
    }

    public void reageerZeeTrektZichTerug() {
        System.out.println("\t" + "-> " + getNaam() + " reageert gaan kijken");
    }

    public void reageerEilandDroogOp() {
        System.out.println("\t" + "-> " + getNaam() + " reageert terug door naar huis te gaan");
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
