package modules;

import lombok.Data;

@Data
public class KitchenTechnique extends Technique {
    private String name;
    private int power;
    private boolean connection;
    private boolean goodCondition;
    private int guarantee;
    private boolean selfoff;

    public KitchenTechnique(String name, int power, boolean connection, boolean goodCondition, int guarantee, boolean selfoff) {
        this.name = name;
        this.power = power;
        this.connection = connection;
        this.goodCondition = goodCondition;
        this.guarantee = guarantee;
        this.selfoff = selfoff;
    }
}
