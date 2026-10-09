public class Zak {
    String jmeno;
    String prijmeni;
    int cisloChodu;

    Zak(String jmeno, String prijmeni, int cisloChodu) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.cisloChodu = cisloChodu;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getCisloChodu() {
        return cisloChodu;
    }

    @Override
    public String toString() {
        return "Zak{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", cisloChodu=" + cisloChodu +
                '}';
    }
}
