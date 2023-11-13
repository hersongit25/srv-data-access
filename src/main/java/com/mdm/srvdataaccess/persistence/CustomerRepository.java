package com.mdm.srvdataaccess.persistence;

import org.springframework.data.repository.CrudRepository;
import com.mdm.srvdataaccess.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
