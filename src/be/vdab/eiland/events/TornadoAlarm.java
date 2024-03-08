package be.vdab.eiland.events;

import java.util.LinkedHashSet;
import java.util.Set;

public class TornadoAlarm {

    private TornadoAlarmFase toestand;

    private Set<TornadoAlarmObserver>tornadoAlarmObservers = new LinkedHashSet<>();

    private String naam;

    public TornadoAlarm(String naam) {
        this.naam = naam;
        this.toestand = TornadoAlarmFase.TORNADO_VOORBİJ;
    }

    public String getNaam() {
        return naam;
    }

    public void addTsunamiObservers(TornadoAlarmObserver observer) {
        tornadoAlarmObservers.add(observer);
    }

    public void setTsunamiAlarmObservers(Set<TornadoAlarmObserver> tsunamiAlarmObservers) {
        this.tornadoAlarmObservers = tsunamiAlarmObservers;
    }

    public void notifyToestandOpkomstVanTornadoOpEiland() {
        if (!tornadoAlarmObservers.isEmpty() && !toestand.equals(TornadoAlarmFase.TORNADO_OPKOMST)) {
            System.out.println("Tornado " + naam + " opkomst op het Eiland! ");
            tornadoAlarmObservers.forEach(TornadoAlarmObserver::tornadoOpKomstNaarEiland);
        }
        toestand = TornadoAlarmFase.TORNADO_OPKOMST;
    }

    public void notifyToestandActiefTornadoOpEiland() {
        if (!tornadoAlarmObservers.isEmpty() && !toestand.equals(TornadoAlarmFase.TORNADO_ACTİEF)) {
            System.out.println("Tornado " + naam + "  richt grote schade aan.!");
            tornadoAlarmObservers.forEach(TornadoAlarmObserver::tornadoActiefOpEiland);
        }
        toestand = TornadoAlarmFase.TORNADO_ACTİEF;
    }

    public void notifyToestandStoptTornadoOpEiland() {
        if (!tornadoAlarmObservers.isEmpty() && !toestand.equals(TornadoAlarmFase.TORNADO_VOORBİJ)) {
            System.out.println("Tornado " + naam + " stopt en het leven op het eiland wordt weer normaal!");
            tornadoAlarmObservers.forEach(TornadoAlarmObserver::tornadoStopt);
        }
        toestand = TornadoAlarmFase.TORNADO_VOORBİJ;
    }
}
