package subclass;

import biodata.datadiri;

public class dataortu extends datadiri {

    public String namaayah;
    public String namaibu;
    public String not;

    public String getNamaayah() {
        return namaayah;
    }

    public void setNamaayah(String namaayah) {
        this.namaayah = namaayah;
    }

    public String getNamaibu() {
        return namaibu;
    }

    public void setNamaibu(String namaibu) {
        this.namaibu = namaibu;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public void ortu(){
        System.out.println("Nama Ayah : " +namaayah);
        System.out.println("Nama Ibu  : " +namaibu);
    }
    public void not(){
        System.out.println("######################## :");
        System.out.println("No.Hp Orang Tua : " +not);
    }

}