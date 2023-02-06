package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {

    private Long id;

    @NotEmpty
    private String loginId; //로그인ID
    @NotEmpty
    private String name; //비밀번호
    @NotEmpty
    private String password;
}
