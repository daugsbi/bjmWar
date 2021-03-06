/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bjm.ejb;

import java.util.List;
import javax.ejb.Local;
import org.bjm.model.Essay;
import org.bjm.model.view.AbuseReport;
import org.bjm.vo.ContactVO;

/**
 *
 * @author root
 */
@Local
public interface MiscellaneousServicesBeanLocal {
    
    public List<Essay> getAllEssays();
    
    public Essay addEssay(Essay essay);
    
    public List<AbuseReport> getAbusesReportedByUser(int userId);
    
    public void sendContactUsMessage(ContactVO contactVO);
    
}
