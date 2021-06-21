package main;

import biodata.datadiri;
import subclass.dataortu;

public class maindata {
    public static void main(String[] args) {

        datadiri bio = new datadiri();
        bio.data();

        datadiri v = new datadiri();
        System.out.println(v.namalengkap);
        System.out.println(v.namapanggilan);
        System.out.println(v.gmail);

        datadiri d1 = new datadiri();
        d1.namalengkap = "Muhammad Riyandi Maulana";
        d1.namapanggilan= "Yandi";
        d1.nama();

        datadiri d2 = new datadiri();
        d2.tempatlahir = "Pandakdaun";
        d2.tanggallahir = "19-April-2000";
        d2.jeniskelamin = "Laki-Laki";
        d2.ttl();

        datadiri d3  = new datadiri();
        d3.gmail = "Maulanariyandi0@gmail.com";
        d3.nohp =  "083150428316";
        d3.status = "Mahasiswa";
        d3.no();

        dataortu o = new dataortu();
        o.namaayah = "Hamli";
        o.namaibu = "arbainah";
        o.ortu();

        dataortu o1 = new dataortu();
        o1.not = "083150428316";
        o1.not();
    }
}
