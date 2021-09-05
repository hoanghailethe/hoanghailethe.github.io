package cookies.example.HW12.Cookies;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Optional;

public class CookiesUtils {

    public static Cookie createCookie
            (
            String name, String value,
            int expire, boolean isSecure,
            boolean HttpOnly, String childrenPath,
            String parentDomain
            )
    {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(expire);
        cookie.setSecure(isSecure); //yeu cau gui len = https
        cookie.setHttpOnly(HttpOnly); //JS browser ko doc dc. chi server doc
        cookie.setPath(childrenPath);
        cookie.setDomain(parentDomain);
        return cookie;
    }

    public static Optional<String> readCookie(HttpServletRequest request, String name) {
        if(request.getCookies() == null) {
            return Optional.ofNullable(null);
        }

        return Arrays.stream(request.getCookies())
                .filter( c -> c.getName().equals(name))
                .map(Cookie::getValue)
                .findAny();
    }
}
