package restapi.domain;

import lombok.Getter;

@Getter
public class UserDto {
    private String name;
    private String gender;
    private boolean deletedYn;

    public UserDto(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.deletedYn = false;
    }

    public static UserDto of(User user) {
        return new UserDto(user.getName(), user.getGender());
    }
}
