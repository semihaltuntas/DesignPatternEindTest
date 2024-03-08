package be.vdab.eiland.inwoners;

import be.vdab.eiland.events.TornadoAlarmObserver;

public  class Mensen extends InwonersEiland implements TornadoAlarmObserver {

    public Mensen(String naam) {
        super(naam);
    }

    @Override
    public void reageerStartVulkaanuitbarsting() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door naar hun huis te komen");
    }

    @Override
    public void reageerStopVulkaanuitbarsting() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door uit te gaan");
    }


    public void reageerOpkomstVanTornadoOpEiland() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door naar de dreigende lucht te kijken");
    }

    public void reageerActiefTornadoOpEiland() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door in de kelder van zijn/haar huis te zitten");
    }

    public void reageerStoptTornadoOpEiland() {
        System.out.println("\t" + "-> " + getNaam() + " reageert door uit zijn/haar kelder te komen");
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
