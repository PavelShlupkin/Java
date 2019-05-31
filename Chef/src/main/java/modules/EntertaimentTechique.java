package modules;

import lombok.Data;

@Data
public class EntertaimentTechique extends Technique {
    private String name;
    private int power;
    private boolean connection;
    private boolean goodCondition;
    private boolean internetAccess;
    private boolean USBConnector;
    private int dB;

    public EntertaimentTechique(String name, int power, boolean connection, boolean goodCondition, boolean internetAccess, boolean USBConnector, int dB) {
        this.name = name;
        this.power = power;
        this.connection = connection;
        this.goodCondition = goodCondition;
        this.internetAccess = internetAccess;
        this.USBConnector = USBConnector;
        this.dB = dB;
    }
}
