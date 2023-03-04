package com.driver.services;

import com.driver.model.Admin;
import com.driver.model.Country;
import com.driver.model.ServiceProvider;

public interface AdminService {
    Admin register(String username, String password);

    Admin addServiceProvider(int adminId, String providerName);

    ServiceProvider addCountry(int serviceProviderId, String countryName) throws Exception;

    Admin registerAdmin(Admin admin);
    ServiceProvider addServiceProvider(String adminId, ServiceProvider serviceProvider);
    Country addCountry(String adminId, String serviceProviderId, String countryName);
}