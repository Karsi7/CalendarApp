package pl.ePoint.zadania.aplikacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{ /*implements IUserService {
    @Autowired
    private UserRepository repository;

    @Transactional
    @Override
    public User registerNewUserAccount(UserDto userDto)
            throws UserAlreadyExistException {

        if (emailExists(userDto.getEmail())) {
            throw new UserAlreadyExistException(
                    "There is an account with that email address:
                            + userDto.getEmail());
        }
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setRoles(Arrays.asList("ROLE_USER"));
        return repository.save(user);
    }

    private boolean emailExists(String email) {
        return userRepository.findByEmail(email) != null;
    }*/

}
