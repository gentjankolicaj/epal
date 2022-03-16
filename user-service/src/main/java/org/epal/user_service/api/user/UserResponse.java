package org.epal.user_service.api.user;

import lombok.Data;
import org.epal.user_service.api.AbstractResponse;
import org.epal.user_service.domain.User;

@Data
public class UserResponse extends AbstractResponse<Object, User> {
}
