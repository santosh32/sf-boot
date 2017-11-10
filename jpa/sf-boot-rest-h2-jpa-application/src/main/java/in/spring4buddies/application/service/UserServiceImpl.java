package in.spring4buddies.application.service;

import in.spring4buddies.application.dao.UserDetailsRepository;
import in.spring4buddies.application.model.UserDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public List<UserDetails> getUserDetails() {
		return userDetailsRepository.findAll();
	}
}