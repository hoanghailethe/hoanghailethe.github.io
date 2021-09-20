Homework SB 31
===
## Topic: Jpa relation, mySQL 

---
## Requirements 
Tạo các Entity sau:
- Product: id ,name, price
- Product Detail: id, name
- Category: id,name
- Brand: id,name

Các entity có các quan hệ:
- Product và Product Detail: One To Many
- Category và Product: One to Many
Brand và Category: One to Many
THực hiện các thao tác hiển thị trên Thymeleaf:

Trang chủ:
Hiển thị các Category:
- Tạo Category:
- Hiển thị Product List:

Tạo Product/Edit Product:
- HIển thị Brand
- Tạo mới Brand/Cập nhật Brand

##Steps:
**Bước 1** : Tạo project và thêm các dependency: Lombok, JPA, Web, Dev tools, Bootstrap, MySQl connector, thymeleaf
**Bước 2** Application properties
```
server.port=8001
spring.jpa.hibernate.ddl-auto=update
# spring.jpa.properties.hibernate.hbm2ddl.import_files=product.sql
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/salesdb?useSSL=false&serverTimezone=UTC
spring.datasource.username = root
spring.datasource.password = root

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql = true;
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
logging.level.org.hibernate = ERROR
```
**Bước 3** Tạo các loại Data Access Object ứng với các Entity và Table trong mySQL, và theo các mối quan hệ đề bài quy ước.
Product class

Detail 

Category 

Brand 