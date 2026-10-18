-- Seed Data for Ecom Electronics Database

-- Categories
INSERT INTO categories (id, name, slug, description, image_url) VALUES
(1, 'Laptops & Computers', 'laptops-computers', 'High performance laptops, desktops, and computing accessories', 'img/laptop.png'),
(2, 'Smartphones & Tablets', 'smartphones-tablets', 'Flagship smartphones, tablets, and mobile devices', 'img/smartphone.png'),
(3, 'Audio & Headphones', 'audio-headphones', 'Noise-canceling headphones, wireless earbuds, and speakers', 'img/headphones.png'),
(4, 'Wearables & Smartwatches', 'wearables-smartwatches', 'Smartwatches, fitness bands, and health trackers', 'img/smartwatch.png');

-- Users (Demo Accounts: Password is 'password123')
INSERT INTO users (id, full_name, email, password, phone, address, role) VALUES
(1, 'John Customer', 'john@example.com', 'password123', '+91-9876543210', 'Flat 402, Lotus Heights, Indiranagar, Bengaluru, Karnataka', 'ROLE_CUSTOMER'),
(2, 'Admin User', 'admin@techmart.com', 'admin123', '+91-9876543211', 'Plot 100, Cyber City, Gurugram, Haryana', 'ROLE_ADMIN');

-- Products (Prices in INR)
INSERT INTO products (id, name, brand, description, price, old_price, rating, review_count, stock_quantity, in_stock, featured, image_url, category_id) VALUES
(1, 'UltraBook Pro 15 Laptop', 'TechPro', '15.6" QHD Display, Intel Core i7 13th Gen, 16GB RAM, 512GB NVMe SSD, Backlit Keyboard, All-day Battery Life.', 104999.00, 124999.00, 4.8, 124, 25, TRUE, TRUE, 'img/laptop.png', 1),
(2, 'Galaxy Ultra Flagship Smartphone', 'NovaTech', '6.8" Dynamic AMOLED 120Hz, 200MP Triple Camera, 12GB RAM, 256GB Storage, 5000mAh Battery, 5G Capable.', 79999.00, 94999.00, 4.7, 98, 18, TRUE, TRUE, 'img/smartphone.png', 2),
(3, 'Noise-Canceling Wireless Headphones', 'AcousticLab', 'Active Noise Cancellation, 40-hour Battery Life, Spatial Audio, Ultra-soft Memory Foam Earcups, Bluetooth 5.3.', 19999.00, 24999.00, 4.9, 210, 40, TRUE, TRUE, 'img/headphones.png', 3),
(4, 'Smart Health & Fitness Watch v5', 'PulseGear', 'Vivid AMOLED Display, Continuous Heart Rate Monitoring, SpO2 & Sleep Tracking, GPS Built-in, 50m Water Resistant.', 14499.00, 17999.00, 4.6, 85, 30, TRUE, TRUE, 'img/smartwatch.png', 4),
(5, 'Ergonomic Precision Wireless Mouse', 'TechPro', 'Dual Connectivity (Bluetooth & 2.4GHz), 4000 DPI Optical Sensor, Quiet Click Switches, Rechargeable Type-C.', 3999.00, 4999.00, 4.5, 62, 50, TRUE, FALSE, 'img/laptop.png', 1),
(6, 'High-Speed Portable NVMe SSD 1TB', 'ByteSpeed', 'Read speeds up to 1050MB/s, USB 3.2 Gen 2 Type-C, Shock-resistant aluminum casing, Compact pocket size.', 8999.00, 11499.00, 4.8, 145, 35, TRUE, FALSE, 'img/laptop.png', 1),
(7, 'True Wireless Studio Earbuds', 'AcousticLab', 'Custom 11mm Drivers, Active Noise Cancellation, IPX4 Water Resistance, Wireless Charging Case, Touch Controls.', 9999.00, 12999.00, 4.4, 73, 22, TRUE, FALSE, 'img/headphones.png', 3),
(8, 'Slim Protective Case for Flagship Phone', 'NovaTech', 'Drop-tested military grade protection, Anti-yellowing TPU material, Raised bezels for screen & camera protection.', 1999.00, 2499.00, 4.3, 41, 100, TRUE, FALSE, 'img/smartphone.png', 2);
