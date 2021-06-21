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