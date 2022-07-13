package ru.javaops.bootjava.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.javaops.bootjava.model.Address;
import ru.javaops.bootjava.model.UserDetails;
import ru.javaops.bootjava.repository.AddressRepository;
import ru.javaops.bootjava.repository.UserDetailsRepository;

import java.util.ArrayList;

@Service
public class UserDetailService {
    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    AddressService addressService;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(UserDetails userDetails) {
        userDetailsRepository.save(userDetails);

    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Integer AddressId) {

        UserDetails userDetails = new UserDetails();
        userDetails.setEmail("sdfdsf");
        userDetails.setName("John");



        ArrayList<Address> list1 = new ArrayList<>();
        Address address = addressRepository.findById(AddressId);
        list1.add(address);

      //  address1.setUserDetails(userDetails);//

        userDetails.setAddresses(list1);
        userDetailsRepository.save(userDetails);

    }

    @Transactional(propagation =  Propagation.REQUIRES_NEW)
    public void delete (){
        UserDetails userDetails = userDetailsRepository.findAll().get(0);
       // Address address = addressRepository.findById(userDetails.getAddresses().get(0).getId());
      //  address.setUserDetails(null);
        userDetailsRepository.delete(userDetails);

    }


}
