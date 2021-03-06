/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bjm.mbean;

import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.bjm.ejb.facade.ReferenceDataFacadeLocal;
import org.bjm.model.State;

/**
 *
 * @author root
 */

@Named(value = "referenceDataMBean")
@RequestScoped
public class ReferenceDataMBean {
    
    private static final Logger LOGGER=Logger.getLogger(ReferenceDataMBean.class.getName());
    
    
    @Inject
    private ReferenceDataFacadeLocal referenceDataFacadeLocal;
    
    private List<State> states;
    
    @PostConstruct
    public void init(){
        states=referenceDataFacadeLocal.getStates();
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }
    
    
    
    
    
}
