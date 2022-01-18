package ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ticket.entity.ConcertInfoEntity;
import ticket.repository.ConcertInfoRepository;

@Service
public class ConcertInfoServiceImpl implements ConcertInfoService {

    @Autowired
    ConcertInfoRepository concertInfoRepository;

    @Override
    public void saveConcertInfo(ConcertInfoEntity concertInfoEntity) throws Exception {
        concertInfoRepository.save(concertInfoEntity);
    }

    @Override
    public void deleteConcertInfo(long cId) throws Exception {

    }
}