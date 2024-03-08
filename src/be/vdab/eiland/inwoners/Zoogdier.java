package be.vdab.eiland.inwoners;

import be.vdab.eiland.events.TornadoAlarmObserver;

public class Zoogdier extends InwonersEiland implements TornadoAlarmObserver {


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

    public void reageerOpkomstVanTornadoOpEiland() {
        System.out.println("\t" + "-> " + getNaam() + " reageert worden nerveus");
    }

    public void reageerActiefTornadoOpEiland() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door in zijn hol te zitten");
    }


    public void reageerStoptTornadoOpEiland() {
        System.out.println("\t" + "-> " + getNaam() + " reageert uit zijn hol door terug te komen");
    }


    @Override
    public void tornadoOpKomstNaarEiland() {
        reageerOpkomstVanTornadoOpEiland();
    }

    @Override
    public void tornadoActiefOpEiland() {
        reageerActiefTornadoOpEiland();
    }

    @Override
    public void tornadoStopt() {
        reageerStoptTornadoOpEiland();
    }
}
