package biodata;

public class datadiri  {


    public String namalengkap;
    public String namapanggilan;
    public String tempatlahir;
    public String tanggallahir;
    public String jeniskelamin;
    public String gmail;
    public String nohp;
    public String status;

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getNamapanggilan() {
        return namapanggilan;
    }

    public void setNamapanggilan(String namapanggilan) {
        this.namapanggilan = namapanggilan;
    }

    public String getTempatlahir() {
        return tempatlahir;
    }

    public void setTempatlahir(String tempatlahir) {
        this.tempatlahir = tempatlahir;
    }

    public String getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public datadiri() {
        this.namalengkap = "Muhammad Riyandi Mualana";
        this.namapanggilan = "Yandi";
        this.gmail = "MaulanaRiyandi0@gmail.com";
    }

    public void data() {
        System.out.println("BIODATA DIRI");
    }

    public void nama() {
        System.out.println("Nama Lengkap : " + namalengkap);
        System.out.println("Nama Panggilan : " + namapanggilan);
    }

    public void ttl() {
        System.out.println("Tempat Lahir   :" + tempatlahir);
        System.out.println("Tanggal Lahir  :" + tanggallahir);
        System.out.println("Jenis Kelamin  :" + jeniskelamin);

    }

    public void no() {
        System.out.println("Gmail : " + gmail);
        System.out.println("No Hp  :" + nohp);
        System.out.println("status :" + status);
    }
}