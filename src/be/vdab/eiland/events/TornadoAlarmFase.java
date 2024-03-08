package be.vdab.eiland.events;

public enum TornadoAlarmFase {
    TORNADO_OPKOMST("De Tornado aankomst op het eiland"),
    TORNADO_ACTİEF("De Tornado actief op het eiland"),
    TORNADO_VOORBİJ("De Tornado stopt op het eiland");

    private String fase;

    TornadoAlarmFase(String fase) {
        this.fase = fase;
    }

    @Override
    public String toString() {
        return fase;
    }
}
