package com.ecom.electronics.config;

import com.ecom.electronics.entity.Category;
import com.ecom.electronics.entity.Product;
import com.ecom.electronics.entity.Role;
import com.ecom.electronics.entity.User;
import com.ecom.electronics.repository.CategoryRepository;
import com.ecom.electronics.repository.ProductRepository;
import com.ecom.electronics.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    public DatabaseInitializer(CategoryRepository categoryRepository,
                               ProductRepository productRepository,
                               UserRepository userRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        if (categoryRepository.count() == 0) {
            Category c1 = categoryRepository.save(new Category("Laptops & Computers", "laptops-computers", "High performance laptops and accessories", "img/laptop.png"));
            Category c2 = categoryRepository.save(new Category("Smartphones & Tablets", "smartphones-tablets", "Flagship mobile devices", "img/smartphone.png"));
            Category c3 = categoryRepository.save(new Category("Audio & Headphones", "audio-headphones", "Premium noise-canceling sound gear", "img/headphones.png"));
            Category c4 = categoryRepository.save(new Category("Wearables & Smartwatches", "wearables-smartwatches", "Fitness and health smart trackers", "img/smartwatch.png"));

            if (productRepository.count() == 0) {
                productRepository.saveAll(List.of(
                        new Product("UltraBook Pro 15 Laptop", "TechPro", "15.6\" QHD Display, Intel Core i7 13th Gen, 16GB RAM, 512GB NVMe SSD, Backlit Keyboard.", new BigDecimal("104999.00"), new BigDecimal("124999.00"), 25, true, "img/laptop.png", c1),
                        new Product("Galaxy Ultra Flagship Smartphone", "NovaTech", "6.8\" Dynamic AMOLED 120Hz, 200MP Triple Camera, 12GB RAM, 256GB Storage.", new BigDecimal("79999.00"), new BigDecimal("94999.00"), 18, true, "img/smartphone.png", c2),
                        new Product("Noise-Canceling Wireless Headphones", "AcousticLab", "Active Noise Cancellation, 40-hour Battery Life, Spatial Audio, Ultra-soft Memory Foam.", new BigDecimal("19999.00"), new BigDecimal("24999.00"), 40, true, "img/headphones.png", c3),
                        new Product("Smart Health & Fitness Watch v5", "PulseGear", "Vivid AMOLED Display, Heart Rate & SpO2 Monitoring, GPS Built-in, 50m Water Resistant.", new BigDecimal("14499.00"), new BigDecimal("17999.00"), 30, true, "img/smartwatch.png", c4),
                        new Product("Ergonomic Precision Wireless Mouse", "TechPro", "Dual Connectivity (Bluetooth & 2.4GHz), 4000 DPI Optical Sensor, Quiet Click Switches.", new BigDecimal("3999.00"), new BigDecimal("4999.00"), 50, false, "img/laptop.png", c1),
                        new Product("High-Speed Portable NVMe SSD 1TB", "ByteSpeed", "Read speeds up to 1050MB/s, USB 3.2 Gen 2 Type-C, Shock-resistant aluminum casing.", new BigDecimal("8999.00"), new BigDecimal("11499.00"), 35, false, "img/laptop.png", c1),
                        new Product("True Wireless Studio Earbuds", "AcousticLab", "Custom 11mm Drivers, Active Noise Cancellation, IPX4 Water Resistance, Wireless Charging.", new BigDecimal("9999.00"), new BigDecimal("12999.00"), 22, false, "img/headphones.png", c3),
                        new Product("Slim Protective Case for Flagship Phone", "NovaTech", "Drop-tested military grade protection, Anti-yellowing TPU material, Raised screen bezels.", new BigDecimal("1999.00"), new BigDecimal("2499.00"), 100, false, "img/smartphone.png", c2)
                ));
            }
        }

        if (userRepository.count() == 0) {
            userRepository.save(new User("John Customer", "john@example.com", "password123", "+91-9876543210", "Flat 402, Lotus Heights, Indiranagar, Bengaluru, Karnataka", Role.ROLE_CUSTOMER));
            userRepository.save(new User("Admin User", "admin@techmart.com", "admin123", "+91-9876543211", "Plot 100, Cyber City, Gurugram, Haryana", Role.ROLE_ADMIN));
        }
    }
}
