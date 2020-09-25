package pl.ePoint.zadania.aplikacja;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    public void save(User user);
}
