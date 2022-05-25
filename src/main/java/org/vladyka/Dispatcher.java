package org.vladyka;

import org.springframework.stereotype.Component;
import org.vladyka.handler.UserRequestHandler;
import org.vladyka.model.UserRequest;

import java.util.List;

@Component
public class Dispatcher {

    private final List<UserRequestHandler> handlers;

    public Dispatcher(List<UserRequestHandler> handlers) {
        this.handlers = handlers;
    }

    public boolean dispatch(UserRequest userRequest) {
        for (UserRequestHandler userRequestHandler : handlers) {
            if(userRequestHandler.isApplicable(userRequest)){
                userRequestHandler.handle(userRequest);
                return true;
            }
        }
        return false;
    }
}

