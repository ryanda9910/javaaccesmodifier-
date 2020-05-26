package package2;
import package1.KelasA;

public class KelasB  extends  KelasA{
    @Override
    protected void methodC(){
        super.methodC();
        System.out.println("Contoh Pemanggilan Proctected Dari Package Luar");
    }

}
