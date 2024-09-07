package com.parthiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parthiv.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
