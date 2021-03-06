
-- Bai 1, Tại bảng actor hãy thực hiện truy vấn sau:
-- Lấy first_name và last_name của toàn bộ actor và sắp xếp last_name theo alphabe
SELECT first_name, last_name 
FROM actor
ORDER BY last_name ASC;

-- Lấy thông tin actor có last_name bắt đầu bằng chữ D
SELECT *
FROM actor
WHERE last_name LIKE 'D%';

-- 2, Tại bảng film hãy thực hiện truy vấn sau:
-- - Lấy toàn bộ thông tin có rental_rate = 0.99 và có rating là PG
SELECT * 
FROM film
WHERE rental_rate = 0.99 AND rating = 'PG';

-- - Lấy tiêu đề, mô tả, độ dài, và giá thuê của phim có length từ 60 đến 90 và có rental_rate là 0.99 hoặc 2.99
SELECT title, description, length, rental_rate 
FROM film 
WHERE length BETWEEN 60 AND 90 
AND rental_rate IN (0.99, 2.99);

-- - Lấy tiêu đề và mô tả của phim có rental_duration nhỏ hơn 6, rating là PG hoặc PG 13 và sắp xếp phim theo tên theo thứ tự DESC
SELECT title, description
FROM film
WHERE rental_duration < 6 
AND rating IN ('PG', 'PG-13')
ORDER BY title DESC;

-- 3(Nâng cao, không bắt buộc), Thưc hiện truy vấn sau:
-- - Lấy tiêu đề, mô tả, độ dài, và giá thuê của phim có length từ 60 đến 90 và có rental_rate là 0.99 hoặc 2.99 và có thể loại là Drama, sắp xếp phim theo tên theo thứ tự ASC
	SELECT title, description, length, rental_rate, name
	FROM film, film_category, category
	WHERE length BETWEEN 60 AND 90 
	AND rental_rate IN (0.99, 2.99)
	AND film.film_id = film_category.film_id
	AND film_category.category_id = category.category_id
	AND name = 'Drama'
	ORDER BY title ASC;
