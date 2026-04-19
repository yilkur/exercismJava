class Fighter {
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    boolean spellReady = false;

    @Override
    public boolean isVulnerable() {
        return !this.spellReady;
    }
    
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        spellReady = true;   
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return spellReady ? 12 : 3;
    }
}

