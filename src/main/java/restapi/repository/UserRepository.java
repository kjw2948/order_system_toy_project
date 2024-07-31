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
    public User findById(int id) {
        Optional<User> findUser = userCrudRepository.findById(id);
        isEmpty(findUser);
        return findUser.get();
        // return userCrudRepository.findById(id).orElseThrow(() -> new RuntimeException("사용자가 없습니다");
    }

    @Transactional
    public List<User> findByGender(String gender) {
        return userCrudRepository.findByGenderAndDeletedYn(gender, false);
    }

    @Transactional
    public User updateName(int id, String name) {
        Optional<User> findUser = userCrudRepository.findById(id);
        isEmpty(findUser);
        User getUser = findUser.get();
        getUser.updateName(name);
        userCrudRepository.save(getUser);
        return getUser;
    }

    @Transactional
    public User deleteUser(int id) {
        Optional<User> findUser = userCrudRepository.findById(id);
        isEmpty(findUser);
        User getUser = findUser.get();
        userCrudRepository.delete(getUser);
        return getUser;
    }

    public void isEmpty(Optional<User> user) {
        if (user.isEmpty()) {
            throw new RuntimeException("해당 유저는 존재하지 않습니다");
        }
    }
}
