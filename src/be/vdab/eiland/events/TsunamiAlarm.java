package be.vdab.eiland.events;

import java.util.LinkedHashSet;
import java.util.Set;

public class TsunamiAlarm {

    private TsunamiAlarmFase toestand;

    private Set<TsunamiAlarmObserver> tsunamiAlarmObservers = new LinkedHashSet<>();

    private String naam;

    public TsunamiAlarm(String naam) {
        this.naam = naam;
        this.toestand = TsunamiAlarmFase.EİLAND_DROOGT_OP;
    }

    public String getNaam() {
        return naam;
    }

    public void addTsunamiObservers(TsunamiAlarmObserver observer) {
        tsunamiAlarmObservers.add(observer);
    }

    public void setTsunamiAlarmObservers(Set<TsunamiAlarmObserver> tsunamiAlarmObservers) {
        this.tsunamiAlarmObservers = tsunamiAlarmObservers;
    }

    public void notifyToestandZeeTreektTerug() {
        if (!tsunamiAlarmObservers.isEmpty() && !toestand.equals(TsunamiAlarmFase.ZEE_TREKT_ZİCH_TERUG)) {
            System.out.println("Tsunami " + naam + " trekt zich terug uit zee! ");
            tsunamiAlarmObservers.forEach(TsunamiAlarmObserver::zeeTrektZichTerug);
        }
        toestand = TsunamiAlarmFase.ZEE_TREKT_ZİCH_TERUG;
    }

    public void notifyToestandZeeOverspoeltEiland() {
        if (!tsunamiAlarmObservers.isEmpty() && !toestand.equals(TsunamiAlarmFase.ZEE_OVER_SPOELT_EİLAND)) {
            System.out.println("Tsunami " + naam + " overspoelt het eiland!");
            tsunamiAlarmObservers.forEach(TsunamiAlarmObserver::zeeOverSpoeltEiland);
        }
        toestand = TsunamiAlarmFase.ZEE_OVER_SPOELT_EİLAND;
    }

    public void notifyToestandZeeEilandDroogtOp() {
        if (!tsunamiAlarmObservers.isEmpty() && !toestand.equals(TsunamiAlarmFase.EİLAND_DROOGT_OP)) {
            System.out.println("Tsunami " + naam + " trekt zich terug van het eiland en het droogt op!");
            tsunamiAlarmObservers.forEach(TsunamiAlarmObserver::eilandDroogtOp);
        }
        toestand = TsunamiAlarmFase.EİLAND_DROOGT_OP;
    }
}
