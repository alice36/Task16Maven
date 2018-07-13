package sterowniki;

import org.springframework.stereotype.Component;

@Component
public class SmartHome {
    private SterownikGlosnika sterownikGlosnika;
    private SterownikPieca sterownikPieca;
    private SterownikRolet sterownikRolet;

    public SmartHome( SterownikGlosnika sterownikGlosnika, SterownikPieca sterownikPieca, SterownikRolet sterownikRolet) {
        this.sterownikGlosnika = sterownikGlosnika;
        this.sterownikPieca = sterownikPieca;
        this.sterownikRolet = sterownikRolet;
    }

    public void smartHome(){
        sterownikGlosnika.showInfo();
        sterownikPieca.piec();
        sterownikRolet.rolety();
    }
}
