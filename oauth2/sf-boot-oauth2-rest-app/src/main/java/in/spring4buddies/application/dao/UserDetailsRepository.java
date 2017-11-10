package in.spring4buddies.application.dao;

import in.spring4buddies.application.model.UserDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

}