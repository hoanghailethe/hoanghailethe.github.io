

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
//public class OpenAPIConfig {
//  @Bean
//	public OpenAPI customOpenAPI(
//			@Value("${application-description}") String appDesciption,
//			@Value("${application-version}") String appVersion) {
//
//		return new OpenAPI()
//			.info(new Info().title("BOOK REST API Document")
//			.version(appVersion)
//			.contact(new Contact().name("LMQ").email("lmq@techmaster.vn").url("https://techmaster.vn"))
//			.description(appDesciption)
//			.termsOfService("http://swagger.io/terms/")
//			.license(new License().name("Apache 2.0")
//			.url("http://springdoc.org")));
//	}

//  @Bean
//  public GroupedOpenApi bookOpenApi() {
//    String paths[] = {"/api/books/**"};
//    return GroupedOpenApi.builder().group("books").pathsToMatch(paths)
//          .build();
//  }
//
//  @Bean
//  public GroupedOpenApi contactOpenApi() {
//    String paths[] = {"/api/contacts/**"};
//    return GroupedOpenApi.builder().group("contacts").pathsToMatch(paths)
//          .build();
//  }
//}
