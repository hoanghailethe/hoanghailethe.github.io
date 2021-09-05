# Homework 17. Topic Cache
===
## Questions?

1. Ứng dụng web lúc lập trình chạy tốt, khi triển khai ở môi trường thật (production) có những yếu tố nào khiến nó chạy không đúng theo yêu cầu?
2. Lập trình viên cần kiểm thử tốc độ (load test) vào giai đoạn nào của dự án?
3. Thời gian phản hồi của trang ảnh hưởng thế nào đến trải nghiệm sử dụng của người dùng?
4. Giải thích các tham số trong lệnh kiểm thử sau đây
```
hey -n 4000 -c 100 http://localhost:8080
```
5. Những yếu tố nào khiến web site chậm?
6. Làm sao để tăng tốc một Spring Boot web site? Cứ trả lời theo cách bạn nghĩ?
7. Phần khó nhất của caching là phần nào?
8. Giải thích annotation sau đây:
 - @EnableCaching
 - @Cacheable
 - @CachePut
 - @CacheEvict xem bài này [Cache Eviction in Spring Boot](https://www.baeldung.com/spring-boot-evict-cache)
9. Hãy copy đoạn lệnh giả lập trễ trong ví dụ mẫu vào đây
---
## Answers:
1. Các yếu tố chủ quan và khách quan có thể ảnh hưởng:
- Chủ quan:
    - code xử lý logic không tối ưu, hoặc có bug. Đôi khi lỗi ở một công đoạn có thể làm cả hệ thống nghẽn
    - Mô hình kiến trúc thiết kế không tốt, hoặc không tính toán sức tải khiến server sập.
    - Không được kiểm tra tải hoặc kiểm tra vận hành trước khi deploit
    - Sử dụng ngôn ngữ không phu hợp hoặc công nghệ cũ
    - Bị tấn công mạng mà không có biện pháp phòng ngừa
- Khách quan:
    - Băng thông thấp, đường truyền kém
    - Nghẽn mạng
2. Lập trình viên cần kiểm thử load test ngay trong giai đoạn thực hiện code của dự án, và giai đoạn chạy test sau khi hoàn thành code sơ bộ. Nói chung tất cả các đoạn code phải được test trước khi bàn giao hoặc chạy.
3. Thời gian phản hồi lâu khiến trải nghiệm người dùng giảm mạnh, họ sẽ thoát khỏi trang và đi tìm thông tin trên các web hoặc dịch vụ khác.
4. Câu lệnh trên sẽ send tổng cộng 4000 request tới đường dẫn http://localhost:8080, mà luôn đảm bảo duy trì 100 request đồng thời active. Từ đó sẽ thống kê thời gian phản hồi và những số liệu khác để đo performance.
5. Những yếu tố khiến server chậm:
    - Code thiếu tối ưu: code thừa, đọc liên tục từ ổ cứng, lệnh SQL không tối ưu
    - Chọn ngôn ngữ và framework không phù hợp
    - Kiến trúc microservice không hợp lý gây chậm
    - Mạng bị nghẽn, băng thông thấp, đường truyền chậm.
6. Làm sao để tăng tốc một SpringBoot website:
    - Code logic tốt và tối ưu ở cac khâu DB, Service, Controller, hạn chế đọc ghe ổ cứng
    - Xây dựng kiến trúc website hợp lý ở backend, tinh gọn và phù hợp
    - Tối ưu thuật toán xử lý
    - Sử dụng Cache
    - Kết hợp các framework frontEnd khác như React, Vue để giảm tải xử lý phía server
    - Nâng cấp gói mạng tốt nhất
    - Dùng dịch vụ cloud đắt nhất
7. Phần khó nhất của Cache là invalidate caching, làm sao để cập nhật hoặc xóa bỏ các cache kịp thời và tối ưu nhất.
8. Các annotation sau có chức năng:
    - @EnableCaching: Cho phép ứng dụng này sử dụng caching
    - @Cacheable: Dùng trên một method, lưu lại kết quả của method này cho các lần request sau
    - @CachePut: Cập nhật kết quả cache của một method
    - @CacheEvict: Dùng để xóa bỏ đi một cache.
9. Đoạn code gây delay ứng dụng trong demo:
```java
private void simulateSlowService() {
    try {
      long time = 3000L;
      Thread.sleep(time);
    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
  }
```
Sau đó cho vào các method:
```java
public List<Product> getAll() {
    simulateSlowService();
    return products;
  }
```