package in.spring4buddies.application.service;

import in.spring4buddies.application.dao.UserDetailsRepository;
import in.spring4buddies.application.model.UserDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public List<UserDetails> getUserDetails() {
		return userDetailsRepository.findAll();
	}

	@Override
	public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(
			String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}