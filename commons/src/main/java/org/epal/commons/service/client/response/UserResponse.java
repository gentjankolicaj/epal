package org.epal.commons.service.client.response;

import lombok.Data;
import org.epal.commons.http.AbstractResponse;
import org.epal.commons.service.client.model.User;

@Data
public class UserResponse extends AbstractResponse<Object, User> {
}
