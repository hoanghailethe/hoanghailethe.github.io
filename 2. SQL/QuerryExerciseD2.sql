-- Sử dụng database sakila
-- 1. Tính tổng và trung bình thời lượng của các bộ phim theo từng mức rating 
SELECT rating, SUM(length) AS tong, AVG(length) AS trungBinh
FROM film
GROUP BY rating;

-- 2. Giá trị rental_rate lớn nhất và nhỏ nhất là bao nhiêu ?
SELECT MAX(rental_rate), MIN(rental_rate)
FROM film;

-- 3. Tính số lượng thành phố theo từng mã quốc gia
SELECT country_id AS MaQuocGia, COUNT(DISTINCT city) AS SoThanhPho
FROM city
GROUP BY country_id;