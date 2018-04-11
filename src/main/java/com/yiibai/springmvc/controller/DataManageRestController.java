package com.yiibai.springmvc.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.yiibai.springmvc.model.Company;
import com.yiibai.springmvc.service.CompanyService;
 
@RestController
public class DataManageRestController {
 
    @Autowired
    CompanyService companyService;  //Service which will do all data retrieval/manipulation work
 
    
    //-------------------Retrieve All companys--------------------------------------------------------
     
    @RequestMapping(value = "/company/", method = RequestMethod.GET)
    public ResponseEntity<List<Company>> listAllcompanys() {
        List<Company> companys = companyService.findAllCompanys();
        if(companys.isEmpty()){
            return new ResponseEntity<List<Company>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Company>>(companys, HttpStatus.OK);
    }
 
 
    
    //-------------------Retrieve Single company--------------------------------------------------------
     
    @RequestMapping(value = "/company/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Company> getcompany(@PathVariable("id") long id) {
        System.out.println("Fetching company with id " + id);
        Company company = companyService.findById(id);
        if (company == null) {
            System.out.println("company with id " + id + " not found");
            return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Company>(company, HttpStatus.OK);
    }
 
     
     
    //-------------------Create a company--------------------------------------------------------
     
    @RequestMapping(value = "/company/", method = RequestMethod.POST)
    public ResponseEntity<Void> createcompany(@RequestBody Company company,    UriComponentsBuilder ucBuilder) {
        System.out.println("Creating company " + company.getCompanyName());
 
        if (companyService.isCompanyExist(company)) {
            System.out.println("A company with name " + company.getCompanyName() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
 
        companyService.saveCompany(company);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/company/{id}").buildAndExpand(company.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
 
    
     
    //------------------- Update a company --------------------------------------------------------
     
    @RequestMapping(value = "/company/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Company> updatecompany(@PathVariable("id") long id, @RequestBody Company company) {
        System.out.println("Updating company " + id);
         
        Company currentcompany = companyService.findById(id);
         
        if (currentcompany==null) {
            System.out.println("company with id " + id + " not found");
            return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
        }
 
        currentcompany.setCompanyname(company.getCompanyName());
        currentcompany.setAddress(company.getAddress());
        currentcompany.setEmail(company.getEmail());
         
        companyService.updateCompany(currentcompany);
        return new ResponseEntity<Company>(currentcompany, HttpStatus.OK);
    }
 
    
    
    //------------------- Delete a company --------------------------------------------------------
     
    @RequestMapping(value = "/company/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Company> deletecompany(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting company with id " + id);
 
        Company company = companyService.findById(id);
        if (company == null) {
            System.out.println("Unable to delete. company with id " + id + " not found");
            return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
        }
 
        companyService.deleteCompanyById(id);
        return new ResponseEntity<Company>(HttpStatus.NO_CONTENT);
    }
 
     
    
    //------------------- Delete All companys --------------------------------------------------------
     
    @RequestMapping(value = "/company/", method = RequestMethod.DELETE)
    public ResponseEntity<Company> deleteAllcompanys() {
        System.out.println("Deleting All companys");
 
        companyService.deleteAllCompanys();
        return new ResponseEntity<Company>(HttpStatus.NO_CONTENT);
    }
 
}