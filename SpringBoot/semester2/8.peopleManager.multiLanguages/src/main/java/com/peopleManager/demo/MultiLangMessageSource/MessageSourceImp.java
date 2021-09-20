package com.peopleManager.demo.MultiLangMessageSource;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;

import java.util.HashMap;
import java.util.Locale;

public class MessageSourceImp implements MessageSource {
    private HashMap<String, Message> messagesSource;

    public MessageSourceImp() {
        messagesSource = new HashMap<>();
        // Layout Elements
        //heading of html page
        messagesSource.put("demo_upload", new Message("Demo Upload File", "Ví dụ tải file"));
        //nav of html
        messagesSource.put("home", new Message("Home", "Trang chủ"));
        messagesSource.put("listJob", new Message("Job List", "Công việc"));
        messagesSource.put("eng", new Message("English", "Tiếng Anh"));
        messagesSource.put("vn", new Message("Vietnamese", "Tiếng Việt"));
        messagesSource.put("search", new Message("Search", "Tìm kiếm"));
        messagesSource.put("search_btn", new Message("Send", "Gửi"));
        messagesSource.put("footer", new Message("People are the greatest assets of great company!", "Con người là tài sản quý nhất của Doanh nghiệp"));

        //home
        messagesSource.put("heading", new Message("All people on your list: ", "Tất cả khách hàng của bạn:"));
        messagesSource.put("add_btn", new Message("Add a new person", "Thêm khách hàng"));
        messagesSource.put("del_btn", new Message("Delete", "Xóa"));
        messagesSource.put("edit_btn", new Message("Edit", "Chỉnh sửa"));
        messagesSource.put("job_tableHeading", new Message("Jobs available", "Công việc trong danh sách"));

        //job
        messagesSource.put("job_heading", new Message("All Job available ", "Danh sách công việc có sẵn"));
        messagesSource.put("job_lead", new Message("You can add a new career", "Bạn có thể thêm các công việc mới"));
        messagesSource.put("job_add_btn", new Message("Add", "Thêm"));

        //PersonREquest c - fields name in form -omg ad th:text= #message in thymeleaf LABEL
        messagesSource.put("fullName", new Message("Full Name", "Họ Tên"));
        messagesSource.put("email", new Message("Email", "Thư điện tử"));
        messagesSource.put("job", new Message("Job", "Nghề nghiệp"));
        messagesSource.put("gender", new Message("Gender", "Giới tính"));
        messagesSource.put("gender.male", new Message("Male", "Nam"));
        messagesSource.put("gender.female", new Message("Female", "Nữ"));
        messagesSource.put("birthDate", new Message("Birth date", "Ngày sinh"));
        messagesSource.put("photo", new Message("Select a photo", "Chọn ảnh"));
        messagesSource.put("submit_form_btn", new Message("Submit form", "Gửi form"));

        //Trongclass PersonRequest - message Error Validation in Form.html
        messagesSource.put("name_blank", new Message("Name field cannot be empty", "Tên bị bỏ trống"));
        messagesSource.put("name_size_between_5_30", new Message("Name must between 5 and 30", "Tên cần có độ dài từ 5 đến 30 ký tự"));
        messagesSource.put("email_blank", new Message("Email cannot be null", "Thư điện tử không được trống"));
        messagesSource.put("email.invalid", new Message("Email is invalid", "Thư điện tử không hợp lệ"));
        messagesSource.put("birthDate_blank", new Message("empty birthdate", "Ngày sinh bị bỏ trống"));
        //this is in controller exception
        messagesSource.put("photo.required", new Message("Photo is required", "Cần chọn 1 file ảnh"));
    }

    @Override
    public String getMessage(String messageCode, Object[] objects, String defaultMessage, Locale locale) {
        Message message = messagesSource.get(messageCode);
        if(message == null) return defaultMessage;

        switch (locale.getLanguage()){
            case "vn": return message.getVn();
            case "en": return message.getEng();
            default: return defaultMessage;
        }
    }

    @Override
    public String getMessage(String messageCode, Object[] objects, Locale locale) throws NoSuchMessageException {
        Message message = messagesSource.get(messageCode);
        if(message == null) return messageCode;

        switch (locale.getLanguage()){
            case "vn": return message.getVn();
            case "en": return message.getEng();
            default: return messageCode;
        }
    }

    @Override
    public String getMessage(MessageSourceResolvable messageSourceResolvable, Locale locale) throws NoSuchMessageException {
        return messageSourceResolvable.getDefaultMessage();
    }
}
