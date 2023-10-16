//package com.creativefusion.suruthiga.config;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import com.creativefusion.suruthiga.model.User;
//import com.creativefusion.suruthiga.repository.UserRepository;
//
//public class UserInitialization  implements CommandLineRunner{
//
//	@Override
//	private final UserRepository userrepository;
//	private final PasswordEncoder passwordencoder;
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		try {
//			if(userrepository.count()==0)
//			{
//				User user=createUser();
//				userRepository.save(user);
//			}
//		}
//		catch(Exception e)
//		{
//			log.error(msg:"Error duringuser initialization")
//		}
//	}
// private.User createUser(){
//	 return User.builder()
//			 .name(name:"Admin")
// }
//}
