import be.vdab.eiland.Eiland;
import be.vdab.eiland.events.Vulkaan;
import be.vdab.eiland.inwoners.InwonerType;
import be.vdab.eiland.inwoners.InwonersEiland;

public class Main {
    public static void main(String[] args) {
        Eiland eiland =  Eiland.INSTANCE;
        String path = "inwoners.txt";

        eiland.voegEilandBewonerToeAanEiland(path);
        eiland.getInwonersVAnEiland().forEach(System.out::println);

        Vulkaan vulkaan = new Vulkaan("Etna");
        eiland.voegVulkaanToe(vulkaan);

        InwonersEiland newInwoner= eiland.getBewoner(InwonerType.V,"Leeuw");
        eiland.voegEilandInwonerToe(newInwoner);
        System.out.println("***********");
        eiland.getInwonersVAnEiland().forEach(System.out::println);


        eiland.getInwonersVAnEiland().forEach((bewoner)->vulkaan.voegVulkaanObserverToe(bewoner));
        System.out.println("**********************");
        vulkaan.getVulkaanObservers().forEach(System.out::println);


        vulkaan.startMetUitBarsten();
        System.out.println("*************");
        vulkaan.stopMetUitBarsten();


    }
}