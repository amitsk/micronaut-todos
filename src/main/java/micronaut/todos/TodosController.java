package micronaut.todos;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/todos")
public class TodosController {
    @Get(produces = MediaType.TEXT_PLAIN) //
    public String index() {
        return "Hello World"; //
    }
}
