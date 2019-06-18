package com.mani.persistance.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



//for jsr310 java 8 java.time.*
//@EntityScan(
//        basePackageClasses = { SpringBootConsoleApplication.class, Jsr310JpaConverters.class }
//)
@SpringBootApplication
public class Application{

    //private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

   
    /*@Autowired
    ICustomerDAO customerRepository;*/
	
	/*@Autowired
	private CustomerRepository customerRepository;*/

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

   //@Transactional(readOnly = true)
    //@Override
    /*public void run(String... args) throws Exception {

       /* try {
			//System.out.println("DATASOURCE = " + dataSource);

			System.out.println("\n1.findAll()...");
			for (Customer customer : customerRepository.findAll()) {
			    System.out.println(customer);
			   System.out.println("entered findall");
			}

      System.out.println("\n2.findBycity(String city)...");
			for (Customer customer : customerRepository.findByCity("chennai")) {
			    System.out.println(customer);
			}

       System.out.println("\n3.findByDate(Date date)...");
			for (Customer customer : customerRepository.findByDate(sdf.parse("2017-02-12"))) {
			    System.out.println(customer);
			}

			// For Stream, need @Transactional
      System.out.println("\n4.findByEmailReturnStream(@Param(\"email\") String email)...");
			try (Stream<Customer> stream = customerRepository.findByCityReturnStream("chennai")) {
			    stream.forEach(x -> System.out.println(x));
			}

			//System.out.println("....................");
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			//Date from = sdf.parse("2017-02-15");
			//Date to = sdf.parse("2017-02-17");

			//for (Customer customer : customerRepository.findByDateBetween(from, to)) {
			//    System.out.println(customer);
			//}

			System.out.println("Done!");

			exit(0);
		} catch (Exception e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

}