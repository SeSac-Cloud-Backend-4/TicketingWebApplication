package ticket.service;

import ticket.entity.ConcertInfoEntity;

public interface ConcertInfoService {

    void saveConcertInfo(ConcertInfoEntity user) throws Exception;

    void deleteConcertInfo(long cInfoId) throws Exception;
}

