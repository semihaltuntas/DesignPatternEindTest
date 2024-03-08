package be.vdab.eiland;

import be.vdab.eiland.events.TornadoAlarm;
import be.vdab.eiland.events.TornadoAlarmObserver;
import be.vdab.eiland.events.Vulkaan;
import be.vdab.eiland.inwoners.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public enum Eiland {
    INSTANCE;

    private final Set<InwonersEiland> inwonersVAnEiland = new LinkedHashSet<>();
    public Set<Vulkaan> vulkaans = new LinkedHashSet<>();
    private TornadoAlarm tornadoAlarms = new TornadoAlarm("");

    public Set<InwonersEiland> getInwonersVAnEiland() {
        return inwonersVAnEiland;
    }

    public Set<Vulkaan> getVulkaans() {
        return vulkaans;
    }



    public void voegEilandBewonerToe(InwonersEiland inwoners){
        inwonersVAnEiland.add(inwoners);
    }
    public void voegVulkaanToe(Vulkaan vulkaan) {
        if (vulkaan != null) {
            vulkaans.add(vulkaan);
            inwonersVAnEiland.forEach(vulkaan::voegVulkaanObserverToe);
        }
    }
    public void voegTornadoToe(TornadoAlarm tsunami) {
        if (tsunami != null) {
            tornadoAlarms = tsunami;
            for (var bewoner : inwonersVAnEiland) {
                if (bewoner instanceof TornadoAlarmObserver) {
                    tornadoAlarms.addTsunamiObservers((TornadoAlarmObserver) bewoner);
                }
            }
        }
    }
    public void voegEilandInwonerToe(InwonersEiland inwoner) {
        if (inwoner != null) {
            inwonersVAnEiland.add(inwoner);
            vulkaans.forEach(vulkaan -> vulkaan.voegVulkaanObserverToe(inwoner));
        } else {
            throw new RuntimeException(" Je kan geen vulkaan aan een eiland toevoegen ");
        }
    }
}
