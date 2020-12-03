package greencity.message;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Message, that is used for sending emails for approving user registration.
 */
@Getter
@ToString
@AllArgsConstructor
public class UserApprovalMessage implements Serializable {
    private Long id;
    private String name;
    private String email;
    private String token;
}
