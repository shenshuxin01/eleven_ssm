package  ssx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ssx.dao.IDaoL;
import ssx.entity.POJOL;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceL {

    @Autowired
//    @Qualifier("iDaoL")
    IDaoL iDaoL;

    private HashMap<String, Object> map = new HashMap<String, Object>();

    public Map addOne(POJOL pojol){
        String userName = pojol.getUserName();
        boolean b = iDaoL.addOne(userName);
        map.clear();
        map.put("yesno",b);
        return map;
    }

    public Map queryAll(){
        List<POJOL> pojols = iDaoL.selectAll();
        map.clear();
        map.put("yesno","yes");
        map.put("allPOJO",pojols);
        return map;
    }


}
