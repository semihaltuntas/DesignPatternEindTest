package be.vdab.eiland.events;

public interface VulkaanObserver {
    void ontsnappenUitVulkaan(Vulkaan vulkaan);
    void stopOntsnappenVanVulkaan(Vulkaan vulkaan);
}
