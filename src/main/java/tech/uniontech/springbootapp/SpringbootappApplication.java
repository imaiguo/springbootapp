package tech.uniontech.springbootapp;

import org.springframework.context.ApplicationContext;
import java.util.Arrays;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

import tech.uniontech.springbootapp.log4j.hellolog4j;
import tech.uniontech.springbootapp.mybatis.City;
import tech.uniontech.springbootapp.mybatis.mapper.CityMapper;

@MapperScan
@SpringBootApplication
public class SpringbootappApplication implements CommandLineRunner {

	private final CityMapper cityMapper;
	
	public SpringbootappApplication(CityMapper cityMapper) {
		this.cityMapper = cityMapper;
	  }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootappApplication.class, args);

	}

	// 列举所有 创建类 和 springboot添加类
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);

			for (String beanName : beanNames) {
				beanName += beanName;
			}
			System.out.println("--list end--");
			hellolog4j hello = new hellolog4j();
			hello.printLog();
		};
	}

	@Override
	public void run(String... args) throws Exception {
		City city = this.cityMapper.findByState("cn");

		Gson json = new Gson();
		String str = json.toJson(city);
		System.out.println(str);
	}
}
