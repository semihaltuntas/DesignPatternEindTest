package be.vdab.eiland.events;

import java.util.LinkedHashSet;
import java.util.Set;

public class Vulkaan {
    public enum ToestandTypeVanVulkaan {
        ACTİEF,
        NONACTİEF,
    }

    private ToestandTypeVanVulkaan toestand;

    private final Set<VulkaanObserver> vulkaanObservers = new LinkedHashSet<>();

    private final String naam;

    public Vulkaan(String naam) {
        this.naam = naam;
        toestand = ToestandTypeVanVulkaan.NONACTİEF;
    }

    public Set<VulkaanObserver> getVulkaanObservers() {
        return vulkaanObservers;
    }

    public void voegVulkaanObserverToe(VulkaanObserver observer) {
        vulkaanObservers.add(observer);
    }

 public    void startMetUitBarsten() {
        if (!vulkaanObservers.isEmpty() && toestand.equals(ToestandTypeVanVulkaan.NONACTİEF)) {
            System.out.println("Vulkaan " + naam + " begint uit te barsten.");
            vulkaanObservers.forEach(observer -> observer.ontsnappenUitVulkaan(this));
        }
        toestand = ToestandTypeVanVulkaan.ACTİEF;
    }

   public void stopMetUitBarsten() {
        if (!vulkaanObservers.isEmpty() && toestand.equals(ToestandTypeVanVulkaan.ACTİEF)) {
            System.out.println("Vulkaan " + naam + " stopt uitbarsten");
            vulkaanObservers.forEach(observer -> observer.stopOntsnappenVanVulkaan(this));
        }
        toestand = ToestandTypeVanVulkaan.NONACTİEF;
    }


}
