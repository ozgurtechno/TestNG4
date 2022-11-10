package Gun02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Dependency {

    // arabanın hareketleri : start, drive, park, stop   hareket sırası

    @Test
    void startCar()
    {
        System.out.println("startCar");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"}) // bu testin çalışması, startCar ın hatasız çalışmasına bağımlı
    void driveCar()
    {
        System.out.println("driveCar");
    }

    @Test(dependsOnMethods = {"startCar","driveCar"})
    void parkCar()
    {
        System.out.println("parkCar");
    }

    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true)   //alwaysRun = true bağımlılıkları var ama hata çıkarsa da yine çalıştır
    void stopCar()
    {
        System.out.println("stopCar");
    }

    // aynı seviyedeki testleri için priority verilebilir.
    // bağımlı testler, direk metodundan çalıştırdığınızda bağımlı olduğu metod zincirinde 2 üste kadar ototmatik çağırıp çalışabilir.
}
