package modules;

import lombok.Data;

@Data
public class СonvenienceTechique extends Technique {
    private String name;
    private int power;
    private boolean connection;
    private boolean goodCondition;
    private  boolean countOfspeed;
    private int cOfspeed;
    private boolean heating;
    private int rangeOftemperature;

    public СonvenienceTechique(String name, int power, boolean connection, boolean goodCondition, boolean countOfspeed, int cOfspeed, boolean heating, int rangeOftemperature) {
        this.name = name;
        this.power = power;
        this.connection = connection;
        this.goodCondition = goodCondition;
        this.countOfspeed = countOfspeed;
        this.cOfspeed = cOfspeed;
        this.heating = heating;
        this.rangeOftemperature = rangeOftemperature;
    }
}
