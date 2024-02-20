package be.vdab.eiland.events;

public enum TsunamiAlarmFase {
    ZEE_OVER_SPOELT_EİLAND("De zee overspoelt het eiland"),
    ZEE_TREKT_ZİCH_TERUG("De zee terkt zich terug"),
    EİLAND_DROOGT_OP("Het eiland wordt droog");

    private String fase;

    TsunamiAlarmFase(String fase) {
        this.fase = fase;
    }

    @Override
    public String toString() {
        return fase;
    }
}
