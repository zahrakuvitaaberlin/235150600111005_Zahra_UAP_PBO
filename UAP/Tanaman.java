package UAP;

abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    public void berkembang(){
        if(prosesBerbuah >= lamaHidup){
            
        }
    }
    public String status(String mati, String hidup){
        if (lamaHidup >= masaHidup){
            return "mati";
        }
        else{
            return "hidup";
        }
    }
    @Override
    public String toString() {
        
       
        return super.toString();
    }
    public int getMasaHidup() {
        return masaHidup;
    }
    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }
    public int getLamaHidup() {
        return lamaHidup;
    }
    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }
    public int getBerbuah() {
        return berbuah;
    }
    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }
    public int getBuah() {
        return buah;
    }
    public void setBuah(int buah) {
        this.buah = buah;
    }
    public double getPerkembangan() {
        return perkembangan;
    }
    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }
    public double getProsesBerbuah() {
        return prosesBerbuah;
    }
    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }
    
}
