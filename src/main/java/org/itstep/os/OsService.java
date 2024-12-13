package org.itstep.os;

import org.itstep.smart.Smart;
import org.itstep.smart.SmartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OsService {
    @Autowired
    OsRepo osRepository;

    public List<Os> findAll() {
        return osRepository.findAll(); //список всех смартфонов
    }

    public Os save(Os os) {
        return osRepository.save(os);
    }

    public Os findById(Long id) {
        return osRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        osRepository.deleteById(id);
    }
} 