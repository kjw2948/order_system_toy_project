package restapi.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import restapi.domain.User;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepository{
    private final UserCrudRepository userCrudRepository;

    @Transactional
    public User createUser(String name, String gender) {
        return userCrudRepository.save(new User(name, gender));
    }

    @Transactional
    public User findByName(String name) {
        Optional<User> findUser = userCrudRepository.findByName(name);
        isEmpty(findUser);
        return findUser.get();
    }

    @Transactional
    public List<User> findAllByGender(String gender) {
        return userCrudRepository.findAllByGender(gender);
    }

    @Transactional
    public User updateUser(int id, String name) {
        Optional<User> findUser = userCrudRepository.findById(id);
        isEmpty(findUser);
        User getUser = findUser.get();
        getUser.updateName(name);
        return getUser;
    }

    @Transactional
    public void deleteUser(int id) {
        Optional<User> findUser = userCrudRepository.findById(id);
        isEmpty(findUser);
        userCrudRepository.delete(findUser.get());
    }

    public void isEmpty(Optional<User> user) {
        if (user.isEmpty()) {
            throw new RuntimeException("해당 유저는 존재하지 않습니다");
        }
    }
}
