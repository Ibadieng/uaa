package com.groupeisi.uaa;

import com.groupeisi.uaa.entities.RoleEntity;
import com.groupeisi.uaa.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class UaaApplication implements CommandLineRunner {

	private RoleRepository roleRepository;
	public static void main(String[] args) {
		SpringApplication.run(UaaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		RoleEntity roleEntity = new RoleEntity();
		roleEntity.setName("ROLE_USER");
		roleEntity = roleRepository.save(roleEntity);
		System.out.println(roleEntity.getId());


	}
}
