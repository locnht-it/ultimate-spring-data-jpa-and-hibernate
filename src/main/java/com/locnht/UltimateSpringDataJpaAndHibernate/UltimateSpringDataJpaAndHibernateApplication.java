package com.locnht.UltimateSpringDataJpaAndHibernate;

import com.github.javafaker.Faker;
import com.locnht.UltimateSpringDataJpaAndHibernate.models.Author;
import com.locnht.UltimateSpringDataJpaAndHibernate.models.Course;
import com.locnht.UltimateSpringDataJpaAndHibernate.models.Video;
import com.locnht.UltimateSpringDataJpaAndHibernate.repositories.AuthorRepository;
import com.locnht.UltimateSpringDataJpaAndHibernate.repositories.VideoRepository;
import com.locnht.UltimateSpringDataJpaAndHibernate.specification.AuthorSpecification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

@SpringBootApplication
public class UltimateSpringDataJpaAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(UltimateSpringDataJpaAndHibernateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository authorRepository,
		VideoRepository videoRepository
	) {
		return args -> {
//			for (int i = 0; i < 50; i++) {
//				Faker faker = new Faker();
//				var author = Author.builder()
//						.firstName(faker.name().firstName())
//						.lastName(faker.name().lastName())
//						.age(faker.number().numberBetween(19, 100))
//						.email("contact" + i + "locnht1@gmail.com")
//						.build();
//				authorRepository.save(author);
//			}

			// update author with ID = 1
//			var author = Author.builder()
//					.id(1)
//					.firstName("Loc")
//					.lastName("Ngo")
//					.age(21)
//					.email("locnht1@gmail.com")
//					.build();
//			authorRepository.save(author);

			// update author a set a.age = 22 where a.id = 1
//			authorRepository.updateAuthor(100, 1);
//
//			// update all authors by age
//			authorRepository.updateAllAuthorAges(99);

//			var video = Video.builder()
//					.name("abc")
//					.length(5)
//					.build();
//			videoRepository.save(video);

			//find by named query
//			authorRepository.findByNamedQuery(60)
//					.forEach(System.out::println);

			// update with named query
//			authorRepository.updateAllAuthorAges(12);

			Specification<Author> spec = Specification
					.where(AuthorSpecification.hasAge(24))
					.or(AuthorSpecification.firstNameLike("a"));

			authorRepository.findAll(spec).forEach(System.out::println);
		};

	}

}
