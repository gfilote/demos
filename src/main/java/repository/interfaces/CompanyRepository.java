package repository.interfaces;

import model.Company;

import java.util.List;

public interface CompanyRepository {

    public List findAll() throws Exception;

    public Company addCompany(Company company) throws Exception;

    public Company getCompanyById(String id) throws Exception;

    public Company updateCompany(String id, Company company) throws Exception;

    public void deleteCompany (String id) throws Exception;
}
