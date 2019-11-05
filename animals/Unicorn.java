interface canTalk {
    void talk();
}

interface canDoMagic {
    void doSparkles();
}


abstract class MythicalAnimal implements canTalk, canDoMagic {
    public void doSparkles() {
        System.out.println("Oh! Une etincelle de lumiere *\\*|*/* ");
    }
}

class Unicorn extends MythicalAnimal implements Comparable<Unicorn>{
    private String name = "Pataclop";
    Unicorn() {
        super();
        System.out.println("A unicorn is born");  
    }
    public void talk() {
        System.out.println("Mon nom est " + this.name);    
    }

    @Override
	public int compareTo(Unicorn other) {
	    return this.name.compareTo( other.name);
	}
}

class Pandicorn extends MythicalAnimal {
    Pandicorn() {
        System.out.println("A pandicorn is born");  
    }
    public void talk() {
        System.out.println("J'aime bien manger Vegetarien.");    
    }
}