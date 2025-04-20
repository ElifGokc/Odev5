public class Main {
    public static void main(String[] args) {

        Muhasebe p1= new Muhasebe("Ayşe Özcan",1000,30);
        Muhasebe p2= new Muhasebe("Ali Çay",500,10);
        Muhasebe p3= new Muhasebe("Ali Koç",400,28);
        Muhasebe p4= new Muhasebe("Aylin Gün",2000,15);


        double maas1=p1.maasHesapla();
        double maas2=p2.maasHesapla();
        double maas3=p3.maasHesapla();
        double maas4=p4.maasHesapla();


        System.out.println("Personel maaşları listesi:\n");
        System.out.println(p1.calisanAdSoyad+" isimli personelin maas bilgisi= "+maas1+"\n");
        System.out.println(p2.calisanAdSoyad+" isimli personelin maas bilgisi= "+maas2+"\n");
        System.out.println(p3.calisanAdSoyad+" isimli personelin maas bilgisi= "+maas3+"\n");
        System.out.println(p4.calisanAdSoyad+" isimli personelin maas bilgisi= "+maas4+"\n");

    }
}