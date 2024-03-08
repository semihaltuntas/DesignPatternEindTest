package be.vdab.eiland.inwoners;

public class BodemDieren extends InwonersEiland {
    public BodemDieren(String naam) {
        super(naam);
    }

    @Override
    public void reageerStartVulkaanuitbarsting() {
        System.out.println("\t" + "-> " + getNaam() + " reageert zo ver mogelijk weg kruisen van de vulkaan");
    }

    @Override
    public void reageerStopVulkaanuitbarsting() {
        System.out.println("\t"+ "-> "+getNaam() + " reageert door terug te keren naar waar ze eerst waren");

    }


}
