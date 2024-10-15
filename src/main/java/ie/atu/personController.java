package ie.atu;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class personController {

    private  List<person> personList = new ArrayList<>();

    @GetMapping
    public List<person> getPerson(){
        return personList;
    }

    @PostMapping("/createPerson")
      public String addPerson(@RequestBody @Valid person Person)
    {
       // personList.add(Person);
        return "details added";
    }

}
