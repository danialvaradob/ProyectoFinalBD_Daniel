/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author danielalvarado
 */
public class Activity {
    private int code;
    private String name;
    private String description;
    private ConfigurableScreenType confScren;
    private SignatureType signature;
    private SecurityRole securityRole;
    private final List <Activity> previousActivities = new ArrayList <>();
    private boolean complete;
    
    public Activity(int _code,String _name, String _description,ConfigurableScreenType _confScreen,
            SignatureType _signature, SecurityRole _role) {
        this.code = _code;
        this.description = _description;
        this.confScren = _confScreen;
        this.signature = _signature;
        this.securityRole = _role;
        this.complete = false;
    }
    
    public int getCode() {return this.code;}
    public void setCode(int _code) {
        this.code = _code;
    }
    
    public String getName() {return this.name;}
    public void setName(String _name) {
        this.name = _name;
    }
    
    public String getDescription() {return this.description;}
    public void setDescription(String _descprition) {
        this.description = _descprition;
    }
    
    public ConfigurableScreenType getScreenType() {return this.confScren;}
    public void setScreenType(ConfigurableScreenType _type) {
        this.confScren = _type;
    }
    
    public SignatureType getSignatureType() {return this.signature;}
    public void setSignatureType(SignatureType _type) {
        this.signature = _type;
    }
    public SecurityRole getSecurityRole() {return this.securityRole;}
    public void setSecurityRole(SecurityRole _role) {
        this.securityRole = _role;
    }
    
    public List <Activity> getPreviousActivities() {
        return this.previousActivities;
    }
    
    public boolean activityCompleted() {return this.complete;}
    public void finishActivity() {this.complete = true;} 
}
