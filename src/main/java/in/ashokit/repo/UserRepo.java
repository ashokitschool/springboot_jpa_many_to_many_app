package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
