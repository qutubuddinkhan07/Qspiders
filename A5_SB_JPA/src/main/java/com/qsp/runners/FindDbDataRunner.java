package com.qsp.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.qsp.entities.Student;
import com.qsp.service.StudentService;

//@Component
public class FindDbDataRunner implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 10; i++) {
			Student student = studentService.findStudentByIdService(40);
			System.out.println(student);
		}
		/*-
		Hibernate: select s1_0.id,s1_0.address,s1_0.age,s1_0.name from student s1_0 where s1_0.id=?
		[2m2026-03-19T14:15:29.086+05:30[0;39m [32m INFO[0;39m [35m16044[0;39m [2m--- [A5_SB_JPA] [           main] [0;39m[36mc.q.a.ServiceLayerCentralizeLogging     [0;39m [2m:[0;39m Method executed com.qsp.serviceimpl.StudentServiceImp findStudentByIdService
		[2m2026-03-19T14:15:29.088+05:30[0;39m [33m WARN[0;39m [35m16044[0;39m [2m--- [A5_SB_JPA] [           main] [0;39m[36mc.q.a.ServiceLayerCentralizeLogging     [0;39m [2m:[0;39m Execution time com.qsp.serviceimpl.StudentServiceImp findStudentByIdService 82
		Student(id=40, name=15c06, address=04fb9, age=21)
		Student(id=40, name=15c06, address=04fb9, age=21)
		Student(id=40, name=15c06, address=04fb9, age=21)
		Student(id=40, name=15c06, address=04fb9, age=21)
		Student(id=40, name=15c06, address=04fb9, age=21)
		Student(id=40, name=15c06, address=04fb9, age=21)
		Student(id=40, name=15c06, address=04fb9, age=21)
		Student(id=40, name=15c06, address=04fb9, age=21)
		Student(id=40, name=15c06, address=04fb9, age=21)
		Student(id=40, name=15c06, address=04fb9, age=21)
		[2m2026-03-19T14:15:29.096+05:30[0;39m [32m INFO[0;39m [35m16044[0;39m [2m--- [A5_SB_JPA] [ionShutdownHook] [0;39m[36mj.LocalContainerEntityManagerFactoryBean[0;39m [2m:[0;39m Closing JPA EntityManagerFactory for persistence unit 'default'
		[2m
		 */
	}

}
