-- Viết các câu lệnh sql thực hiện các công việc sau:
-- 1. Tạo database quản lý thông tin sản phẩm
CREATE DATABASE IF NOT EXISTS ProductManager;

-- 2. Tạo bảng sản phẩm chứa các thông tin : mã sản phẩm, tên sản phẩm, mô tả, số lượng, giá bán
CREATE TABLE products (
    maSanPham INT PRIMARY KEY AUTO_INCREMENT,
    tenSanPham VARCHAR(50) NOT NULL,
    moTaSanPham VARCHAR(100),
    SoLuong FLOAT,
    gia FLOAT
);

-- 3. Thêm thông tin cho 5 sản phẩm
INSERT INTO products 
    (
        tenSanPham,
        moTaSanPham,
        SoLuong,
        gia   
    ) 
    VALUES 
    (
        'Banh my SAi Gon',
        'Dac biet thom bo',
        500,
        1000
    ),
    (
        'Xoi mit sau rieng',
        'Vang nhu mat',
        700,
        35000
    ),
    (
        'Che cung dinh',
        'bo than trang duong',
        500,
        1000
    ),
    (
        'Sofa da ca sau',
        'cam xuc khong the tot hon',
        500,
        10000000
    ),
    (
        'game Naruto Dish DC',
        'Endgame',
        800,
        10000
    );