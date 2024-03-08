package be.vdab.eiland;

import be.vdab.eiland.inwoners.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public enum EilandFactory {
    INSTANCE;
    public InwonersEiland getBewoner(InwonerType soort, String naam) {
        return switch (soort) {
            case V -> new Vogel(naam);
            case Z -> new Zoogdier(naam);
            case M -> new Mensen(naam);
            case B -> new BodemDieren(naam);
        };
    }
    public void voegEilandBewonerToeAanEiland(String path, Eiland inwonersVanEiland) {
        try (var br = new BufferedReader(new FileReader(path))) {
            String regel = br.readLine();
            while (regel != null) {
                var splits = regel.split(" ");
                if (splits.length == 2) {
                    String soortInwoner = splits[0];
                    String naam = splits[1];
                    inwonersVanEiland.voegEilandBewonerToe(this.getBewoner(InwonerType.valueOf(soortInwoner), naam));
                }
                regel = br.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
