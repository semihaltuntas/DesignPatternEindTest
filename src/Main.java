import be.vdab.eiland.Eiland;
import be.vdab.eiland.events.Vulkaan;
import be.vdab.eiland.inwoners.InwonerType;
import be.vdab.eiland.inwoners.InwonersEiland;

import java.nio.file.Path;

public class Main {


    public static void main(String[] args) {

        Eiland eiland = Eiland.INSTANCE;

        Path PATH = Path.of("inwoners.txt");

        eiland.voegEilandBewonerToeAanEiland(String.valueOf(PATH));
        eiland.getInwonersVAnEiland().forEach(System.out::println);

        Vulkaan etna = new Vulkaan("Etna");
        eiland.voegVulkaanToe(etna);

        InwonersEiland newInwoner = eiland.getBewoner(InwonerType.V, "Vleermuis");
        eiland.voegEilandInwonerToe(newInwoner);
        System.out.println("------");
        eiland.getInwonersVAnEiland().forEach(System.out::println);

        InwonersEiland newInwoner1= eiland.getBewoner(InwonerType.M,"Burak");
        eiland.voegEilandInwonerToe(newInwoner1);
        System.out.println("------");
        eiland.getInwonersVAnEiland().forEach(System.out::println);


        eiland.getInwonersVAnEiland().forEach((bewoner) -> etna.voegVulkaanObserverToe(bewoner));
        System.out.println("------");
        etna.getVulkaanObservers().forEach(System.out::println);


        etna.startMetUitBarsten();
        System.out.println("------");
        etna.stopMetUitBarsten();


    }
}