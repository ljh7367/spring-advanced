package org.example.expert.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
class PasswordEncoderTest {

    @InjectMocks
    private PasswordEncoder passwordEncoder;

    @Test
    void matches_메서드가_정상적으로_동작한다() {
        // given
        String rawPassword = "testPassword"; // 사용자의 기존 비밀번호
        String encodedPassword = passwordEncoder.encode(rawPassword); // 암호화된 비밀번호

        // when
        boolean matches = passwordEncoder.matches(rawPassword, encodedPassword); // 기존의 비밀번호가 먼저 실행되어야한다.

        // then
        assertTrue(matches); // 매칭된다면 메서드가 정상적으로 동작된다는 문구가 나타난다.
    }
}
