public class Toplama {
    public static void main(String[] args) {
        topl(3,2);
    }
    public static  void  topl(int... a){
         int toplam=0;
        for (int w:a){
            toplam+=w;
        }
        // V3 huseyin calismalri
        System.out.println("toplam ="+toplam);
    }
}
