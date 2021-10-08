package uz.pdp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Response {

    private String message;

    private boolean success;

    public Response(String message, boolean success){
        this.message = message;
        this.success = success;
    }
}
