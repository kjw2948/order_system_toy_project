package restapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import restapi.domain.UserDto;
import restapi.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserDto create(String name, String gender) {
        return UserDto.of(userRepository.createUser(name, gender));
    }

    public List<UserDto> findByGender(String gender) {
        return userRepository.findByGender(gender)
                .stream()
                .map(UserDto::of)
                .collect(Collectors.toList());
    }

    public UserDto updateName(int id, String name) {
        return UserDto.of(userRepository.updateName(id, name));
    }

    public UserDto delete(int id) {
        return UserDto.of(userRepository.deleteUser(id));
    }
}
