/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Date;

/**
 *
 * @author danielalvarado
 */
public class ProductionOrder {

    private String noLote;
    private int idAsignedProduct;
    private Date creationDate;
    private Date finishedDate;
    private String status; //has to be changed to a Enum Status
    
    public ProductionOrder(String _noLote) {
        this.noLote = _noLote;
    }
    
    public ProductionOrder(String _noLote, int _id, Date _creationDate, Date _finishedDate,
            String _status) {
        this.noLote = _noLote;
        this.idAsignedProduct = _id;
        this.creationDate = _creationDate;
        this.finishedDate = _finishedDate;
        this.status = _status;
    }
    
    public String getNoLote() {return this.noLote;}
    
    public int getIdAsignedProd() {return this.idAsignedProduct;}
    public void setIdAsignedProd(int _id) {this.idAsignedProduct = _id;}
    
    public Date getCreationDate() {return this.creationDate;}
    
    public Date getFinishedDate() {return this.finishedDate;}
    
    public String getStatus() {return this.status;}
    
    
    private String newProductionNumber() {
        //TODO code; create a function that gets a new NoLote.
        return "";
    }
    
    
}
