package ticket.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ticket.entity.ConcertInfoEntity;

import java.util.List;

public interface ConcertInfoRepository extends CrudRepository<ConcertInfoEntity, Long>{

}
