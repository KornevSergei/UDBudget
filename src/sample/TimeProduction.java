package sample;

public enum TimeProduction {
    INSTOCK { @Override public String toString() { return "в наличии"; } },
    ONEWEEKS { @Override public String toString() { return "1 неделя"; } },
    TWOWEEKS { @Override public String toString() { return "2 недели"; } },
    ONEMONTHS { @Override public String toString() { return "1 мес"; } },
    TWOMONTHS { @Override public String toString() { return "2 мес"; } },
    THREEMONTHS { @Override public String toString() { return "3 мес"; } },
    FOURMONTHS { @Override public String toString() { return "4 мес"; } },
    SIXMONTHS { @Override public String toString() { return "6 мес"; } },
    YEAR{ @Override public String toString() { return "год"; } }
}
