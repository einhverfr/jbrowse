package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * PhylogeneticNodeOrganism generated by hbm2java
 */
public abstract class AbstractPhylogeneticNodeOrganism extends AbstractSimpleObject implements java.io.Serializable {


     private Integer phylogeneticNodeOrganismId;
     private PhylogeneticNode phylogeneticNode;
     private Organism organism;

    public AbstractPhylogeneticNodeOrganism() {
    }

    public AbstractPhylogeneticNodeOrganism(PhylogeneticNode phylogeneticNode, Organism organism) {
       this.phylogeneticNode = phylogeneticNode;
       this.organism = organism;
    }
   
    public Integer getPhylogeneticNodeOrganismId() {
        return this.phylogeneticNodeOrganismId;
    }
    
    public void setPhylogeneticNodeOrganismId(Integer phylogeneticNodeOrganismId) {
        this.phylogeneticNodeOrganismId = phylogeneticNodeOrganismId;
    }
    public PhylogeneticNode getPhylogeneticNode() {
        return this.phylogeneticNode;
    }
    
    public void setPhylogeneticNode(PhylogeneticNode phylogeneticNode) {
        this.phylogeneticNode = phylogeneticNode;
    }
    public Organism getOrganism() {
        return this.organism;
    }
    
    public void setOrganism(Organism organism) {
        this.organism = organism;
    }



public AbstractPhylogeneticNodeOrganism generateClone() {
	AbstractPhylogeneticNodeOrganism cloned = new PhylogeneticNodeOrganism(); 
    	   cloned.phylogeneticNode = this.phylogeneticNode;
    	   cloned.organism = this.organism;
	return cloned;
}


}

