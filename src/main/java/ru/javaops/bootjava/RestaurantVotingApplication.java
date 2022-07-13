package ru.javaops.bootjava;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ru.javaops.bootjava.config.BankReqv;
import ru.javaops.bootjava.model.Address;
import ru.javaops.bootjava.model.UserDetails;
import ru.javaops.bootjava.repository.AddressRepository;
import ru.javaops.bootjava.repository.UserDetailsRepository;
import ru.javaops.bootjava.repository.UserRepository;
import ru.javaops.bootjava.service.AddressService;
import ru.javaops.bootjava.service.UserDetailService;
import ru.javaops.bootjava.web.ExapleService;
import ru.javaops.bootjava.web.UsersJob;

import java.util.*;

@SpringBootApplication
@AllArgsConstructor
@EnableTransactionManagement
public class RestaurantVotingApplication implements CommandLineRunner  {

    @Autowired
    ExapleService exapleService;
    @Autowired
    UsersJob usersJob;
    @Autowired
    UserDetailsRepository userDetailsRepository;
    @Autowired
    AddressRepository addressRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserDetailService userDetailsService;

    @Autowired
    AddressService addressService;
    public static void main(String[] args) {
        SpringApplication.run(RestaurantVotingApplication.class, args);
    }


    @Override
    public void run(String... args)  {
        new ArrayList<>();

        System.out.println(userDetailsRepository.findAll().size());
        System.out.println(addressRepository.findAll().size());

        System.out.println("++++++++++++++++++++");



        addressService.save();
        Address address = addressRepository.findAll().get(0);
        Integer id = address.getId();
        userDetailsService.save( id);

        System.out.println("query!");
        List<UserDetails> user = userDetailsRepository.findAll();
        System.out.println("user ="+user.size());
        System.out.println(user);
        List<Address> all = addressRepository.findAll();
        System.out.println("address ="+all);
        System.out.println("userDetails="+all.get(0).getUserDetails());
        System.out.println(all.size());
        System.out.println();


        System.out.println("-------------------------delete============");
      //  addressService.delete();
      //  userDetailsService.delete();
        System.out.println("delete completed!!!!!!!!!!!!!!!!!!!");
        System.out.println("address after delete ="+addressRepository.findAll().size());
        System.out.println("address after delete ="+addressRepository.findAll());
        System.out.println("userDetails after delete = "+userDetailsRepository.findAll().size());
        new HashSet<>();
        List<String> myList = Arrays.asList("india", "australia", "england");
        String lang = "RU";
        Lang en = Lang.EN;
        en.setValue("EN");
        BankReqv bankInfo = new BankReqv(en);

        String s = Optional.ofNullable(bankInfo.getLagueg()).map(Lang::getValue).orElse(null);

        System.out.println(s);
    /*    myList.stream()
                .map(Lang::values)
                .map(String::toLowerCase).sorted().forEach(System.out :: println);*/

    }
}
