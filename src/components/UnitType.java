package components;


public enum UnitType {
    THING { @Override public String toString() { return "ШТ"; } },
    SQUAREMETER { @Override public String toString() { return "КВ.М"; } },
    RUNNINGMETER{ @Override public String toString() { return "ПГ.М"; } }

}


