public class Esiintyja {
    private String tunniste;
    private String nimi;
    private String ala;
    private double palkkio;

    public Esiintyja(String tunniste, String nimi, String ala, double palkkio) {
        this.tunniste = tunniste;
        this.nimi = nimi;
        this.ala = ala;
        this.palkkio = palkkio;
    }

    public void setTunniste(String tunniste) {
        this.tunniste = tunniste;
    }
    public String getTunniste() {
        return tunniste;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public String getNimi() {
        return nimi;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }
    public String getAla() {
        return ala;
    }

    public void setPalkkio(double palkkio) {
        if (palkkio >= 0) {
            this.palkkio = palkkio;
        }
    }
    public double getPalkkio() {
        return palkkio;
    }
}

public class Asiakas {
    private String nimi;
    private String email;
    private String salasana;
    private int asiakasNumero;

    public Asiakas(String nimi, String email, String salasana, int asiakasNumero) {
        this.nimi = nimi;
        this.email = email;
        this.salasana = salasana;
        this.asiakasNumero = asiakasNumero;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public String getNimi() {
        return nimi;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setSalasana(String salasana) {
        this.salasana = salasana;
    }
    public String getSalasana() {
        return salasana;
    }

    public void setAsiakasNumero(int asiakasNumero) {
        if (asiakasNumero > 0) {
            this.asiakasNumero = asiakasNumero;
        }
    }
    public int getAsiakasNumero() {
        return asiakasNumero;
    }
}

public class Tilaisuus {
    private String tyyppi;
    private String Asiakas;
    private String Esiintyja;

    public Tilaisuus(String tyyppi, String Asiakas, String Esiintyja) {
        this.tyyppi = tyyppi;
        this.Asiakas = Asiakas;
        this.Esiintyja = Esiintyja;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }
    public String getTyyppi() {
        return tyyppi;
    }

    public void setAsiakas(String Asiakas) {
        this.Asiakas = Asiakas;
    }
    public String getAsiakas() {
        return Asiakas;
    }

    public void setEsiintyja(String Esiintyja) {
        this.Esiintyja = Esiintyja;
    }
    public String getEsiintyja() {
        return Esiintyja;
    }
}