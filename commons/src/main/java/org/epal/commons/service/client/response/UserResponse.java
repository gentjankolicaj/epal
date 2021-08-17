package org.epal.commons.service.client.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.epal.commons.http.AbstractResponse;
import org.epal.commons.service.client.model.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse extends AbstractResponse<Object, User> {
}
