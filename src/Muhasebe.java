public class Muhasebe {

    public String calisanAdSoyad;
    public double gunlukMaas;
    public int calisilanGun;

    Muhasebe(String calisanAdSoyad,double gunlukMaas,int calisilanGun){
        this.calisanAdSoyad=calisanAdSoyad;
        this.gunlukMaas=gunlukMaas;
        this.calisilanGun=calisilanGun;

    }
    public double maasHesapla() {
        double toplamMaas = gunlukMaas * calisilanGun;
        int prim;

        prim= (calisilanGun > 25) ? (calisilanGun - 25) * 1000 : 0;

        toplamMaas+=prim;

        return toplamMaas;

    }


}