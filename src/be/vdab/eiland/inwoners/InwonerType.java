package be.vdab.eiland.inwoners;

public enum InwonerType {
    V("Vogel"),
    Z("Zoogdier"),
    M("Mensen");
    public String type;

    InwonerType(String type) {
        this.type = type;
    }
}
