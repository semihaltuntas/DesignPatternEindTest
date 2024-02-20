package be.vdab.eiland.inwoners;

public class Mens extends InwonersEiland {

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
}
