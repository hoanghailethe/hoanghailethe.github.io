01: Kiểm tra một số nhập vào từ bàn phím có phải là số nguyên tố hay không?
Số nguyên tố là số chỉ chia hết cho chính nó và 1. Các đơn giản (chậm) nhất để kiểm tra một số N có phải là số nguyên tố hay không là tạo một vòng lặp từ có biến i chạy từ 2 đến N-1. Lấy N chia cho i. Nếu chia hết thì thoát vòng lặp kết luận đây không phải số nguyên tố.

**Yêu cầu: **

Hãy tạo một vòng lặp để nhập các số từ bàn phím. Nếu nhập ký tự 'X' hay 'Q' thì thoát khỏi ứng dụng. Nếu nhập các chuỗi ký tự không phải là số thì in ra màn hình 'XYZ' không phải là số 
Nếu nhập số nguyên tố thì in ra màn hình 17 là số nguyên tố 
Ngược lại in ra màn hình 18 không phải là số nguyên tố

Làm đủ chức năng trên được 1 điểm

Ghi lại vào file nguyento.txt những gì đã in ra màn hình console. (1 điểm nữa)

02: Xây dựng đội hình thi đấu của đội Barcelona
2021 đội Barcelona gồm có các cầu thủ sau đây

Marc-André ter Stegen - GK
Sergiño Dest - DF
Gerard Piqué - DF
Ronald Araújo - DF
Sergio Busquets - MF
Antoine Griezmann - FW
Miralem Pjanić - MF
Martin Braithwaite - FW
Lionel Messi - FW
Ousmane Dembélé - FW
Riqui Puig - MF
Neto - GK
Clément Lenglet - DF
Pedri - MF
Francisco Trincão - FW
Jordi Alba - DF
Matheus Fernandes - MF
Sergi Roberto - DF
Frenkie de Jong - MF
Ansu Fati - FW
Samuel Umtiti - DF
Junior Firpo - DF
Yêu cầu 1 (1 điểm): Hãy tạo một 2 class: Play và Team Một class là Player gồm 3 trường:

Full Name kiểu String
Position kiểu Enum {GK, DF, MF, FW}
Num kiểu Integer, số áo từ 1 đến 22 (1 điểm)
Nếu bạn chưa học kiểu Enum thì tham khảo ở đây Java Enum Giải thích về Position (vị trí trên sân của cầu thủ):

GK: goal keeper, thủ môn
DF: defender, hậu vệ
MF: mid field, trung vệ
FW: forwarder, tiền đạo
Đội hình ra sân luôn giới hạn 11 cầu thủ, trong đó chắc chắn chỉ có 1 thủ môn (GK), 4 hậu vệ (DF), 4 trung vệ (MF), 2 tiền đạo (FW)

Yêu cầu 2 (3 điểm): Hãy xây dựng một class Team có mảng chứa tất cả các cầu thủ nói trên và một phương thức buildTeam trả về danh sách 11 cầu thủ

List<Player> buildTeam()
Hãy làm sao 11 cầu thủ trả về của phương thức buildTeam phải có đủ 1 thủ môn (GK), 4 hậu vệ (DF), 4 trung vệ (MF), 2 tiền đạo (FW). Chú ý có thể chọn ngẫu nhiên. Sau đó in ra màn hình danh sách ra sân như sau:

1 - Marc-André ter Stegen - GK

3 - Gerard Piqué - DF
16 - Jordi Alba - DF 
18 - Sergi Roberto - DF
21 - Samuel Umtiti - DF

5 - Sergio Busquets - MF
19 - Frenkie de Jong - MF
7 - Miralem Pjanić - MF
11- Riqui Puig - MF

6 - Antoine Griezmann - FW
9 - Lionel Messi - FW
Sau đó lại đặt câu hỏi "Do you want to see another option? Type Y or N"

Nếu người dùng gõ "Y' tiếp tục tạo ra một đội hình ngẫu nhiên mới theo sơ đồ 4-4-2 Nếu người dùng gõ 'N' thì thoát.

Yêu cầu 3 (1 điểm) Xây dựng đội hình ra sân theo các chiến thuật khác nhau. Trong bóng đá có mấy sơ đồ chiến thuật phổ biến:

4-4-2: 4 hậu vệ - 4 trung vệ - 2 tiền đạo
3-5-2: 3 hậu vệ - 5 trung vệ - 2 tiền đạo
4-3-3: 4 hậu vệ - 3 trung vệ - 3 tiền đạo
Hãy tạo ra hàm buildTeam có 3 tham số đầu vào, rồi sinh ngẫu nhiên danh sách 11 cầu thủ ra sân có số cầu thủ theo các vị trí bằng với 3 tham số đầu vào

List<Player> buildTeam(int defender, int midfielder, int forwarder) {

}