package ssx.dao;

import org.springframework.stereotype.Repository;
import ssx.entity.POJOL;

import java.util.List;

@Repository
public interface IDaoL {

    List<POJOL> selectAll();

    boolean addOne(String name);

}
