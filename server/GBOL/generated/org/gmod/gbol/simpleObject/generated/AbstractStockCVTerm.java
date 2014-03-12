package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * StockCVTerm generated by hbm2java
 */
public abstract class AbstractStockCVTerm extends AbstractSimpleObject implements java.io.Serializable {


     private Integer stockCVTermId;
     private Publication publication;
     private CVTerm cvterm;
     private Stock stock;

    public AbstractStockCVTerm() {
    }

    public AbstractStockCVTerm(Publication publication, CVTerm cvterm, Stock stock) {
       this.publication = publication;
       this.cvterm = cvterm;
       this.stock = stock;
    }
   
    public Integer getStockCVTermId() {
        return this.stockCVTermId;
    }
    
    public void setStockCVTermId(Integer stockCVTermId) {
        this.stockCVTermId = stockCVTermId;
    }
    public Publication getPublication() {
        return this.publication;
    }
    
    public void setPublication(Publication publication) {
        this.publication = publication;
    }
    public CVTerm getCvterm() {
        return this.cvterm;
    }
    
    public void setCvterm(CVTerm cvterm) {
        this.cvterm = cvterm;
    }
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractStockCVTerm) ) return false;
		 AbstractStockCVTerm castOther = ( AbstractStockCVTerm ) other; 
         
		 return ( (this.getPublication()==castOther.getPublication()) || ( this.getPublication()!=null && castOther.getPublication()!=null && this.getPublication().equals(castOther.getPublication()) ) )
 && ( (this.getCvterm()==castOther.getCvterm()) || ( this.getCvterm()!=null && castOther.getCvterm()!=null && this.getCvterm().equals(castOther.getCvterm()) ) )
 && ( (this.getStock()==castOther.getStock()) || ( this.getStock()!=null && castOther.getStock()!=null && this.getStock().equals(castOther.getStock()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getPublication() == null ? 0 : this.getPublication().hashCode() );
         result = 37 * result + ( getCvterm() == null ? 0 : this.getCvterm().hashCode() );
         result = 37 * result + ( getStock() == null ? 0 : this.getStock().hashCode() );
         return result;
   }   

public AbstractStockCVTerm generateClone() {
	AbstractStockCVTerm cloned = new AbstractStockCVTerm; 
    	   cloned.publication = this.publication;
    	   cloned.cvterm = this.cvterm;
    	   cloned.stock = this.stock;
	return cloned;
}


}

