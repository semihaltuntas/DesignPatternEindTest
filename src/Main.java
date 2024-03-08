import be.vdab.eiland.Eiland;
import be.vdab.eiland.EilandFactory;
import be.vdab.eiland.events.TornadoAlarm;
import be.vdab.eiland.events.Vulkaan;
import be.vdab.eiland.inwoners.InwonerType;
import be.vdab.eiland.inwoners.InwonersEiland;

import java.nio.file.Path;

public class Main {


    public static void main(String[] args) {

        Eiland eiland = Eiland.INSTANCE;

        Path PATH = Path.of("inwoners.txt");

        EilandFactory factory = EilandFactory.INSTANCE;
        factory.voegEilandBewonerToeAanEiland(String.valueOf(PATH),eiland);

        Vulkaan etna = new Vulkaan("Etna");
        eiland.voegVulkaanToe(etna);


        eiland.getInwonersVAnEiland().forEach((bewoner) -> etna.voegVulkaanObserverToe(bewoner));
        System.out.println("------");
        etna.getVulkaanObservers().forEach(System.out::println);

        System.out.println("********VULKAAN**********");

        etna.startMetUitBarsten();
        etna.stopMetUitBarsten();

        System.out.println("********TORNADO***********");

        TornadoAlarm tornado = new TornadoAlarm("De Tri-State");
        eiland.voegTornadoToe(tornado);

        tornado.notifyToestandOpkomstVanTornadoOpEiland();
        tornado.notifyToestandActiefTornadoOpEiland();
        tornado.notifyToestandStoptTornadoOpEiland();
    }
}