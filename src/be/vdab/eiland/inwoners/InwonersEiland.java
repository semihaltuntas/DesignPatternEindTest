package be.vdab.eiland.inwoners;

import be.vdab.eiland.events.Vulkaan;
import be.vdab.eiland.events.VulkaanObserver;

public abstract class InwonersEiland implements VulkaanObserver {

    private String naam;

    public InwonersEiland(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public void ontsnappenUitVulkaan(Vulkaan vulkaan) {
        reageerStartVulkaanuitbarsting();

    }

    @Override
    public void stopOntsnappenVanVulkaan(Vulkaan vulkaan) {
        reageerStopVulkaanuitbarsting();
    }

    public abstract void reageerStartVulkaanuitbarsting();

    public abstract void reageerStopVulkaanuitbarsting();

    @Override
    public String toString() {
        return getNaam();
    }
}
