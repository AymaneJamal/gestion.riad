package com.webbin.gestion.riad.service.impl;


import com.webbin.gestion.riad.model.Prix;
import com.webbin.gestion.riad.repository.PrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrixServiceImpl implements PrixService{
    @Autowired
    private PrixRepository priceRepository;

    @Override
    public Prix createPrix(Prix price) {
        return priceRepository.save(price);
    }

    @Override
    public Prix getPrixById(Long id) {
        Optional<Prix> price = priceRepository.findById(id);
        return price.orElse(null);
    }

    @Override
    public Prix updatePrix(Long id, Prix price) {
        if (priceRepository.existsById(id)) {
            price.setId(id);
            return priceRepository.save(price);
        } else {
            return null;
        }
    }

    @Override
    public void deletePrix(Long id) {
        priceRepository.deleteById(id);
    }

    @Override
    public List<Prix> getAllPrix() {
        return priceRepository.findAll();
    }
}
