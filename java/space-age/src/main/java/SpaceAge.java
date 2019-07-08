import java.util.HashMap;
import java.util.Map;

class SpaceAge {

    private final double seconds;
    private  final Map<String,Double> conversionFactor = new HashMap<String,Double>(){
        {
            put("mercury",1/0.2408467);
            put("venus",1/0.61519726);
            put("mars",1/1.8808158);
            put("jupiter",1/11.862615);
            put("saturn",1/29.447498);
            put("uranus",1/84.016846);
            put("neptune",1/164.79132);
        }
    };

    SpaceAge(double seconds) {
        this.seconds = seconds;

    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds/(365.25*24*60*60);
    }

    double onMercury() {
        return onEarth()*conversionFactor.get("mercury");
    }

    double onVenus() {
        return onEarth()*conversionFactor.get("venus");
    }

    double onMars() {
        return onEarth()*conversionFactor.get("mars");
    }

    double onJupiter() {
        return onEarth()*conversionFactor.get("jupiter");
    }

    double onSaturn() {
        return onEarth()*conversionFactor.get("saturn");
    }

    double onUranus() {
        return onEarth()*conversionFactor.get("uranus");
    }

    double onNeptune() {
        return onEarth()*conversionFactor.get("neptune");
    }

}
