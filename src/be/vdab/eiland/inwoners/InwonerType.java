package be.vdab.eiland.inwoners;

public enum InwonerType {
    V("Vogel"),
    Z("Zoogdier"),
    M("Mensen"),
    B("Bodemdier");
    public String type;

    InwonerType(String type) {
        this.type = type;
    }
}
