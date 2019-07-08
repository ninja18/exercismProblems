import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class DnDCharacter {
    private Map<String, Integer> abilities;
    private Random rand;

    public DnDCharacter() {
        abilities = new HashMap<String, Integer>() {
            {
                put("strength", 0);
                put("dexterity", 0);
                put("constitution", 0);
                put("intelligence", 0);
                put("wisdom", 0);
                put("charisma", 0);
            }
        };
        rand = new Random();
        for (String key : abilities.keySet()) {
            abilities.put(key, ability());
        }
        abilities.put("hitpoints", 10 + modifier(abilities.get("constitution")));

    }

    int ability() {
        int ability = 0;
        ability += 1+rand.nextInt(6);
        ability += 1+rand.nextInt(6);
        ability += 1+rand.nextInt(6);
        return ability;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10.0) / 2);
    }

    int getStrength() {
        return abilities.get("strength");
    }

    int getDexterity() {
        return abilities.get("dexterity");
    }

    int getConstitution() {
        return abilities.get("constitution");
    }

    int getIntelligence() {
        return abilities.get("intelligence");
    }

    int getWisdom() {
        return abilities.get("wisdom");
    }

    int getCharisma() {
        return abilities.get("charisma");
    }

    int getHitpoints() {
        return abilities.get("hitpoints");
    }

}
