package be.vdab.eiland;

import be.vdab.eiland.events.Vulkaan;
import be.vdab.eiland.inwoners.InwonerType;
import be.vdab.eiland.inwoners.InwonersEiland;
import be.vdab.eiland.inwoners.Vogel;
import be.vdab.eiland.inwoners.Zoogdier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public enum Eiland {
    INSTANCE;

    private final Set<InwonersEiland> inwonersVAnEiland = new LinkedHashSet<>();
    public Set<Vulkaan> vulkaans = new LinkedHashSet<>();

    public Set<InwonersEiland> getInwonersVAnEiland() {
        return inwonersVAnEiland;
    }

    public Set<Vulkaan> getVulkaans() {
        return vulkaans;
    }

    public InwonersEiland getBewoner(InwonerType soort, String naam) {
        return switch (soort) {
            case V -> new Vogel(naam);
            case Z -> new Zoogdier(naam);
        };
    }

    public void voegEilandBewonerToeAanEiland(String path) {
        try (var br = new BufferedReader(new FileReader(path))) {
            String regel = br.readLine();
            while (regel != null) {
                var splits = regel.split(" ");
                if (splits.length == 2) {
                    String soortInwoner = splits[0];
                    String naam = splits[1];
                    //  System.out.println(soortInwoner);
                    //  System.out.println(naam);
                    inwonersVAnEiland.add(getBewoner(InwonerType.valueOf(soortInwoner), naam));
                }
                regel = br.readLine();
            }
          //  inwonersVAnEiland.forEach(System.out::println);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void voegVulkaanToe(Vulkaan vulkaan){
        if (vulkaan != null){
            vulkaans.add(vulkaan);
            inwonersVAnEiland.forEach(vulkaan::voegVulkaanObserverToe);
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
