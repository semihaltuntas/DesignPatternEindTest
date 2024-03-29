package be.vdab.eiland.inwoners;

import be.vdab.eiland.events.TornadoAlarmObserver;
import be.vdab.eiland.events.Vulkaan;
import be.vdab.eiland.events.VulkaanObserver;

public class Vogel extends InwonersEiland implements TornadoAlarmObserver {


    public Vogel(String naam) {
        super(naam);
    }

    @Override
    public void reageerStartVulkaanuitbarsting() {
        System.out.println("\t" + "-> " + getNaam() + " reageert hierop door hoger op te vliegen ");

    }

    @Override
    public void reageerStopVulkaanuitbarsting() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door laag te vliegen ");
    }


    public void reageerOpkomstVanTornadoOpEiland() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door zo ver mogelijk te vliegen");
    }

    public void reageerActiefTornadoOpEiland() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door niets aan te doen");
    }


    public void reageerStoptTornadoOpEiland() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door terug te keren");
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



