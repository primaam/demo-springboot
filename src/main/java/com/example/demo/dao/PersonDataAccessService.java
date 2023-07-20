package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao{

    @Override
    public int insertPerson(UUID id, Person person) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertPerson'");
    }

    @Override
    public List<Person> selectAllPeople() {
        // return null;
        // String name;
        
        Person personData = new Person(UUID.randomUUID(), "test");
        return Arrays.asList(personData);
        // UUID personId = personData.getId();
        // String personName = personData.getName();

        // return
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectPersonById'");
    }

    @Override
    public int deletePersonById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePersonById'");
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePersonById'");
    }
    
}
