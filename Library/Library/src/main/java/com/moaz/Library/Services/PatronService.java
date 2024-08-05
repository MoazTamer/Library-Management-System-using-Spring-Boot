package com.moaz.Library.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moaz.Library.Repositories.PatronRepository;
import com.moaz.Library.exception.ResourceNotFoundException;
import com.moaz.Library.untity.Patron;

@Service
public class PatronService {
    @Autowired
    private PatronRepository patronRepository;

    public List<Patron> getAllPatrons() {
        return patronRepository.findAll();
    }

    public Patron getPatronById(Long id) {
        return patronRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Patron not found"));
    }

    public Patron createPatron(Patron patron) {
        return patronRepository.save(patron);
    }

    public Patron updatePatron(Long id, Patron patronDetails) {
        Patron patron = patronRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Patron not found"));
        patron.setName(patronDetails.getName());
        patron.setContactInfo(patronDetails.getContactInfo());
        return patronRepository.save(patron);
    }

    public void deletePatron(Long id) {
        Patron patron = patronRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Patron not found"));
        patronRepository.delete(patron);
    }
}
